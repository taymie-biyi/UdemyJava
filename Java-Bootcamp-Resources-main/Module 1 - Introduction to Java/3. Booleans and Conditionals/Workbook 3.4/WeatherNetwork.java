public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = 25;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!

        //if temp is less than or equal to -1: "The forecast is FREEZING! Stay home!"
        if (temp <= -1) {
            System.out.println("The forecast is FREEZING! Stay home!");
            forecast = "FREEZING";
        }
        //if temp is less than or equal to 10: "The forecast is Chilly. Wear a coat!";
            else if (temp <= 10) {
                System.out.println("The forecast is Chilly. Wear a coat!");
                forecast = "Chilly";
            }
        //else: 
            else {
                System.out.println("It's warm. go outside!");
                forecast = "Warm";
            }
        System.out.println(forecast);
    }
}
