package SPRINGMVC1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SPRINGMVC1.dao.UserDao;
import SPRINGMVC1.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int createUser(User user) {
		return (int)this.userDao.saveUser(user);
	}
}
