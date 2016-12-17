package pl.michalek.kontenery.dao;

import java.util.List;

import pl.michalek.kontenery.domain.Address;

public interface AddressDAO {

	public void addAddress(Address address);
	public List<Address> listAddress();
	public void removeAddress (int id);
	public Address getAddress(int id);
	public void editAddress(Address address);
}