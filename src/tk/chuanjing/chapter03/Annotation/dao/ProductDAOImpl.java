package tk.chuanjing.chapter03.Annotation.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import tk.chuanjing.chapter03.Annotation.domain.Product;
import tk.chuanjing.chapter03.Annotation.utils.JDBCUtilsC3P0;

/**
 * @author ChuanJing
 * @date 2017年7月14日 上午1:44:44
 * @version 1.0
 */
public class ProductDAOImpl implements IProductDAO {

	@Override
	public List<Product> findAll() {
		QueryRunner qr = new QueryRunner(JDBCUtilsC3P0.getDataSource());
		String sql = "select * from product";
		try {
			return qr.query(sql, new BeanListHandler<Product>(Product.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
