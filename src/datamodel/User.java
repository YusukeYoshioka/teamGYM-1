package datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id") // specify the column name. Without it, it will use method name
	private Integer id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
		

	public User()
	{
	}

	public User(Integer id, String name, String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public User(String name, String email)
	{
		this.name = name;
		this.email = email;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User: " + this.id + ", " + this.name + ", " + this.email;
	}
}