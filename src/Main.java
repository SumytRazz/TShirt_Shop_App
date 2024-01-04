import Models.Order;
import Models.TShirt;

public class Main {
    public static void main(String[] args) {

        // TShirt object
        TShirt tShirt1 = new TShirt("Gorkhali Batman", 572, "Karuna", 1235, "You either die a hero or live long enough to see yourself be a villain", new String[]{"XL", "Medium", "Large"});
        TShirt tShirt2 = new TShirt("Full TShirt",123,"Nike",3000,"Greatness is not born , it is made.",new String[]{"2XL","Extra","Large"});

        // Order Object
        Order order1 = new Order("Gopal Sharma", "0486756465", new int[]{572, 123}, new double[]{1235, 3000});
        Order order2 = new Order("Sumit Raj", "9812345678", new int[]{123}, new double[]{3000});


        System.out.println("Ram's TShirt Shop");

        //The Code below connects TShirt model, order model to print all the items and order easily..
        tShirt1.displayTShirt();
        tShirt2.displayTShirt();

        order1.generateBill();
        order2.generateBill();
    }

}