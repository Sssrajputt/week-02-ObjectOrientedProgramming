import java.util.Scanner;

class CartItem {
    String itemName;
    int price;
    int quantity;

    CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    int getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    CartItem[] cart;
    int itemCount;

    ShoppingCart(int size) {
        cart = new CartItem[size];
        itemCount = 0;
    }

    void addItem(String itemName, int price, int quantity) {
        if (itemCount < cart.length) {
            CartItem newItem = new CartItem(itemName, price, quantity);
            cart[itemCount] = newItem;
            itemCount++;
        } else {
            System.out.println("Cart is full");
        }
    }

    void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].itemName.equals(itemName)) {
                cart[i] = cart[itemCount - 1];
                cart[itemCount - 1] = null;
                itemCount--;
                return;
            }
        }
        System.out.println("Item not found");
    }

    int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cart[i].getTotalCost();
        }
        return totalCost;
    }

    void displayTotalCost() {
        System.out.println("Total cost: " + getTotalCost());
    }
}

public class ShoppingCartTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the cart: ");
        int size = input.nextInt();
        ShoppingCart cart = new ShoppingCart(size);

        System.out.println("Enter item name, price, and quantity (or type 'done' to finish):");
        while (true) {
            String itemName = input.next();
            if (itemName.equals("done")) break;
            int price = input.nextInt();
            int quantity = input.nextInt();
            cart.addItem(itemName, price, quantity);
        }

        System.out.println("Enter item name to remove (or type 'done' to finish):");
        while (true) {
            String itemName = input.next();
            if (itemName.equals("done")) break;
            cart.removeItem(itemName);
        }

        cart.displayTotalCost();
    }
}
