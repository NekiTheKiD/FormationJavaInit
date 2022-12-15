package TP2.Repository;

import java.util.List;

import TP2.Models.Salarie;

public interface ISalarie {
	
	//Pseudo classe abstraite qui ne peut contenir que des méthodes abstraites
	
	public List<Salarie> getAll();
	public void update(Salarie s);
	public void insert(Salarie s);
	public void delete(Salarie s);

}
