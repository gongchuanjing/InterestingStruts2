package tk.chuanjing.chapter03.Annotation.domain;

public class Product {

	private String pid;
	private String pname;
//	private int count;
	private String pdate;
	private double market_price;
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public double getMarket_price() {
		return market_price;
	}
	public void setMarket_price(double market_price) {
		this.market_price = market_price;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdate=" + pdate
				+ ", market_price=" + market_price + "]";
	}
}
