package kodlamaio.odev6.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.odev6.entites.concretes.Roles;

public interface RolesDao extends JpaRepository<Roles, Integer> {

	
	//İnterface interfacesi implement edebilir. JPA repository verdiğin veri tipi için 
	//Entity için yani Roles için primary key alanını ver ben ona göre sorgularımı hazırlayayım diyor.
	//Roles clasımla ilgili  ilgili CRUD operasyonlarınız hazır.
	
	//JPA repositort hangi tabloya hangi ID tipiyle sorguların hazırlandığını söylemiş olduk!!!
}
