public class PhoneCall {
  
  
  //Attributes---
  private String phoneNumber;
  private int duration;
  private String date;
  private String name;
  private double cost;
  
  //Methods---
  
  //Parameterized Constructor
  PhoneCall(String phoneNumber, int duration, String date, String name, double cost)
  {
    
    this.phoneNumber = phoneNumber;
    this.duration=duration;
    this.date = date;
    this.name = name;
    this.cost = cost;
    
  }
  
  //Accessor Methods
  public String getPhoneNumber ()
  {
    return phoneNumber;
  }
  
  public int getDuration ()
  {
    return duration;
  }
  
  public String getDate ()
  {
    return date;
  }
  
  public String getName ()
  {
    return name;
  }
  
  public double getCost ()
  {
    return cost;
  }
  
  //Mutator Methods 
  
   public void setPhoneNumber (String phoneNumber)
  {
   this.phoneNumber=phoneNumber; 
  }
   
   public void setDuration (int duration)
  {
   this.duration=duration; 
  }
   
   public void setDate (String date)
  {
   this.date=date; 
  }
   
   public void setName (String name)
  {
   this.name=name; 
  }
   
   public void setCost (double cost)
  {
   this.cost=cost; 
  }
  
  
  
  
}