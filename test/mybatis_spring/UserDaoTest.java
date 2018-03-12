package mybatis_spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jxliu.ms.dao.UserDao;
import com.jxliu.ms.pojo.User;

public class UserDaoTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	
	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.getUserById(0);
		System.out.println(user);
	}


}
