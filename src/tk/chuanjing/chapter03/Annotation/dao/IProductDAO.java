package tk.chuanjing.chapter03.Annotation.dao;

import java.util.List;

import tk.chuanjing.chapter03.Annotation.domain.Product;

/**
 * @author ChuanJing
 * @date 2017年7月14日 上午1:44:18
 * @version 1.0
 */
public interface IProductDAO {

	List<Product> findAll();

}
