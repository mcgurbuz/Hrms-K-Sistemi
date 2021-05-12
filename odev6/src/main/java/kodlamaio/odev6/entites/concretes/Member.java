package kodlamaio.odev6.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class Member {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surName;
	
	@Column(name="tckno")
	private int tckNo;
	
	@Column(name="birthday")
	private String birthdate;
	
	@Column(name="rol_id")
	private int rol_id;
	
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="position_id")
	private int position_id;

	public Member(int id, String name, String surName, int tckNo, String birthdate, int rol_id, int user_id,
			int position_id) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.tckNo = tckNo;
		this.birthdate = birthdate;
		this.rol_id = rol_id;
		this.user_id = user_id;
		this.position_id = position_id;
	}
	
	public Member() {
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getTckNo() {
		return tckNo;
	}

	public void setTckNo(int tckNo) {
		this.tckNo = tckNo;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public int getRol_id() {
		return rol_id;
	}

	public void setRol_id(int rol_id) {
		this.rol_id = rol_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getPosition_id() {
		return position_id;
	}

	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}
	
	
	
	

}
