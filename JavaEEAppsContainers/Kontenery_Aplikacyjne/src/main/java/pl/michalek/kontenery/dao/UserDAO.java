package pl.michalek.kontenery.dao;

import java.util.List;

import pl.michalek.kontenery.domain.User;
import pl.michalek.kontenery.domain.UserRole;

public interface UserDAO {

	public void addUser(User user);
	public List<User> listUser();
	public void removeUser(int id);
	public User getUser(int id);
	public void editUser(User user);
	public User findByLogin(String login);
	
	public void addRole(UserRole userRole);
	public List<UserRole> listUserRole();
	public void removeUserRole(int id);
	public UserRole getUserRole(int id);
	public UserRole findRoleByName(String role);
}