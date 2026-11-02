import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter the cost per item: ");
        double unitCost = input.nextDouble();

        if (quantity < 0 || unitCost < 0) {
            System.out.println("Quantity and item cost cannot be negative.");
            input.close();
            return;
        }

        double totalCost = quantity * unitCost;

        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Cost per item: " + unitCost);
        System.out.println("Total cost: " + totalCost);

        input.close();
    }
}
