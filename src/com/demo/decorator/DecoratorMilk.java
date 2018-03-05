package com.demo.decorator;

/**
 * 定义装饰内容--coffee加milk
 * @author Administrator
 */
public class DecoratorMilk extends Decorator {

	private Coffee coffee;
	
	public DecoratorMilk(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		System.out.println("Coffee里面添加milk");
		return coffee.getDescription() + "添加milk";
	}
	
	@Override
	public double cost() {
		double s = coffee.cost();
		System.out.println( s + 10);
		return s + 10;
	}
}
