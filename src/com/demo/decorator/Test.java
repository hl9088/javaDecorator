package com.demo.decorator;

public class Test {
	public static void main(String[] args) {
		Coffee coffee = new CoffeeNormal();
		Decorator decorator = new DecoratorMilk(new DecoratorSugar(coffee));
		//Decorator decorator = new DecoratorSugar(new DecoratorMilk(coffee));
		String desc = decorator.getDescription();
		double cost = decorator.cost();
		System.out.println(desc);
		System.out.println("最后的花费为" + cost);
	}
}
