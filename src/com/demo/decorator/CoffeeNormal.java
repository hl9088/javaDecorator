package com.demo.decorator;

/**
 * 定义正常Coffee --- 具体被装饰的对象类
 * @author Administrator
 */
public class CoffeeNormal implements Coffee {

	public String description = "这是普通的Coffee";
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public double cost() {
		System.out.println("这是正常的Coffee，无添加，价格为100元");
		return 100;
	}
}
