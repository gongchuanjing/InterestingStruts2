package tk.chuanjing.chapter02.action;

import java.util.ArrayList;
import java.util.List;

import tk.chuanjing.chapter02.domain.Product;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ChuanJing
 * @date 2017年7月10日 下午5:34:49
 * @version 1.0
 */
public class ProductAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private List<Product> ps;

	public List<Product> getPs() {
		return ps;
	}

	public void setPs(List<Product> ps) {
		this.ps = ps;
	}

	public String showProduct() {
//		List<Product> ps = new ArrayList<Product>();
		ps = new ArrayList<Product>();// 得到List<Product>
		
		Product p1 = new Product("冰箱", 2600, 100);
		Product p2 = new Product("空调", 1600, 50);
		
		ps.add(p1);
		ps.add(p2);
		
		// ps保存到valueStack中
//		ValueStack valueStack = ActionContext.getContext().getValueStack();
//		valueStack.set("ps", ps);
		
		return "success";
	}
	
	public String addProduct() {
		System.out.println("addProduct…………");
		return null;
	}
}
