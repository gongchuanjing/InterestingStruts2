package tk.chuanjing.chapter03.Annotation.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import tk.chuanjing.chapter03.Annotation.domain.Product;
import tk.chuanjing.chapter03.Annotation.domain.Result;
import tk.chuanjing.chapter03.Annotation.service.IProductService;
import tk.chuanjing.chapter03.Annotation.service.ProductServiceImpl;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ChuanJing
 * @date 2017年7月14日 上午12:45:46
 * @version 1.0
 */

@Namespace("/")
//@ParentPackage("struts-default")
@ParentPackage("chapter03")
public class ProductAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Action(value="product_showProduct", interceptorRefs = { @InterceptorRef("AnnotationMyStack") } )
	public void showProduct(){
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		
		// 调用service查询所有商品
		IProductService ps = new ProductServiceImpl();
		List<Product> list = ps.findAll();
		
		Result<Product> result = new Result<Product>();
//		if(list != null & list.size() > 0){
			result.setType(1);
			result.setContent(list);
//		} else {
//			result.setType(0);
//			result.setMessage("服务器上没有商品！");
//		}
		
		// 将ps转换成json
		String jsonString = JSONArray.toJSONString(result);
		
		// 通过response将json写回到浏览器
		try {
			response.getWriter().write(jsonString);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
