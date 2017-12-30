package main.java.cn.et.hibernate.dao;

/**
 * Food entity. @author MyEclipse Persistence Tools
 */

public class Food implements java.io.Serializable {

	// Fields

	private Integer foodid;
	private String foodname;
	private Double price;
	private String desce;
	private String imageurl;

	// Constructors

	/** default constructor */
	public Food() {
	}

	/** minimal constructor */
	public Food(Integer foodid) {
		this.foodid = foodid;
	}

	/** full constructor */
	public Food(Integer foodid, String foodname, Double price, String desce,
			String imageurl) {
		this.foodid = foodid;
		this.foodname = foodname;
		this.price = price;
		this.desce = desce;
		this.imageurl = imageurl;
	}

	// Property accessors

	public Integer getFoodid() {
		return this.foodid;
	}

	public void setFoodid(Integer foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return this.foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDesce() {
		return this.desce;
	}

	public void setDesce(String desce) {
		this.desce = desce;
	}

	public String getImageurl() {
		return this.imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

}