package datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Record {
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id") // specify the column name. Without it, it will use method name
	private Integer id;

	@Column(name = "game33")
	private Integer game33;
	
	@Column( name = "game44")
	private Integer game44;
	
	@Column(name = "game55")
	private Integer game55;
	
	@Column(name = "win33")
	private Integer win33;
	
	@Column(name = "lose33")
	private Integer lose33;
	
	@Column(name = "rate33")
	private Double rate33;
	
	@Column(name = "win44")
	private Integer win44;
	
	@Column(name = "lose44")
	private Integer lose44;
	
	@Column(name = "rate44")
	private Double rate44;
	
	@Column(name = "win55")
	private Integer win55;
	
	@Column(name = "lose55")
	private Integer lose55;
	
	@Column(name = "rate55")
	private Double rate55;

	public Record()
	{
	}

	public Record(Integer id, String name, String email)
	{
		this.id = id;
		this.win33 = 0;
		this.lose33 = 0;
		this.rate33 = 0.0;
		this.win44 = 0;
		this.lose44 = 0;
		this.rate44 = 0.0;
		this.win55 = 0;
		this.lose55 = 0;
		this.rate55 = 0.0;
	}

	public Record(String name, String email)
	{
		this.win33 = 0;
		this.lose33 = 0;
		this.rate33 = 0.0;
		this.win44 = 0;
		this.lose44 = 0;
		this.rate44 = 0.0;
		this.win55 = 0;
		this.lose55 = 0;
		this.rate55 = 0.0;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getWin33() {
		return win33;
	}

	public void setWin33(Integer win) {
		this.win33 = win;
	}
	
	public void addWin33()
	{
		this.win33 = this.win33++;
	}
	
	public Integer getLose33()
	{
		return lose33;
	}

	public void setLose33(Integer Lose)
	{
		this.lose33 = Lose;
	}
	
	public void addLose33()
	{
		this.lose33 = this.lose33++;
	}
		
	public Double getRate33() {
		return rate33;
	}

	public void setRate33() {
		this.rate33 = calRate(this.win33, this.game33);
	}
	
	public Integer getWin44() {
		return win44;
	}

	public void setWin44(Integer win) {
		this.win44 = win;
	}
	
	public void addWin44()
	{
		this.win44 = this.win44++;
	}
	
	public Integer getLose44()
	{
		return lose44;
	}

	public void setLose44(Integer Lose)
	{
		this.lose44 = Lose;
	}
	
	public void addLose44()
	{
		this.lose44 = this.lose44++;
	}
		
	public Double getRate44() {
		return rate44;
	}

	public void setRate44() {
		this.rate44 = calRate(this.win44, this.game44);
	}
	
	public Integer getWin55() {
		return win55;
	}

	public void setWin55(Integer win) {
		this.win55 = win;
	}
	
	public void addWin()
	{
		this.win55 = this.win55++;
	}
	
	public Integer getLose55()
	{
		return lose55;
	}

	public void setLose55(Integer Lose)
	{
		this.lose55 = Lose;
	}
	
	public void addLose55()
	{
		this.lose55 = this.lose55++;
	}
		
	public Double getRate55()
	{
		return rate55;
	}

	public void setRate55() {
		this.rate55 = calRate(this.win55, this.game55);
	}
	
	public Double calRate(Integer win, Integer game)
	{
		Double nWin = (double)win;
		Double nGame = (double)game;
		return nWin/nGame;
		
	}

	

	@Override
	public String toString() {
		return "User: " + this.id + ", " + this.game33 + ", " + this.win33 + ", " + this.lose33 + ", " + this.game33;
	}
}