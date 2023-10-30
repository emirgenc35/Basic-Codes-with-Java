import java.util.Scanner;

public class Beden_Kitle_İndeksi {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu Giriniz :");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuzu Giriniz : (Örnek; 1,72)");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);
        System.out.println("Beden Kitle İndeksiniz :" + bki);

    }
}
