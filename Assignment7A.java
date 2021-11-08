import java.util.Scanner;
class Assignment7A {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    float [] lab= new float[13]; 
      System.out.println("");
    System.out.println("Labs");
    for(int i=0; i<lab.length; i++){
    System.out.println("Enter Grade" + i + ": ");
      float input= s.nextFloat(); 
      lab[i]=input; 
      }
float avg= averagev(lab,lab.length);
    float w= weighted(avg,0.10f);
System.out.print("Weighted Points: "+w);

    
  float [] assign= new float[8];
    for(int i=0; i<assign.length; i++){
    System.out.println("Enter Grade" + i + ": ");
      float input= s.nextFloat(); 
      assign[i]=input; 
      }
    float avg1= averagev(assign,assign.length);
    float w1= weighted(avg1, 0.4f);
    System.out.println("Weighted Points: "+w1);

    System.out.println("\nMidterm");
    System.out.print("Enter Grade #1: ");
    float g1= s.nextFloat();
    float w2= weighted(g1, 0.2f);
    System.out.println("Weighted Points: "+w2); 
    System.out.println("\nExam");
    System.out.print("Enter Grade #1: ");
    float g2= s.nextFloat();
    float w3= weighted(g2, 0.3f);
    System.out.println("Weighted Points: "+w3);
    System.out.println("\nYour final grade for CSE1321L is: "+(w+w1+w2+w3));
    
  public static float averagev(float[]grades,int value){
    float sum= 0;
    for(int i=0; i<grades.length; i++){
      sum+=grades[i]; 
    }
    sum/=grades.length; 
    return sum; 
  }
  public static float weighted(float grade, float percent){
    return grade*percent;
  } 
}
