
import java.io.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<n/2;i++){
          if(n%n==0 & n%i!=0){
            System.out.println("The number is prime number");

          }
          else{
            System.out.println("The number is not a prime number");
          }
          }
    }
}

