package com.bridgelabz.program;

public class Pizza extends FoodItmes implements IVeg {
	public Pizza() {
		type = Type.VEG ;
		catagory = Category.STARTER;
		tast = Test.CHEESY;
		preparationTime = 20;
		name = "Pizza";
	}
}
