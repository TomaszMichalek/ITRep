package pl.michalek.kontenery.dao;

import java.util.List;

import pl.michalek.kontenery.domain.Pesel;

public interface PeselDAO {

	public void addPesel(Pesel pesel);
	public List<Pesel> listPesel();
	public void removePesel (int id);
	public Pesel getPesel(int id);
	public void editPesel(Pesel pesel);
}