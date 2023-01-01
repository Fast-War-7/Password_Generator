import java.util.Random;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password length : ");
        int length = sc.nextInt();
        System.out.println("Your password is : "+pass(length));
    }
    public static char[] pass(int length){

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()<>/_-";
        String all = alpha+numbers+lower+symbols;
        Random rand = new Random();
        char[] array = new char[length];
        for(int i=0;i<array.length;i++){
            array[i] = all.charAt(rand.nextInt(all.length()));
        }
        return array;
    }

}
