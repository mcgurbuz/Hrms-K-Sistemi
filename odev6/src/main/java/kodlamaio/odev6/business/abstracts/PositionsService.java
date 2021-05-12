package kodlamaio.odev6.business.abstracts;

import java.util.List;

import kodlamaio.odev6.entites.concretes.Positions;

public interface PositionsService {
	
	List<Positions> getAll();
	//Bu interface positions tablosuna ait sorguları yazacağım ortak metodları bulundurmaktadır.
	//Bu paketin altında ki diğer interfacelerde başka tablolara ait sorguları yazacağım ortak
	//metodları bulunduracak.

}
