import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18){
            throw new RuntimeException("Sorry you can't vote: ");
        }else{
            System.out.println("you can vote");


        
        
        }
    }

    
}
