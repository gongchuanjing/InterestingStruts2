package tk.chuanjing.chapter03.Annotation.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import tk.chuanjing.chapter03.Annotation.domain.User;
import tk.chuanjing.chapter03.Annotation.utils.JDBCUtilsC3P0;

/**
 * @author ChuanJing
 * @date 2017年7月14日 上午1:18:03
 * @version 1.0
 */
public class UserDaoImpl implements IUserDAO {

	@Override
	public User findUserByUserNameAndPassword(String username, String password) {
		QueryRunner qr = new QueryRunner(JDBCUtilsC3P0.getDataSource());
		String sql = "select * from users where username=? and password=?";
		Object[] params = {username, password};
		
		try {
			return qr.query(sql, new BeanHandler<User>(User.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
