package com.demo.decorator;

/**
 * ��������Coffee --- ���屻װ�εĶ�����
 * @author Administrator
 */
public class CoffeeNormal implements Coffee {

	public String description = "������ͨ��Coffee";
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public double cost() {
		System.out.println("����������Coffee������ӣ��۸�Ϊ100Ԫ");
		return 100;
	}
}
