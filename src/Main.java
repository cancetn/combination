import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        /*N elemanlı bir kümenin elemanları ile
        oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
        */

        int elemanSayisi1, elemanSayisi2, faktoriyel1=1, faktoriyel2=1, faktoriyel3=1, kombinasyon;

        Scanner inp = new Scanner(System.in);

        System.out.println("Birinci kumenin eleman sayisini giriniz = ");

        elemanSayisi1 = inp.nextInt();

        System.out.println("Ikinci kumenin eleman sayisini giriniz = ");

        elemanSayisi2 = inp.nextInt();

        if(elemanSayisi2>elemanSayisi1){

            System.out.println("Hatali giris !");
            System.out.println("Girilen birinci eleman sayisi, ikinci eleman sayisindan kucuk olamaz!");
            return;
        }

        for(int i =1; i<=elemanSayisi1; i++){
            faktoriyel1 = faktoriyel1 * i;

        }
        for(int i = 1; i<=elemanSayisi2; i++){
            faktoriyel2 = faktoriyel2 * i;
        }
        for(int i = 1; i<=(elemanSayisi1-elemanSayisi2);i++){
            faktoriyel3 = faktoriyel3 * i;
        }

        kombinasyon = faktoriyel1 / (faktoriyel2 * faktoriyel3);

        System.out.println("Girilen elemanlarin kombinasyonu = "+kombinasyon);








    }
}
