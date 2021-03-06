package pl.michalek.kontenery.controllers;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import pl.michalek.kontenery.domain.User;
import pl.michalek.kontenery.domain.UserRole;
import pl.michalek.kontenery.service.AddressService;
import pl.michalek.kontenery.service.PeselService;
import pl.michalek.kontenery.service.UserService;
import pl.michalek.kontenery.validators.UserValidator;

@Controller
@SessionAttributes
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	PeselService peselService;
	
	@Autowired
	AddressService addressService;
	
	UserValidator userValidator = new UserValidator();
	
	@RequestMapping("/users")
	public String listUsers(Map<String, Object> map, HttpServletRequest request) {
	   
		int userId = ServletRequestUtils.getIntParameter(request, "userId" , -1);
		   
		if (userId > 0) {
			User user = userService.getUser(userId);
			user.setPassword("");
			user.setAddress(addressService.getAddress(userService.getUser(userId).getAddress().getId()));
			map.put("selectedAddress", userService.getUser(userId).getAddress().getId());
			map.put("user", user);
		}
	    else
		   map.put("user", new User());   
	    
		map.put("addressesList", addressService.listAddress());
		map.put("userRoleList", userService.listUserRole());
		map.put("userList", userService.listUser());

	    return "user";
	}
	
	@RequestMapping (value = "/addUser", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("user") User user, BindingResult result, HttpServletRequest request, 
			Map<String, Object> map, @RequestParam("picture") MultipartFile file) throws Exception {
		
		userValidator.validate(user, result);
		
		if (result.getErrorCount()==0) {

			if (user.getId()==0) {
				if (user.getPesel().getId()==0)
					peselService.addPesel(user.getPesel());
				if (user.getAddress().getId() > 0)
				   user.setAddress(addressService.getAddress(user.getAddress().getId()));
				if (file.getBytes()!=null)
				  user.setPicture(file.getBytes());
				userService.addUser(user);
			}	
			else {
				peselService.editPesel(user.getPesel());
//		    	if (user.getPicture() == null)
//	    		if (userService.getUser(user.getId()).getPicture()!=null)
//	    			user.setPicture(userService.getUser(user.getId()).getPicture());
	    	   if (file.getBytes()!=null)
				   user.setPicture(file.getBytes());
				userService.editUser(user);
			}
/*		
			System.out.println("First Name: " + user.getFirstname() + " Last Name: " + user.getLastname() 
							+ " Tel.: " + user.getTelephone() + " Email: " + user.getEmail());
			return "redirect:users.html";
*/
			return "redirect:users.html";
		}
		
		map.put("userRoleList",userService.listUserRole());
		map.put("addressesList", addressService.listAddress());
		map.put("userList", userService.listUser());
		
		return "user";
	}
	
	@RequestMapping("/delete/{userId}")
	public String deleteUser(@PathVariable("userId") Integer userId) {
	    userService.removeUser(userId);

	    return "redirect:/users.html";
	}
	
	@RequestMapping("/userRole")
	public ModelAndView showUserRole() {
	     
	  	return new ModelAndView("userRole", "userRole", new UserRole());
	}
	   
	@RequestMapping(value = "/addUserRole", method = RequestMethod.POST)
	public String addUserRole(@ModelAttribute("userRole") UserRole userRole, BindingResult result, HttpServletRequest request, Map<String, Object> map) {
				
		userService.addUserRole(userRole);
			   
		return "redirect:users.html";
	}
	
	@RequestMapping(value = "/users/picture.html")
	public void pobierzPicture(HttpServletRequest request, HttpServletResponse response) {
		
	int userId = ServletRequestUtils.getIntParameter(request, "userId", -1);
		
   	if (userId<1) return; 
   	
       User user = userService.getUser(userId);
       
       if (user.getPicture() == null)
       	{
       	 return;
       	}
         
       try {
			OutputStream o = response.getOutputStream();
			response.setCharacterEncoding("UTF-8");
			response.setContentType("image/jpg");
			response.setHeader("Content-Disposition", "inline; filename=picture.jpg");
			if (user.getPicture() != null) {
				o.write(user.getPicture());
			}
			o.flush();
			o.close();
		} catch (IOException e) {	}
   }

//	@RequestMapping("/users")
//	public ModelAndView showContacts() {
//		
//		return new ModelAndView("user", "command", new User());
//	}
	
}