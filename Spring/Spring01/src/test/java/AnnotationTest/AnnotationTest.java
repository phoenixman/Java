package AnnotationTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.man.spring.annotation.Boss;

public class AnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("application-config.xml");
		Boss boss=(Boss) context.getBean("boss");
		System.out.println(boss);
		
	}
}
