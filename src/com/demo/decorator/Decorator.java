package com.demo.decorator;

/**
 * 定义装饰者
 * @author Administrator
 */
public abstract class Decorator implements Coffee {

	public abstract String getDescription();  
	
	public abstract double cost();
}
