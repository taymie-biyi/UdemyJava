public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 
        // convert from double to integers

        int newSales = (int)sales;
        int newProfit = (int)profit;
        int newRefunds = (int)refunds;
        int newShipping = (int)shipping;

        System.out.println("This month, we made $"+ newSales + " in sales");
        System.out.println("Factoring in costs, we made $" + newProfit + " in profit");
        System.out.println("The refunds are at a low $" + newRefunds + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + newShipping + " in shipping");


    }
}