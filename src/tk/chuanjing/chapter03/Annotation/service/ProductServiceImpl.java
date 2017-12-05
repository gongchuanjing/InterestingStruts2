package tk.chuanjing.chapter03.Annotation.service;

import java.util.List;

import tk.chuanjing.chapter03.Annotation.dao.IProductDAO;
import tk.chuanjing.chapter03.Annotation.dao.ProductDAOImpl;
import tk.chuanjing.chapter03.Annotation.domain.Product;

/**
 * @author ChuanJing
 * @date 2017年7月14日 上午1:45:19
 * @version 1.0
 */
public class ProductServiceImpl implements IProductService {

	@Override
	public List<Product> findAll() {
		IProductDAO pd = new ProductDAOImpl();
		return pd.findAll();
	}

}
