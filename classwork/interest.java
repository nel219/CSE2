//  define a class
public class interest{
    
//  add main method
  public static void main(String[] args) {

// write program that adds interest in bank account, given account
// balance and interest rate
// modify program to only add int part of interest to balance
// use Math.round to round number from string to variable type
    double principle=1000;
    double rate=0.1;
    double interest=principle*rate;
    double balance=interest+principle;
    System.out.println("Interest "+interest);
    System.out.println("Balance "+balance);
  }
}