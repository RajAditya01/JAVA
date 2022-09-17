import java.utl.Scanner;
public class project {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mynum =(int)(Math.random()*100);
        int usernum = 0;
        do{
            System.out.println("Guess my no :--> ");
            usernum =sc.nextInt();
            if(usernum == mynum){
                System.out.println("WOOHO CORRECT NUM!!!");
                break;
            }
        }


    }
    
}
