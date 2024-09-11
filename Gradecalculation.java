import java.util.*;
class Gradecalculation{
    public static void sum(int a,int b,int c,int d,int e){
        int f=a+b+c+d+e;
        System.out.println("Total Marks:"+f);
    }
    public static int average(int a,int b,int c,int d,int e){
        int average=(a+b+c+d+e)/5;
        System.out.println("percentage:"+average+"%");
        return average;
    }
    public static void main (String[] args) {
      Scanner myObj = new Scanner(System.in);
      System.out.print("Enter your Name:");
      String name=myObj.nextLine();
      System.out.println("Welcome here we calculate result"+"\n" + "marks obtained out of 100");
      System.out.print("Enter your Marks in English:");
      int english =myObj.nextInt();
      System.out.print("Enter your Marks in Operating system:");
      int os =myObj.nextInt();
      System.out.print("Enter your Marks in DBMS:");
      int dbms =myObj.nextInt();
      System.out.print("Enter your Marks in Computer Network:");
      int cn =myObj.nextInt();
      System.out.print("Enter your Marks in DSA:");
      int dsa =myObj.nextInt();
      System.out.println("  ");
      System.out.println("result");
      sum(english,os,dbms,cn,dsa);
      int average=average(english,os,dbms,cn,dsa);
      if(average>=90){
          System.out.println("Your grade is : A+");
      }
      else if(average>=80 && average<90){
          System.out.println("Your grade is : A");
      }
      else if(average>=70 && average<80){
          System.out.println("Your grade is : B+");
      }
      else if(average>=60 && average<70){
          System.out.println("Your grade is : B");
      }
      else if(average>=50 && average<60){
          System.out.println("Your grade is : C+");
      }
      else if(average>=40 && average<50){
          System.out.println("Your grade is : C");
      }
      else if (average>=30 && average<40){
          System.out.println("Your grade is : D");
      }
      else{
          System.out.println("Your grade is : E");
      }
        
    }
}