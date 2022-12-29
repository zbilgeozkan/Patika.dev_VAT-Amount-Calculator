
/* KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını
ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak
KDV tutarı hesaplayan programı yazınız. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // İlk adım, değişkenleri tanımlama; sonrasında ise kullanıcıdan değer alınacak
        double tutar, kdvOrani = 0.18;  // double tutar, kdvOrani = 0.18, kdvTutari, kdvliTutar;  --->  Satır 30 ve Satır 33' teki double ları kullanmamak için.
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarınızı giriniz: ");
        tutar = input.nextDouble();

        double kdvTutari = tutar * kdvOrani;
            // System.out.println(kdvTutari);

        double kdvliTutar = tutar + kdvTutari;
            // System.out.println(kdvliTutar);

        System.out.println("\nKDV'siz Tutarınız: " + tutar);
        System.out.println("KDV Oranınız: " + kdvOrani);
        System.out.println("KDV Tutarınız: " + kdvTutari);
        System.out.println("KDV'li Tutarınız: " + kdvliTutar);

    }
}