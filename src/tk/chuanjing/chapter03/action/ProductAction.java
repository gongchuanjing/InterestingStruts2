package tk.chuanjing.chapter03.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import tk.chuanjing.chapter03.domain.Product;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @author ChuanJing
 * @date 2017年7月13日 上午4:26:02
 * @version 1.0
 */
public class ProductAction {

	public String showProduct() {
		// 1.将数据得到List<Product>
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("电视机");
		p1.setPrice(2000);
		p1.setReleaseDate(new Date());

		Product p2 = new Product();
		p2.setId(2);
		p2.setName("电冰箱");
		p2.setPrice(3000);
		p2.setReleaseDate(new Date());

		List<Product> ps = new ArrayList<Product>();
		ps.add(p1);
		ps.add(p2);
		
		// 2.将List<Product>压入到valueStack栈顶
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		valueStack.set("ps", ps);
		
		return "success";
	}
}
