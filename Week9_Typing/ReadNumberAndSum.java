package Week9_Typing;

import java.util.Scanner;

public class ReadNumberAndSum {
    public static void main(String[] args) {
readTenNumberAndSum();
    }
    public static  void  readTenNumberAndSum(){
        Scanner sc = new Scanner(System.in);
       int counter = 1;
       int sum = 0;
       while(true){
          //int order = counter+1;
           System.out.println("Enter number #" + counter + " : " );
           boolean isInt = sc.hasNextInt();// true
           if(isInt){ // if(true)
               int number = sc.nextInt();
               counter++;
                sum+= number;
                if(counter > 10){

                    break;
                }
           }else{
               System.out.println("Invalid number");
           }

       }
        System.out.println("sum = " + sum);


    }
}
