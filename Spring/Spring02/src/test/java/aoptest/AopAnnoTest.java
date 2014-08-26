package aoptest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.man.spring.aop.annotation.BookManager;

public class AopAnnoTest {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("application-annotation-config.xml");
	BookManager bm=(BookManager) context.getBean("bookManager");
	bm.getBook();
}
}
