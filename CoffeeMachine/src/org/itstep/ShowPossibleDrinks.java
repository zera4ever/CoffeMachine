package org.itstep;

import java.util.ArrayList;

public class ShowPossibleDrinks {

	public static void main(String[] args) {
		int inputMoney = 400;

		DrinksManager dm = new DrinksManager();
		dm.setDrinks();

		ArrayList<Drink> possibleDrinks = dm.getPossibleDrinks(inputMoney);
		if (!possibleDrinks.isEmpty()) {
			System.out.println("You input " + inputMoney);
			System.out.println("============");
			for (Drink drink : possibleDrinks) {
				System.out.println("You can choose drink " + drink.getName() + " and Your back is "
						+ (inputMoney - drink.getPrice()));

			}
		} else {
			String minDrink = "";
			int minCost = Integer.MAX_VALUE;
			for (Drink drink : Drinks.getAllDrinks()) {
				if(minCost>drink.getPrice()){
					minCost = drink.getPrice();
					minDrink = drink.getName();
					
				}
			}
			System.out.println("You input " + inputMoney);
			System.out.println("============");
			System.out.println("if You want cofee, you must input " + (minCost-inputMoney) + " yet!");
			System.out.println("You can buy at least " + minDrink + " than...");
			

		}

		// TODO Auto-generated method stub

	}

}
