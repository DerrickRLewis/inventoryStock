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





        supplies.put("A", new Integer(3));
        supplies.put("Salt", new Integer(1));
        supplies.put("Pepper", new Integer(1));
        supplies.put("Basil", new Integer(9));
        supplies.put("Garlic", new Integer(9));


        System.out.println("WELCOME TO INVENTORY");
        System.out.println("Please choose one of the following\n");


        while (true) {
            System.out.println("1|| Add new item to inventory\n");
            System.out.println("2||Remove item from inventory\n");
            System.out.println("3||Change the quantity of an item\n");
            System.out.println("4||Print List");
            String option = scanner.nextLine();


            if (option.equals("1")) {

                System.out.println("What is the name of the item that you want to add to the inventory\n");

                String optionName = scanner.nextLine();
                System.out.println("How many would you like to add to inventory?\n");

                Integer optionQty = Integer.parseInt(scanner.nextLine());

                supplies.put(optionName, optionQty);
                // String option2 = scanner.nextLine();
                //createItem(optionName,optionQty,String);

                //System.out.println("Now enter How many "+ newItem.name +" do you want to add to inventory?\n");
                //Integer.parseInt(scanner.nextLine());


            } else if (option.equals("2")) {

                System.out.println("Enter the name of the item you want to remove from the inventory\n");
                String option3 = scanner.nextLine();
               // System.out.println(option3 + " will be removed from the inventory");

                System.out.printf("%s's will be removed from the inventory \n", option3);

            } else if (option.equals("3")) {
                System.out.println("Enter the name and the qty of the item that you want to update:\n");
                String option4 = scanner.nextLine();

                //System.out.println(option4 + " will be changed");
                System.out.printf("%s's will be changed \n", option4);


            } else if (option.equals("4")) {
                System.out.println(supplies);


            }
        }
    }


    static InventoryItem createItem(String name, int quantity, String category) {

        System.out.println("What is the name of the item that you want to add to the inventory\n");

        String optionName = scanner.nextLine();
        System.out.println("How many would you like to add to inventory?\n");

        Integer optionQty = Integer.parseInt(scanner.nextLine());

        supplies.put(optionName, optionQty);


        return new InventoryItem();

    }
}


