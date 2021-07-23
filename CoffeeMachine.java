package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static int hasWater = 400;
    static int hasMilk = 540;
    static int hasCoffeeBeans = 120;
    static int hasDisposableCups = 9;
    static int hasMoney = 550;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        writeActions();
    }
    
    public static void printStateCoffeeMachine() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(hasWater + " ml of water");
        System.out.println(hasMilk + " ml of milk");
        System.out.println(hasCoffeeBeans + " g of coffee beans");
        System.out.println(hasDisposableCups + " disposable cups");
        System.out.println("$" + hasMoney + " of money");
    }
    
    public static void writeActions() {
        String inputAction;
        
        do {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            inputAction = scanner.nextLine();
            switch (inputAction) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printStateCoffeeMachine();
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }
        } while (true);
        
    }
    
    public static void buy() { //need restucture this method because not readble
        boolean waterHave = false;
        boolean milkHave = false;
        boolean coffeeBeansHave = false;
        boolean disposableCupsHave = false;
        String typeOfCoffee;
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        typeOfCoffee = scanner.nextLine();
        switch (typeOfCoffee) {
            case "1":
                if (hasWater >= 250) {
                    hasWater -= 250;
                    waterHave = true;
                } else {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                    writeActions();
                }
                if (hasCoffeeBeans >= 16) {
                    hasCoffeeBeans -= 16;
                    coffeeBeansHave = true;
                } else {
                    System.out.println("Sorry, not enough coffeebeans!");
                    System.out.println();
                    writeActions();
                }
                if (hasDisposableCups >= 1) {
                    hasDisposableCups--;
                    disposableCupsHave = true;
                } else {
                    System.out.print("Sorry, not enough disposablecups!");
                    System.out.println();
                    writeActions();
                }
                if (waterHave && coffeeBeansHave && disposableCupsHave) {
                    hasMoney += 4;
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                    writeActions();
                }
                break;
            case "2":
                if (hasWater >= 350) {
                    hasWater -= 350;
                    waterHave = true;
                } else {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                    writeActions();
                    break;
                }
                if (hasMilk >= 75) {
                    hasMilk -= 75;
                    milkHave = true;
                } else {
                    System.out.print("Sorry, not enough milk!");
                    System.out.println();
                    writeActions();
                }
                if (hasCoffeeBeans >= 20) {
                    hasCoffeeBeans -= 20;
                    coffeeBeansHave = true;
                } else {
                    System.out.print("Sorry, not enough coffeebeans!");
                    System.out.println();
                    writeActions();
                }
                if (hasDisposableCups >= 1) {
                    hasDisposableCups--;
                    disposableCupsHave = true;
                } else {
                    System.out.print("Sorry, not enough disposablecups!");
                    System.out.println();
                    writeActions();
                }
                if (waterHave && milkHave && coffeeBeansHave && disposableCupsHave) {
                    hasMoney += 7;
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                    writeActions();
                }
                writeActions();
                break;
            case "3":
                if (hasWater >= 200) {
                    hasWater -= 200;
                    waterHave = true;
                } else {
                    System.out.print("Sorry, not enough water!");
                    System.out.println();
                    writeActions();
                }
                if (hasMilk >= 100) {
                    hasMilk -= 100;
                    milkHave = true;
                } else {
                    System.out.print("Sorry, not enough milk!");
                    System.out.println();
                    writeActions();
                }
                if (hasCoffeeBeans >= 12) {
                    hasCoffeeBeans -= 12;
                    coffeeBeansHave = true;
                } else {
                    System.out.print("Sorry, not enough coffeebeans!");
                    System.out.println();
                    writeActions();
                }
                if (hasDisposableCups >= 1) {
                    hasDisposableCups--;
                    disposableCupsHave = true;
                } else {
                    System.out.print("Sorry, not enough disposablecups!");
                    System.out.println();
                    writeActions();
                }
                if (waterHave && milkHave && coffeeBeansHave && disposableCupsHave) {
                    hasMoney += 6;
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                    writeActions();
                }
                break;
            case "back":
                writeActions();
                break;
        }
    }
    
    public static void fill() {
        int addWater;
        int addMilk;
        int addCoffeeBeans;
        int addDisposableCups;
        
        System.out.println();
        System.out.println("Write how many ml of water you want to add:");
        addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        addCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        addDisposableCups = scanner.nextInt();
        
        hasWater += addWater;
        hasMilk += addMilk;
        hasCoffeeBeans += addCoffeeBeans;
        hasDisposableCups += addDisposableCups;
    }
    
    public static void take() {
        System.out.println();
        System.out.println("I gave you $" + hasMoney);
        hasMoney = 0;
    }
}