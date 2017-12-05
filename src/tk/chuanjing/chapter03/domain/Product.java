package tk.chuanjing.chapter03.domain;

import java.util.Date;

//@JsonIgnoreProperties({ "id", "releaseDate" })
//@JsonFilter("productFilter")
public class Product {

//	@JsonIgnore
	private int id;
	private String name;
	private double price;
//	@JsonIgnore
	private Date releaseDate;// 出生日期

//	@JSON(serialize = false)
	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
