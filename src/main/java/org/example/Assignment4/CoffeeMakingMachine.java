package org.example.Assignment4;

import java.util.Scanner;

public class CoffeeMakingMachine {
    enum CoffeeSelection {
        FILTER_COFFEE,
        ESPRESSO,
        CAPPUCCINO
    }
    static void brewCoffee(CoffeeSelection coffee, int number){
        switch (coffee) {
            case ESPRESSO : System.out.println(number+" cups of Espresso is ready"); break;
            case CAPPUCCINO: System.out.println(number+" cups of Cappuccino coffee is ready");break;
            case FILTER_COFFEE: System.out.println(number+" cups of filter coffee is ready");break;
            default:System.out.println("Your coffee is ready");break;
        }
    }

    static void brewCoffee(CoffeeSelection coffee){
        switch (coffee) {
            case ESPRESSO : System.out.println("Your Espresso is ready");break;
            case CAPPUCCINO: System.out.println("Your Cappuccino coffee is ready");break;
            case FILTER_COFFEE: System.out.println("Your filter coffee is ready");break;
            default:System.out.println("Your coffee is ready");break;
        }
    }
}

class MainShape {
    public static void main(String [] args){
        System.out.println("Enter coffee type");
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        CoffeeMakingMachine.brewCoffee(CoffeeMakingMachine.CoffeeSelection.valueOf(type));
        System.out.println("Enter number of coffee");
        int num = sc.nextInt();
        CoffeeMakingMachine.brewCoffee(CoffeeMakingMachine.CoffeeSelection.valueOf(type), num);
    }
}
