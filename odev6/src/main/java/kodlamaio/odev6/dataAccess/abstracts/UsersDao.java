package kodlamaio.odev6.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.odev6.entites.concretes.Users;

public interface UsersDao  extends JpaRepository<Users, Integer>{

	//İnterface interfacesi implement edebilir. JPA repository verdiğin veri tipi için 
	//Entity için yani Users için primary key alanını ver ben ona göre sorgularımı hazırlayayım diyor.
	//Users clasımla ilgili  ilgili CRUD operasyonlarınız hazır.
	
	//JPA repositort hangi tabloya hangi ID tipiyle sorguların hazırlandığını söylemiş olduk!!!
	
}
