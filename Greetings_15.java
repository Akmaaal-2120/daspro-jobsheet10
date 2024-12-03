import java.util.Scanner;
public class Greetings_15 {
    public static void main(String[] args) {
        String name = geGreetingRecipient();
        System.out.println("Thank you " + name + " May the force be with you!");
        akmal();
    }
    public static String geGreetingRecipient(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        System.out.println("akmal");
        return recipientName;
        
    }
    public static void akmal(){
        System.out.println("akmal");
    }
}
