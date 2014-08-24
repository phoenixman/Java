package com.man.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * 
 * spring自带的注解
 * @autowired注解(按类型注入)
 * 1、可以用在属性声明处，也快用在setter方法处
 * 2、可以用在构造器上
 * 3、当不确定是否存在所需注入的bean时，可以设置required=false
 * 4、当有多个候选bean时候，可以用@Qualifier("office1")指定用哪个bean进行注入
 * 5、@Autowired 可以对成员变量、方法以及构造函数进行注释
 * 6、@Qualifier 的标注对象是成员变量、方法入参、构造函数入参，和@Aotowired结合使用，起补充作用
 * 	
 * JSR250注解
 * @Resource（默认按byName注入）
 * 1、可以指定使用哪种注入方式@Resource(name=""),@Resource(type=xx.class)
 * @PostConstruct（初始化对象时是调用,可以标注在多个方法上）
 * @PreDestroy（销毁对象时调用，可以标注在多个方法上）
 * @Component可以让类自动变成spring的受控对象，去掉xml中bean的配置，可以指定bean的名字@Component("boss")
 * @Service,@Repository,@Controller标注的类分别对应mvc中的Service类，Dao类和Controller类
 * @Scope定义bean的作用范围默认都是单例的，还可以定义为原型(prototype,每次重新创建一个bean)
 * 
 * @author phoenix
 * 2014年8月24日
 */
@Component("boss")
@Scope("prototype")
public class Boss {
	
	@Autowired(required=false)
	private Car car;
	//@Resource(name="office1")
	@Resource
	private Office office;
	
	public Boss(){
		
	}
	public Boss(Car car,Office office) {
		this.car = car;
		this.office = office;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Office getOffice() {
		return office;
	}
	/*@Autowired
	public void setOffice(@Qualifier("office1")Office office) {
		this.office = office;
	}*/
	@Override
	public String toString() {
		return "boss car=("+car+") office=("+office+")";
	}
	
	@PostConstruct
	public void init(){
		System.out.println("inited "+Boss.class.getSimpleName());
	}
	
	@PostConstruct
	public void init2(){
		System.out.println("inited2 "+Boss.class.getSimpleName());
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroyed "+Boss.class.getSimpleName());
	}
	@PreDestroy
	public void destroy2(){
		System.out.println("destroyed2 "+Boss.class.getSimpleName());
	}
}
