import java.util.*;
class CodeSoft{
    public static void main(String[] args) {
       int a=10;
        Random rand = new Random();
          // Generate random integers in range 0 to 99

          int int1 = rand.nextInt(100);
         for (int i=0;i<10;i++){
            System.out.println("Guess the number:");
            Scanner sc=new Scanner(System.in);
            int guess=sc.nextInt();
        
          if(guess==int1){
              System.out.println("You guessed the correct number");
              System.out.println("now your score is "+a);
              return ;
          }
        else{
            System.out.println("please try again:");
            
            a=a-1;
        }
        if (int1>guess){
            System.out.println("Your guessing number is less than actual number");
        }
        if(int1<guess){
            System.out.println("Your guessing number is greater than actual number");
        }
        System.out.println("now your score is "+a);
      }
             
    }
}
