package pl.michalek.kontenery.utils;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.michalek.kontenery.domain.UserRole;
import pl.michalek.kontenery.service.UserService;

public class UserRoleListConverter implements Converter<String[], Set<UserRole>> {

	@Autowired
	UserService userService;
	
	@Override
	public Set<UserRole> convert(String[] source) {
		
		Set<UserRole> userRoleList = new HashSet<UserRole>(0);
		
		for (int i=0; i < source.length; i++)
		{
			//System.out.println("role id: " + source[i]);
			userRoleList.add(userService.getUserRole(Integer.parseInt(source[i])));
		}
		
		return userRoleList;
	}
}