import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        double ortalama;


        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Muzik Notunuz: ");
        muzik = input.nextInt();

        ortalama = (matematik+fizik+turkce+kimya+muzik)/5;

        if ((0<matematik && matematik<100) && (0<fizik && fizik<100) && (0<turkce && turkce<100) && (0<kimya && kimya<100) && (0<muzik && muzik<100)){
            if (ortalama<55) {
                System.out.print("Sinifta Kaldiniz, Seneye Tekrar Gorusmek Uzere :(");
            } else {
                System.out.print("Tebrikler, Sinifi Gectiniz!");
            }
            System.out.print("\nOrtalamaniz: " + ortalama);
        } else {
            System.out.print("Hatali Giris Yaptiniz!\nLutfen Programi Yeniden Calistiriniz.");
        }
    }
}
