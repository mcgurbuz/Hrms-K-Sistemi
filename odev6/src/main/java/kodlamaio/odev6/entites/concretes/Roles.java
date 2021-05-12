package kodlamaio.odev6.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Roles {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="rolename")
	private String rolename;

	public Roles(int id, String rolename) {
		super();
		this.id = id;
		this.rolename = rolename;
	}
	
	public Roles() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	

}
