/**
 * Auto Generated Java Class.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter; //Writing Files
import java.util.Scanner; //Reading Files
import java.util.ArrayList;
import static java.lang.System.*;

public class Total {
  
  
  
  public static void main(String[] args) throws FileNotFoundException { 
    ArrayList <PhoneCall> phoneCalls = new ArrayList<PhoneCall>();
    
    //Record Attributes #1
    String firstPhoneNumber = "";
    String trimmedSecondPhoneNumber = "";
    int firstDuration=0;
    String firstDate ="";
    String firstName = "";
    double firstCost=0;
    String firstCostString2 = "";
    
    //Record Attributes #2
    String secondPhoneNumber = "";
    String trimmedThirdPhoneNumber = "";
    int secondDuration=0;//what we want to use
    String secondDate ="";//what we want to use
    String secondName = "";//what we want to use
    double secondCost=0; //what we want to use
    String secondCostString2 = "";
    
    //Record Attributes #3
    String thirdPhoneNumber = "";
    String trimmedFourthPhoneNumber = "";
    int thirdDuration=0;//what we want to use
    String thirdDate ="";//what we want to use
    String thirdName = "";//what we want to use
    double thirdCost=0; //what we want to use
    String thirdCostString2 = "";
    
     //Record Attributes #4
    String fourthPhoneNumber = "";
    String trimmedFifthPhoneNumber = "";
    int fourthDuration=0;//what we want to use
    String fourthDate ="";//what we want to use
    String fourthName = "";//what we want to use
    double fourthCost=0; //what we want to use
    String fourthCostString2 = "";
    
    //Record Attributes #5
    String fifthPhoneNumber = "";
    String trimmedSixthPhoneNumber = "";
    int fifthDuration=0;//what we want to use
    String fifthDate ="";//what we want to use
    String fifthName = "";//what we want to use
    double fifthCost=0; //what we want to use
    String fifthCostString2 = "";
    
     //Record Attributes #6
    String sixthPhoneNumber = "";
    //String trimmedSixthPhoneNumber = "";
    int sixthDuration=0;//what we want to use
    String sixthDate ="";//what we want to use
    String sixthName = "";//what we want to use
    double sixthCost=0; //what we want to use
    String sixthCostString2 = "";


    
    
    //Identify the file we want to read from. 
    String inputFileName = "phoneCalls.txt";
    
    
    //Construct the Scanner to read from the inputFile (phoneCalls.txt)
    
    File inputFile = new File(inputFileName);
    Scanner in = new Scanner (inputFile);
    //PrintWriter out = new PrintWriter(outputFileName);
    
    
    

    
    
    //Initialize the string delimiter:
    in.useDelimiter("/");
   
    

    
    /* DATA EXTRACTION
     * We need to extract the phone number, duration, date, calleeName, cost
    */
       
    if (in.hasNext()) //To make sure there is a value to scan/read in the inputfile
    {
         //Collecting First Record Attributes
      
        firstPhoneNumber=in.next();
        String firstDurationString = in.next();
        firstDuration= Integer.parseInt(firstDurationString);
        firstDate = in.next();
        firstName = in.next();
      
        in.useDelimiter ("\\s");
        String firstCostString = in.next();
         firstCostString2 = deleteCharAt(firstCostString,0);
         firstCost = Double.parseDouble(firstCostString2);
         in.useDelimiter("/");
         
            //Collecting Second Record Attributes
         
        secondPhoneNumber=in.next();
        trimmedSecondPhoneNumber = secondPhoneNumber.trim(); //The trim method removes the white space that was at the beginning of phone number
        String secondDurationString = in.next();
        secondDuration= Integer.parseInt(secondDurationString);
        secondDate = in.next();
        secondName = in.next();
      
        in.useDelimiter ("\\s");
        String secondCostString = in.next();
         secondCostString2 = deleteCharAt(secondCostString,0);
         secondCost = Double.parseDouble(secondCostString2);
         in.useDelimiter("/");
         
         //Collecting Third Record Attributes 
         
         thirdPhoneNumber=in.next();
        trimmedThirdPhoneNumber = thirdPhoneNumber.trim(); //The trim method removes the white space that was at the beginning of phone number
        String thirdDurationString = in.next();
        thirdDuration= Integer.parseInt(thirdDurationString);
        thirdDate = in.next();
        thirdName = in.next();
      
        in.useDelimiter ("\\s");
        String thirdCostString = in.next();
         thirdCostString2 = deleteCharAt(thirdCostString,0);
         thirdCost = Double.parseDouble(thirdCostString2);
         in.useDelimiter("/");
         
          //Collecting Fourth Record Attributes 
         
        fourthPhoneNumber=in.next();
        trimmedFourthPhoneNumber = fourthPhoneNumber.trim(); //The trim method removes the white space that was at the beginning of phone number
        String fourthDurationString = in.next();
        fourthDuration= Integer.parseInt(fourthDurationString);
        fourthDate = in.next();
        fourthName = in.next();
      
        in.useDelimiter ("\\s");
        String fourthCostString = in.next();
         fourthCostString2 = deleteCharAt(fourthCostString,0);
         fourthCost = Double.parseDouble(fourthCostString2);
         in.useDelimiter("/");
         
          //Collecting Fifth Record Attributes 
         
        fifthPhoneNumber=in.next();
        trimmedFifthPhoneNumber = fifthPhoneNumber.trim(); //The trim method removes the white space that was at the beginning of phone number
        String fifthDurationString = in.next();
        fifthDuration= Integer.parseInt(fifthDurationString);
        fifthDate = in.next();
        fifthName = in.next();
      
        in.useDelimiter ("\\s");
        String fifthCostString = in.next();
         fifthCostString2 = deleteCharAt(fifthCostString,0);
         fifthCost = Double.parseDouble(fifthCostString2);
         in.useDelimiter("/");
         
          //Collecting Sixth Record Attributes 
         
        sixthPhoneNumber=in.next();
        trimmedSixthPhoneNumber = sixthPhoneNumber.trim(); //The trim method removes the white space that was at the beginning of phone number
        String sixthDurationString = in.next();
        sixthDuration= Integer.parseInt(sixthDurationString);
        sixthDate = in.next();
        sixthName = in.next();
      
        in.useDelimiter ("\\s");
        String sixthCostString = in.next();
         sixthCostString2 = deleteCharAt(sixthCostString,0);
         sixthCost = Double.parseDouble(sixthCostString2);
         in.useDelimiter("/");
      
    }
    
    //Making sure everything is good
    System.out.println(firstPhoneNumber);
    System.out.println(firstDuration);
    System.out.println(firstDate);
    System.out.println(firstName);
    System.out.println ( firstCost);
    
    
    System.out.println (trimmedSecondPhoneNumber);
    System.out.println(secondDuration);
    System.out.println(secondDate);
    System.out.println(secondName);
    System.out.println ( secondCost);
    
    System.out.println (trimmedThirdPhoneNumber);
    System.out.println(thirdDuration);
    System.out.println(thirdDate);
    System.out.println(thirdName);
    System.out.println ( thirdCost);
    
    System.out.println (trimmedFourthPhoneNumber);
    System.out.println(fourthDuration);
    System.out.println(fourthDate);
    System.out.println(fourthName);
    System.out.println ( fourthCost);
    
    System.out.println (trimmedFifthPhoneNumber);
    System.out.println(fifthDuration);
    System.out.println(fifthDate);
    System.out.println(fifthName);
    System.out.println ( fifthCost);
    
    System.out.println (trimmedSixthPhoneNumber);
    System.out.println(sixthDuration);
    System.out.println(sixthDate);
    System.out.println(sixthName);
    System.out.println ( sixthCost);
    
    
    
    //Create Objects and add to list
    
    PhoneCall pc1= new PhoneCall (firstPhoneNumber, firstDuration,firstDate, firstName, firstCost );
    PhoneCall pc2 = new PhoneCall (trimmedSecondPhoneNumber,secondDuration, secondDate,
                                   secondName, secondCost );
    PhoneCall pc3 = new PhoneCall (trimmedThirdPhoneNumber,thirdDuration, thirdDate,
                                   thirdName, thirdCost);
    
    PhoneCall pc4 = new PhoneCall (trimmedFourthPhoneNumber, fourthDuration, fourthDate, 
                                    fourthName, fourthCost);
    
    PhoneCall pc5 = new PhoneCall (trimmedFifthPhoneNumber, fifthDuration, fifthDate, 
                                    fifthName, fifthCost) ;
    PhoneCall pc6 = new PhoneCall (trimmedSixthPhoneNumber, sixthDuration, sixthDate, 
                                    sixthName, sixthCost);
    
     phoneCalls.add(pc1);
     phoneCalls.add(pc2);
     phoneCalls.add(pc3);
     phoneCalls.add(pc4);
     phoneCalls.add(pc5);
     phoneCalls.add(pc6);
     
    for( PhoneCall phoneCall: phoneCalls)
                        {
       System.out.println(phoneCall);
     }
    
    
    in.close();

    
    
    
    
  }
  
  private static String deleteCharAt( String stringCollect, int i) {
    return stringCollect.substring(0,i) + stringCollect.substring( i+1);
  }
  
  
  /* ADD YOUR CODE HERE */
  
}
