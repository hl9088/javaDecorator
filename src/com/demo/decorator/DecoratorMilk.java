package com.demo.decorator;

/**
 * ����װ������--coffee��milk
 * @author Administrator
 */
public class DecoratorMilk extends Decorator {

	private Coffee coffee;
	
	public DecoratorMilk(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		System.out.println("Coffee�������milk");
		return coffee.getDescription() + "���milk";
	}
	
	@Override
	public double cost() {
		double s = coffee.cost();
		System.out.println( s + 10);
		return s + 10;
	}
}
