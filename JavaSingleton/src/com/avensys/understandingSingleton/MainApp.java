package com.avensys.understandingSingleton;

public class MainApp {

	public static void main(String[] args) {
		Car c1 = Car.getCarData();
		Car c2 = Car.getCarData();
		Car c3 = Car.getCarData();
		Car c4 = Car.getCarData();
		Car c5 = Car.getCarData();
		Car c6 = Car.getCarData();
		Car c7 = Car.getCarData();
		Car c8 = Car.getCarData();
		
		System.out.println(c1.brand);
		System.out.println(c2.brand);
		System.out.println(c3.brand);
		System.out.println(c4.brand);
		System.out.println(c5.brand);
		System.out.println(c6.brand);
		System.out.println(c7.brand);
		System.out.println(c8.brand);
		
		Dog d1 = Dog.getDogInfo();
		System.out.println(d1.breed);
		
	}

}
