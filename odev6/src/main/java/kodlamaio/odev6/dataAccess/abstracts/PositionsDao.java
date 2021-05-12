package kodlamaio.odev6.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.odev6.entites.concretes.Positions;

public interface PositionsDao extends JpaRepository<Positions, Integer>{
	
	//İnterface interfacesi implement edebilir. JPA repository verdiğin veri tipi için 
	//Entity için yani Positions için primary key alanını ver ben ona göre sorgularımı hazırlayayım diyor.
	//Positions clasımla ilgili  ilgili CRUD operasyonlarınız hazır.
	
	//JPA repositort hangi tabloya hangi ID tipiyle sorguların hazırlandığını söylemiş olduk!!!
	
	//Bir interface başka bir interface'i implemente eder bu unutulmasın.
	//Burada JpaRepository verdiğimiz veritipi için ki burada verdiğimiz
	//veritipi Entity anotasyonuna sahip Position oluyor. positions tablosu
	//için primarykey'in veritipi ne ise onu vermemiz lazım ki JpaRepository
	//bizim için sorgularımızı hazırlasın. Şuan için positions tablosu ile ilgili
	//Crud operasyonlar hazır. PositionDao yerine PositionRepository olarak
	//da görebilirsin bu interface'i aynı şey.
	//Kısacası JpaRepository'de ilk parametre hangi tabloya sorguları hazırladığımı
	//söylüyor , 2. parametre ise bu sorguların hangi id ile sorguların hazırlanması 
	//gerektiğini söylüyor.

}
