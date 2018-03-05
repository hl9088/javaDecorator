package com.demo.decorator;

import com.demo.decorator.Coffee;
import com.demo.decorator.Decorator;

/**
 * 定义装饰内容--coffee加sugar
 * @author Administrator
 */
public class DecoratorSugar extends Decorator {

	private Coffee coffee;
	
	public DecoratorSugar(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		System.out.println("Coffee里面添加Sugar");
		return coffee.getDescription() + "添加Sugar";
	}
	
	@Override
	public double cost() {
		double s = coffee.cost();
		System.out.println( s + 1);
		return s + 1;
	}
}
