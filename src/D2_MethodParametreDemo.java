public class D2_MethodParametreDemo {
    public static void main(String[] args) {

        konsolCiktisi("cagla topak");
        konsolCiktisi("ozan");
        toplamaIslemi(5,10);
        toplamaIslemi(128,654);
        caglaTopak("cagla", 100);

        System.out.println("--------------------------------------------------");

       // int carpmaSonucu= carpma(5,9);
        //System.out.println(carpmaSonucu);

        System.out.println(carpma(5,9));
        System.out.println(carpma(6,20));

        System.out.println("-------------------------------------------------");


        System.out.println(toplama(12,36));

        System.out.println("----------------------------------------------------");

        System.out.println(toplama(23,48,65 ));
        System.out.println(toplama(1.2,5.6,7.8));


    }

    private static void konsolCiktisi(String isim ){
        System.out.println(" merhaba dunya" + " ve merhaba " + isim);

    }

     private static void toplamaIslemi(int a, int b){

    System.out.println( a+b);
}

  // konsola kisinin adini ve sinav notunu yazdiran bir method olusturun
    // method 2 adet parametre alsin

    // methodlari dinamik hale getirmek icin bu parametreler kullanilir

    private static void caglaTopak(String isim, int Not){

        System.out.println(isim + " " + Not );
    }

    //return type geri donus veren methodlar

    private static int carpma(int a, int b){
        int carpmasonucu = a*b;
        return carpmasonucu;


    }

     private static int toplama(int x, int y){

        int toplamaIslemi= x+y;
        return toplamaIslemi;
        // yada sadece return x+y; de diyebiliriz.


     }
     // method overloading
    // methodlarin asiri yuklenmesi
    // method isimleri ayni olmasina ragmen parametreleri farkli oldugu icin java bunu farkeder ve hata vermez


    private static int toplama(int x, int y, int z) {
        return x + y + z;

    }

  private static double toplama(double a, double b, double c){

        return a+b+c;

  }




}
