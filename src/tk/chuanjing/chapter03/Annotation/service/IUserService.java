package tk.chuanjing.chapter03.Annotation.service;

import tk.chuanjing.chapter03.Annotation.domain.User;

/**
 * @author ChuanJing
 * @date 2017年7月14日 上午12:49:05
 * @version 1.0
 */
public interface IUserService {

	User login(String username, String password);

}
