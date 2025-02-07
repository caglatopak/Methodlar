public class D2_MethodParametreDemo {
    public static void main(String[] args) {

        konsolCiktisi("cagla topak");
        konsolCiktisi("ozan");
        toplamaIslemi(5,10);
        toplamaIslemi(128,654);
        caglaTopak("cagla", 100);
    }

    private static void konsolCiktisi(String isim ){
        System.out.println(" merhaba dunya" + " ve merhaba " + isim);

    }

     private static void toplamaIslemi(int a, int b){

    System.out.println( a+b);
}

  // konsola kisinin adini ve sinav notunu yazdiran bir method olusturun
    // method 2 adet parametre alsin

    private static void caglaTopak(String isim, int Not){

        System.out.println(isim + " " + Not );
    }

}
