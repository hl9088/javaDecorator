package com.demo.decorator;

/**
 * ����װ����
 * @author Administrator
 */
public abstract class Decorator implements Coffee {

	public abstract String getDescription();  
	
	public abstract double cost();
}
