package tk.chuanjing.chapter03.Annotation.service;

import tk.chuanjing.chapter03.Annotation.dao.IUserDAO;
import tk.chuanjing.chapter03.Annotation.dao.UserDaoImpl;
import tk.chuanjing.chapter03.Annotation.domain.User;

/**
 * @author ChuanJing
 * @date 2017年7月14日 上午12:49:38
 * @version 1.0
 */
public class UserServiceImpl implements IUserService {

	@Override
	public User login(String username, String password) {
		IUserDAO ud = new UserDaoImpl();
		return ud.findUserByUserNameAndPassword(username, password);
	}

}
