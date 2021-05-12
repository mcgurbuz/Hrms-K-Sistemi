package kodlamaio.odev6.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Users {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String eposta;
	@Column(name="password")
	private int password;
	
	@Column(name="activity")
	private boolean activity;
	
	
	public Users(int id, String eposta, int password, boolean activity) {
		super();
		this.id = id;
		this.eposta = eposta;
		this.password = password;
		this.activity = activity;
	}
	
	public Users() {
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public boolean isActivity() {
		return activity;
	}

	public void setActivity(boolean activity) {
		this.activity = activity;
	}
	
	
	
	
	

}
