package mybatis_spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jxliu.ms.mapper.UserMapper;
import com.jxliu.ms.pojo.User;

public class UserMapperTest {

	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testGetUserById() {
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		User user = userMapper.getUserById(10);
		System.out.println(user);
	}
}
