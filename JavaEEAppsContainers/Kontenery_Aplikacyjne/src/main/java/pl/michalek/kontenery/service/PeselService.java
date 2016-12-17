package pl.michalek.kontenery.service;

import java.util.List;

import pl.michalek.kontenery.domain.Pesel;

public interface PeselService {

	public void addPesel(Pesel pesel);
	public void editPesel(Pesel pesel);
	public List<Pesel> listPesel();
	public void removePesel (int id);
	public Pesel getPesel(int id);
}