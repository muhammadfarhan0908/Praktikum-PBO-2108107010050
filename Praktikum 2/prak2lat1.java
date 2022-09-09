import java.util.Scanner;

public class prak2lat1 {
    public static void main(String [] args)
    {
        Scanner a = new Scanner(System.in);
        int num1, num2;
        System.out.println("masukkan nilai num1");
        num1 = a.nextInt();
        System.out.println("masukkan nilai num2");
        num2 = a.nextInt();

        System.out.println("num1 + num2 =" +(num1+num2));
        System.out.println("num1 - num2 =" +(num1-num2));
        System.out.println("num1 * num2 =" +(num1*num2));
        System.out.println("num1 / num2 =" +((double)num1/(double)num2));
        System.out.println("num1 % num2 =" +(num1%num2));

        a.close();
    }
}
