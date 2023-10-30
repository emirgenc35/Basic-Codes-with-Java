import java.util.Scanner;

public class Basit_Hesap_Makinesi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************************");

        String işlemler = "1. Toplama İşlemi \n"
                + "2.Çıkarma İşlemi \n"
                + "3.Çarpma İşlemi \n"
                + "4. Bölme İşlemi";
        System.out.println(işlemler);

        System.out.println("*********************************");
        System.out.println("İşlem Seçiniz");
        String işlem = scanner.nextLine();
        int a;
        int b;

        switch (işlem) {
            case "1":
                System.out.println("Birinci Sayıyı Giriniz :");
                a = scanner.nextInt();
                System.out.println("İkinci Sayıyı Giriniz :");
                b = scanner.nextInt();
                System.out.println("Girilen Değerler Toplamı :" + (a + b));
                break;

            case "2":
                System.out.println("Birinci Sayıyı Giriniz :");
                a = scanner.nextInt();
                System.out.println("İkinci Sayıyı Giriniz :");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Farkları :" + (a - b));
                break;
            case "3":
                System.out.println("Birinci Sayıyı Giriniz :");
                a = scanner.nextInt();
                System.out.println("İkinci Sayıyı Giriniz :");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Çarpımı :" + (a * b));
                break;
            case "4":
                System.out.println("Birinci Sayıyı Giriniz :");
                a = scanner.nextInt();
                System.out.println("İkinci Sayıyı Giriniz :");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Bölümü :" + (double) (a / b));
                break;
            default:
                System.out.println("Geçersiz İşlem :");

        }

    }
}
