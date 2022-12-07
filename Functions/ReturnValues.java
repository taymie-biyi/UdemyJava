public class ReturnValues {
    public static void main(String[] args) {
        calculateArea(2.3, 3.6);
        calculateArea(1.6, 2.4);
        
    }
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
    
}
