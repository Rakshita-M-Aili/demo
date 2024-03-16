package player;

public class Player {
  private String name;
  private char symbol;
  private String address;
  private String contactnumber;
  private String emailId;
  private int age;


  public void setPlayerDetails(String name,char symbol,String address,String contactnumber,String emailId,int age){
    this.name=name;
    this.symbol=symbol;
    this.address=address;
    this.contactnumber=contactnumber;
    this.emailId=emailId;
    this.age=age;
  }

  public void setPlayernameandage(String name,int age){
    this.name=name;
    this.age=age;
  }
  public void setPlayernamesymbolemailIdage(String name,char symbol,String emailId,int age){
    this.name=name;
    this.age=age;
    this.emailId=emailId;
    this.symbol=symbol;

  }
  public void changesymbol(char symbol){
    this.symbol=symbol;
  }
  public void setPlayernameandsymbol(String name,char symbol){
    this.name=name;
    this.symbol=symbol;
  }
  public String getPlayername(){
    return this.name;
  }
   
  public char  getPlayersymbol(){
    return this.symbol;
  }

   public void getPlayernameandsymbol(){
    System.out.println("player name " + this.name);
    System.out.println("player symbol " + this.symbol);
   }
    
  public void getPlayerDetails(){
    System.out.println("player name:" + this.name);
    System.out.println("player symbol:" + this.symbol);
    System.out.println("player emailId:" + this.emailId);
    System.out.println("player age:" + this.age);
    System.out.println("player contactnumber:" + this.contactnumber);
    System.out.println("player address:" + this.address);
  }
}
