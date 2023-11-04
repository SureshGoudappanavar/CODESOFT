import java.util.*;
class codesoft{
    public static void main(String args[]){
        System.out.println("Enter the Physics Marks:");
        Scanner sc=new Scanner(System.in);
        int phy=sc.nextInt();
        System.out.println("Enter the Chemistry Marks:");
        Scanner sd=new Scanner(System.in);
        int chem=sd.nextInt();
        System.out.println("Enter the Maths Marks:");
        Scanner se=new Scanner(System.in);
        int maths=se.nextInt();
        System.out.println("Enter the Kannada Marks:");
        Scanner sf=new Scanner(System.in);
        int kan=sf.nextInt();
        System.out.println("Enter the English Marks:");
        Scanner sg=new Scanner(System.in);
        int eng=sg.nextInt();
        System.out.println("Enter the Hindi Marks:");
        Scanner sh=new Scanner(System.in);
        int hin=sh.nextInt();
        int sum;
        sum=phy+chem+maths+kan+eng+hin;
        int average;
        average=sum/6;
        if(average>=90){
            System.out.println("Your grade is:"+"A+");
        }
       else if (average>=80 && average<90){
            System.out.println("Your grade is:"+"A");
        }
      else if(average>=70 && average<80){
              System.out.println("Your grade is:"+"B+");
      }
      else if(average>=60 && average<70){
              System.out.println("Your grade is:"+"B");
      }
      else if (average>=50 && average<60){
              System.out.println("Your grade is:"+"C+");}
              else if (average>=40 && average<50){
              System.out.println("Your grade is:"+"C");}
              
      else if (average>=35 && average<40){
              System.out.println("Your grade is:"+"P");}
              else {
                  System.out.println("Fail");
              }
              System.out.println("Sum of marks is :"+sum);
              System.out.println("Average  of marks is :"+average);
              
      }
}
