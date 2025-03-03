public class SliceOHeaven1 {
    String storeName = "Slice - o - Heaven";
    String storeAddress = "123 Heaven St.";
    String storeEmail = "sliceoheaven1@163.com";
    String storePhone = "234 - 1234";
    String[] storeMenu = {"Pizza", "Sides", "Drinks"};
    String[] sides = {"Garlic Bread", "Salad"};
    String[] drinks = {"Soda", "Water"};

    String[] pizzaIngredients;
    double basePrice = 8.99;
    double toppingPrice = 2.00;
    double pizzaPrice;

    private String orderID;
    private double orderTotal;

    private final String DEF_ORDER_ID = "DEF - SOH - 099";
    private final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    private final double DEF_ORDER_TOTAL = 15.00;

    public SliceOHeaven1() {
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = new String[]{DEF_PIZZA_INGREDIENTS};
        this.orderTotal = DEF_ORDER_TOTAL;
        this.pizzaPrice = basePrice + toppingPrice;
    }

    public SliceOHeaven1(String orderID, String[] pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
        this.pizzaPrice = basePrice + toppingPrice;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public void takeOrder() {
        System.out.println("Welcome to " + storeName + "!");
        System.out.println("Your order ID is: " + orderID);
        orderTotal = orderTotal + pizzaPrice;
        System.out.println("You ordered a pizza and the price is: $" + pizzaPrice);
    }

    public void makePizza() {
        System.out.println("Pizza is being made...");
        System.out.print("Pizza toppings: ");
        for (int i = 0; i < pizzaIngredients.length; i++) {
            System.out.print(pizzaIngredients[i]);
            if (i < pizzaIngredients.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("The pizza is ready");
    }

    private void printReceipt() {
        System.out.println("Receipt");
        System.out.println("Order ID: " + orderID);
        System.out.println("Total Price: $" + orderTotal);
        System.out.println("Thank you for your visit");
    }

    public void displayReceipt() {
        printReceipt();
    }

    public static void main(String[] args) {
        SliceOHeaven1 pizzeria1 = new SliceOHeaven1();
        pizzeria1.takeOrder();
        pizzeria1.makePizza();
        pizzeria1.displayReceipt();

        String[] customIngredients = {"Dough", "Tomato Sauce", "Cheese", "Pepperoni"};
        SliceOHeaven1 pizzeria2 = new SliceOHeaven1("CUST - SOH - 100", customIngredients, 20.00);
        pizzeria2.takeOrder();
        pizzeria2.makePizza();
        pizzeria2.displayReceipt();
    }
}