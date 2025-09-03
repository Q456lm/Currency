import java.util.Scanner;
public class Currency{
    public static Scanner imput = new Scanner(System.in);
    public static double getInput(String prompt){ //Gets input
        System.out.print(prompt);
        return imput.nextDouble();
    }
    public static String changecash(double cash){
        final int DOLLAR_AMOUNT = (int)(cash/1);//dollars
        double newcash = cash%1;

        final int QUATER_AMOUNT = (int)(newcash/0.25);//quaters
        newcash = cash%0.25;

        final int DIME_AMOUNT = (int)(newcash/0.10);//dimes
        newcash = cash%0.10;

        final int NICKEL_AMOUNT = (int)(newcash/0.05);//nickles
        newcash = cash%0.05;

        newcash = Math.ceil(newcash*100)/100; //pennies //Requred becaue of rounding error to make that makes it not do pennies correctly.
        final int PENNY_AMOUNT = (int)(newcash/0.01);

        return "dollars: "+DOLLAR_AMOUNT+"\nquaters: "+QUATER_AMOUNT+"\ndimes: "+DIME_AMOUNT+"\nnickes: "+NICKEL_AMOUNT+"\npennies: "+PENNY_AMOUNT;
        
    }
    public static void main(String[] args){
        double amount = getInput("Enter an amount in cash: "); //input
        System.out.println(changecash(amount)); //conversion
    }
}
