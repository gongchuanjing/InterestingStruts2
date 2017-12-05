package tk.chuanjing.chapter03.Annotation.dao;

import tk.chuanjing.chapter03.Annotation.domain.User;

/**
 * @author ChuanJing
 * @date 2017年7月14日 上午12:48:28
 * @version 1.0
 */
public interface IUserDAO {

	User findUserByUserNameAndPassword(String username, String password);

}
