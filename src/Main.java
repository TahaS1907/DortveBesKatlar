import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double kat=0;
        double kat2=0;
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi= scanner.nextInt();
        for(int i=0;i<sayi;i++){

            kat=Math.pow(4,i);
            kat2=Math.pow(5,i);
           if(kat<sayi && kat2<sayi){
               System.out.println("Dördün katı:"+kat+"\n "+"Beşin katı:"+kat2);
           }else break;

        }

    }
}