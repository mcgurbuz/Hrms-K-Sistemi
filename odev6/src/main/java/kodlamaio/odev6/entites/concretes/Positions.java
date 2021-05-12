package kodlamaio.odev6.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="positions")
public class Positions {
	
	//Bu class postgresql tarafında oluşturulan positions tablosunu tutmaktadır.
	
	//Anotayon bir class'ın veya bir metodun çalışma anında bilgisni toplayan yapı. C#'da karşılığı attribute
	//angular karşılığı decorator. 
	//Hibernate yerine Jpa alt yapısını kullanabilmek adına javax.persistance import edildi.
	//Entity anotasyonu ile spring framework'e bu class'ımızın Entity katmanına karşılık geldiğini söylüyoruz.	
	//Entity demek bu class'a veritabanı nesnesi olduğunu söylemek demek. Veritabanında bu class'ın hangi 
	//tabloya karşılık geleceğini söylemek adına Table anotasyonu kullanıyoruz. Class'ımın özelliklerinin 
	//veritabanında kullandığım tablonun hangi kolonuna karşılık geldiğini söylemek adına Column anotasyonu
	//kullanılır. Kolon isimleri tabloda nasılsa burada Column anotasyonu içersinde birebir şekilde girmek önemli
	//Id anotasyonu tabloda ana işlemlerin yapılacağı ve diğer tablolarla haberleşmeyi sağlayan primarykey olan
	//id kolonuna verilir. Bu kolon sayesinde diğer tablolarla bağlantı sağlanır. Github readme dosyasının içerisinde
	//bu bağlantıların ve haberleşmelerin nasıl gerçekleştiği detaylı bir şekilde açıklanmıştır. GeneratedValue 
	//anotasyonu postgresql tarafında id kolonun auto increment olduğunu yani  tablouya her bir veri eklenmesi 
	//id'nin otomatikman birer birer artacağını söylüyor.
			
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="positionname")
	private String positionName;
	
	
	@Column(name="nickname")
	private String nickname;


	public Positions(int id, String positionName, String nickname) {
		super();
		this.id = id;
		this.positionName = positionName;
		this.nickname = nickname;
	}
	
	public Positions() {
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
