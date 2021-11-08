import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String userinput; 
    do{
    System.out.println("Enter your message: ");
    String m= s.nextLine();
    System.out.print("Enter the offset value: ");
      int ov= s.nextInt(); 
    boolean v= valid(m, ov);
      if(!v){
        System.out.println("Sorry, we can only process messages with letters and spaces, and the offset must be between 0 and 26.");
      }
      else{
        System.out.println("Your secret message is..."); 
        String e= encrypt(m,ov);
      }
      System.out.print("Do you want to encrypt another message.: "); 
    userinput= s.nextLine();
      }while(userinput.equals("y") ||userinput.equals("Y"));
    System.out.println("Closing out...");
  }
  public static boolean valid(String msg, int value){
    if(value < 0 || value > 26){
    return false;
    }
    for(int i=0; i<msg.length(); i++){
      if(msg.charAt(i)>=65 && msg.charAt(i)<=90 || msg.charAt(i) >=97 && msg.charAt(i) <= 122 || msg.charAt(i)==32){
      }
      else{
        return false; 
        }
    }
    return true; 
  }
  public static String encrypt(String msg, int offset){
     String en = ""; 
    String x = msg.toUpperCase();  
    for(int i=0; i<x.length(); i++){
    char c = x.charAt(i); 
      if(c != 32){
        c= (char)((((c-65)+offset)%26)+65);
      }
      en+=c; 
    }
    return en;
    
  }
}
  
