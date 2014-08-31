package hibernateTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.man.spring.hibernate.entity.User;
import com.man.spring.hibernate.service.UserService;

public class hibernateTest {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("application-config.xml");
		UserService us=(UserService) context.getBean("userService");
		
		User user=new User();
		user.setName("xiaoxiao");
		user.setAge(25);
		
		us.addUser(user);
	}
}
