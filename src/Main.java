/**
Print out the inventory items and then list the options.
If the user enters 1, let them create a new item by entering its name.
If the user enters 2, let them remove an item by its number.
If the user enters 3, let them update the quantity of that item.
 */



import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        HashMap<String, Double> supplies = new HashMap<String, Double>();

        supplies.put("Sugar", new Double(3.34));
        supplies.put("Salt", new Double(1.22));
        supplies.put("Pepper", new Double(1.00));
        supplies.put("Basil", new Double(9.22));
        supplies.put("Garlic", new Double(-19.08));



        System.out.println("WELCOME TO INVENTORY");
        System.out.println("Please choose one of the following\n");
        NewItem newItem = new NewItem("name", 7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1|| Add new item to inventory\n");
            System.out.println("2||Remove item from inventory\n");
            System.out.println("3||Change the quantity of an item\n");
            System.out.println("4||Print List");
            String option = scanner.nextLine();


            if (option.equals("1")) {

                // Get name of item from user = Item.getItem()
                newItem.getName();
                newItem.getQty();

               // String option2 = scanner.nextLine();


                //System.out.println("Now enter How many "+ newItem.name +" do you want to add to inventory?\n");
                //Integer.parseInt(scanner.nextLine());


            }else if (option.equals("2")){

                System.out.println("Enter the name of the item you want to remove from the inventory\n");
                String option3 = scanner.nextLine();
                System.out.println(option3+" will be removed from the inventory");


            }else if (option.equals("3")) {
                System.out.println("Enter the name and the qty of the item that you want to update:\n");
                String option4 = scanner.nextLine();

                System.out.println(option4 + " will be changed");


            }else  if (option.equals("4")){
                System.out.println(supplies);



            }
        }
    }
}