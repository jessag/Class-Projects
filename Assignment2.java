/* Author: Jessa Gariepy 
 * Class: CSE 205
 * Program: Credit Card Number Check
 * *******Algorithm*********************************************
 * 1. Ask the user for their 8 digit credit card number. 
 * 2. Starting from the right most digit of card number, sum every other digit. 
 * 3. Double the digits not included in step one. 
 * 4. Add all digits of result from step 3. 
 * 5. Add sums from step 2 and step 4.
 * 6. Determine if last digit ==0.
 */

import java.util.Scanner;


public class Assignment2 {
  
  public static void main (String[] args) {
    
    //To collect user input we use the Scanner class.
    Scanner input = new Scanner(System.in);
    
    
    //Declarations             // ** Variable description and purpose**
    String cardNumber;         //-- the 8 digit card number provided by the user in form of String.
    int digitArray [];         //-- declares array that holds the values of every other digit, 
                               //-- starting from the far right of card #.
    digitArray = new int [4];  //-- the initalization of digitArray
    int sum =0;                //-- the sum for step 2 from algorithm
    int h =0;                  //-- for for loop to assign array values
    int digitArray2 [];        //-- delcares the array that holds values for every other digit not yet scanned.
    digitArray2 = new int [4]; //-- initializes digitArray2
    int product;               //-- holds the product for when we double digits (step 3)
    char charDigitOne;         //-- used to isolated individual elements
    int intDigitOne;           //-- converted back from isolated char value to hold corresponding int value.
    
    //Body of Code
    
    //1. Ask the user for their 8 digit credit card number
    
    System.out.print("Please enter your 8 digit credit card number to see check if it's valid.");
    cardNumber = input.nextLine();
    
    //2. Starting from the right most digit of card number, sum every other digit.
    for (int i=7; i>0; i--)
    {
      char character = cardNumber.charAt(i);
      
      i = i-1;
      digitArray[h]=Character.getNumericValue(character);
      h++;
    }
    
    for (int j=0; j< digitArray.length; j++  ) //add values together
    {
      sum= sum + digitArray[j];
      
      
    }
    
    //3. Double the digits not included in step one.
    h=0;
    
    //3A) scan all other numbers not previously scanned.
    for (int i=6; i>=0; i--) 
    {
      char character = cardNumber.charAt(i);
      
      i = i-1;
      digitArray2[h]=Character.getNumericValue(character);
      h++;
    }
    
    //3B)Double numbers from last step.
    
    for (int j=0; j< digitArray2.length; j++  ) //add values together
    {
      product= 2 * (digitArray2[j]);
      digitArray2[j]=product;
      
    }
    
    //4. Add all digits of result from step 3.
    int sum2 =0;
    
    for (int j=0; j< digitArray2.length; j++)
    {
      String intToString= String.valueOf(digitArray2[j]); // change value in digitArray2 back to string.
      if (digitArray2[j] >=10 )
      {
        for(int i=0; i <2; i++)
        {
          charDigitOne = intToString.charAt(i); // using charAt, isolate individual elements then add.
          intDigitOne = Character.getNumericValue(charDigitOne);
          sum2 = sum2 + intDigitOne;
          
        }
      }
      
      else {
        for(int i=0; i <1; i++)
        {
          charDigitOne = intToString.charAt(i); // using charAt, isolate individual elements then add.
          intDigitOne = Character.getNumericValue(charDigitOne);
          sum2 = sum2 + intDigitOne;
          
        }
        
      }
   }
   //5. Add sums from step 2 and step 4
  int endSum = sum + sum2;
  
  
  //6. Determine if last digit ==0.
  String endSumString= String.valueOf(endSum);
  
  //6A)In the case that the last character has an index 1.
  
  if (endSum >9)
  {
    char lastDigit = endSumString.charAt(1);
    
    
    if (lastDigit == '0')
    {
      System.out.println("Success. Your card has been validated.") ;
    }
    else 
    {
      System.out.println("Sorry, your card is not valid.") ;
    }
  }
  
  //6B) In the case that the last character has an index 0.
  else
  {
    
    char lastDigit = endSumString.charAt(0);
    if (lastDigit == '0')
    {
      System.out.println("Success. Your card has been validated.") ;
    }
    else 
    {
      System.out.println("Sorry, your card is not valid.") ;
    }
    input.close();
  }
 }
}