package pl.michalek.kontenery.service;

import java.util.List;

import pl.michalek.kontenery.domain.Address;

public interface AddressService {

	public void addAddress(Address address);
	public void editAddress(Address address);
	public List<Address> listAddress();
	public void removeAddress (int id);
	public Address getAddress(int id);
}