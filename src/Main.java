//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String firstName = "Abdulrahman";
        String lastName = "Alfahad";
        int age = 27;
        int amount = 5;
        boolean married = false;

        System.out.println("The amount is " + amount +"KD");
        System.out.println("Would you like to Deposit or Withdraw the amount?");
        System.out.println("---------");
        System.out.println(amount + " plus " + amount + " makes " + (amount + amount));
        System.out.println("---------");

        String fullName = "John Doe";

        System.out.println("My name is " + fullName.split(" ")[0].toUpperCase() + " and my last name length is " + fullName.split(" ")[1].length());

        System.out.println( fullName.split(" ")[1].charAt(0) == 'D' ? true : false);

    }
}