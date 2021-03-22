package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friendlist")
public class Friend
{
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id") // specify the column name. Without it, it will use method name
	private Integer id;

	@Column(name = "userID")
	private Integer userID;
	
	@Column(name = "friendID")
	private Integer friendID;
	
		

	public Friend()
	{
	}

	public Friend(Integer newid, Integer uID, Integer fID)
	{
		this.id = newid;
		this.userID = uID;
		this.friendID = fID;
	}

	public Friend(Integer uID, Integer fID)
	{
		this.userID = uID;
		this.friendID = fID;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserID() {
		return this.userID;
	}

	public void setUserID(Integer uID) {
		this.userID = uID;
	}

	public Integer getFriendID() {
		return this.friendID;
	}

	public void setFriendID(Integer fID)
	{
		this.friendID = fID;
	}


	@Override
	public String toString() {
		return "User: " + this.id + ", " + this.userID + ", " + this.friendID;
	}
	

}
