package viktor.week02;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputVersion2 {


    public static int readUserInputIntV2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir bitte eine Ganzzahl an: ");
        int num=1;
        try{
            num = sc.nextInt();
        } catch(InputMismatchException ime) {
            System.out.println("Hier wurde keine Ganzzahl angegeben!");
        }
        return num;

    }



    public static void main(String[] args) {

        int num = readUserInputIntV2();
        System.out.println(num);

    }
}
