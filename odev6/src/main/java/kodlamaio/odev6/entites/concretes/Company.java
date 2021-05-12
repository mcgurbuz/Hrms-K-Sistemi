package kodlamaio.odev6.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="companyname")
	private String companyName;
	
	@Column(name="website")
	private String websiteName;
	
	@Column(name="phone")
	private int phonenumber;
	
	@Column(name="user_id")
	private int userid;
	
	@Column(name="position_id")
	private String positionId;


	public Company(int id, String companyName, String websiteName, int phonenumber, int userid,String positionId) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.websiteName = websiteName;
		this.phonenumber = phonenumber;
		this.userid = userid;
		this.positionId = positionId;
	}
	
	public Company() {
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsiteName() {
		return websiteName;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getPositionId() {
		return positionId;
	}

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	
	
	
	

}
