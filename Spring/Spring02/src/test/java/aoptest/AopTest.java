package aoptest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.man.spring.aop.BookManager;

public class AopTest {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("application-config.xml");
	BookManager bm=(BookManager) context.getBean("bookManager");
	bm.addBook();
}
}
