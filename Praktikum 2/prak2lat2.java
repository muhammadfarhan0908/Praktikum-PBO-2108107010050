import java.util.Scanner;

public class prak2lat2 {
    public static void main(String []args )
    {
        Scanner a = new Scanner(System.in);
        int nilai;
        System.out.println("masukkan nilai anda");
        nilai = a.nextInt();

        if(nilai >= 87){
            System.out.println("A");
        }else if( nilai < 87 && nilai >= 78){
            System.out.println("AB");
        }else if( nilai < 78 && nilai >= 69){
            System.out.println("B");
        }else if( nilai < 69 && nilai >= 60){
            System.out.println("BC");
        }else if( nilai < 60 && nilai >= 51){
            System.out.println("C");
        }else if( nilai < 51 && nilai >= 41){
            System.out.println("D");
        }else if (nilai<41){
            System.out.println("E");
        }else{
            System.out.println("invalid!");
        a.close();
        }
    }
}
