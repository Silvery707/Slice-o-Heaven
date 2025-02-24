public class SliceOHeaven {
    String storeName = "Slice-o-Heaven";
    String storeAddress = "123 Heaven St.";
    String storeEmail = "info@sliceoheaven.com";
    String storePhone = "555-1234";
    String[] storeMenu = {"Pizza", "Sides", "Drinks"};
    String[] pizzaIngredients = {"Dough", "Tomato Sauce", "Cheese", "Pepperoni"};
    double basePrice = 8.99;
    double toppingPrice = 2.00;
    double pizzaPrice = basePrice + toppingPrice; 
    String[] sides = {"Garlic Bread", "Salad"};
    String[] drinks = {"Soda", "Water"};
    int orderID = 1;
    double orderTotal = 0.0;

    public void takeOrder() {
        System.out.println("wlecome to " + storeName + "!");
        System.out.println("Your order ID is: " + orderID);
        orderTotal += pizzaPrice;
        System.out.println("You order a pizza for the price: $" + pizzaPrice);
    }

    public void makePizza() {
    System.out.println("Pizza is being made...");
        System.out.print("Pizza toppings: ");
    for (String ingredient : pizzaIngredients) {
    System.out.print(ingredient + " ");
        }
    System.out.println();
        System.out.println("The pizza is made!");
    }

    public void printReceipt() {
        System.out.println("------ receipt ------");
        System.out.println("Order ID: " + orderID);
        System.out.println("Price: $" + orderTotal);
        System.out.println("Thank you for visiting!");

        
    }

    public static void main(String[] args) {
        SliceOHeaven pizzeria = new SliceOHeaven();

        pizzeria.takeOrder();
        pizzeria.makePizza();
        pizzeria.printReceipt();
    }
    
}
