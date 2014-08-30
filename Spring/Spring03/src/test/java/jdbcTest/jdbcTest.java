package jdbcTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.man.spring.jdbc.entity.User;
import com.man.spring.jdbc.service.UserService;

public class jdbcTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("application-config.xml");
		UserService us=(UserService) context.getBean("userService");
		addUserTest(us);
		//banchUpdateUsers(us);
	}

	private static void addUserTest(UserService us) {
		User user=new User();
		user.setName("xiaoming");
		user.setAge(15);
		user.setCreate_time(new Date());
		us.addUser(user);
	}
	
	private static void banchUpdateUsers(UserService us){
		
		User user1=new User();
		user1.setName("xiaohua");
		user1.setAge(25);
		user1.setCreate_time(new Date());
		
		User user2=new User();
		user2.setName("xx");
		user2.setAge(24);
		user2.setCreate_time(new Date());
		
		List<User> list=new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		
		us.banchAdd(list);
		
		
	}
}
