/**
Print out the inventory items and then list the options.
If the user enters 1, let them create a new item by entering its name.
If the user enters 2, let them remove an item by its number.
If the user enters 3, let them update the quantity of that item.
 */



import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<String, Integer> supplies = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {





       

        System.out.println("WELCOME TO INVENTORY");
        System.out.println("Please choose one of the following\n");


        while (true) {
            System.out.println("1|| Add new item to inventory\n");
            System.out.println("2||Remove item from inventory\n");
            System.out.println("3||Change the quantity of an item\n");
            System.out.println("4||Print List");
            String option = scanner.nextLine();


            if (option.equals("1")) {

                createItem();


            } else if (option.equals("2")) {


                removeItem();


            } else if (option.equals("3")) {

                changeQty();




            } else if (option.equals("4")) {
                System.out.println(supplies);


            }
        }
    }

    private static void changeQty() {
        System.out.println("Enter the name of the item that you want to update:\n");
        String option3 = scanner.nextLine();

        System.out.println("Enter the qty");

        Integer option3QTY = scanner.nextInt();


        System.out.printf("%s's will be changed \n", option3);

        supplies.replace(option3,option3QTY);
    }

    private static void removeItem() {
        System.out.println("Enter the name of the item you want to remove from the inventory\n");
        String option3 = scanner.nextLine();


        System.out.printf("%s's will be removed from the inventory \n", option3);

        supplies.remove(option3);
    }


    static InventoryItem createItem() {

        System.out.println("What is the name of the item that you want to add to the inventory\n");

        String optionName = scanner.nextLine();
        System.out.println("How many would you like to add to inventory?\n");

        Integer optionQty = Integer.parseInt(scanner.nextLine());

        supplies.put(optionName, optionQty);


        return new InventoryItem();

    }
}


