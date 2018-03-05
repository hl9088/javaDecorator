package com.demo.decorator;

import com.demo.decorator.Coffee;
import com.demo.decorator.Decorator;

/**
 * ����װ������--coffee��sugar
 * @author Administrator
 */
public class DecoratorSugar extends Decorator {

	private Coffee coffee;
	
	public DecoratorSugar(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		System.out.println("Coffee�������Sugar");
		return coffee.getDescription() + "���Sugar";
	}
	
	@Override
	public double cost() {
		double s = coffee.cost();
		System.out.println( s + 1);
		return s + 1;
	}
}
