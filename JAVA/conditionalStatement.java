import java.util.Scanner;
public class conditionalStatement {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("plz enter the cash-->");

        int cash =sc.nextInt();
        if(cash<10){
            System.out.println("cannot buy any things");
            System.out.println("get more cash");    
        }
        else if(cash>10&&cash<50){
            System.out.println("you buy one things");
        }
        else{
            System.out.println("you buy both things");
        }
    }

    
    
}
