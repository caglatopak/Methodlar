public class JavaMethodlariDemo {
    public static void main(String[] args) {

        // access modifiers ( erisim belirleyiciler)
        // public private protected default
        // public : herkese acik kullanilabilir. tum paketler ve tum siniflar kullanabilir
        // private:yalnizca ayni siniftan erisilebilir en kisitlayicidir encapsulation in cekirdegini olusturur
        // default: ersim belierleyici kullanilmadiginda default olarak belirlernir. sadece ayni java paketi icinde gorulur ve erisilir
        // protected: ayni paket ve kendi sinifinin tum alt siniflarindan erisim saglanir

        // public>protected>default>private

        // methodlar cagirildiginda icinde bahsedilen belirli eylemleri gerceklestiren bir kod blogudur
        // methodlar sadece cagrildiklarinda yurutulur.

        // void ozel bir donus yapoasini istemiyorsak kullanilir\
        // static bu method icin nesne olusturulmasina gerek olmadigini gosterir
        //

        konsolaYazdir();
        yasadigimSehir();

    }

    private static void konsolaYazdir(){

        System.out.println("merhaba dunya");
    }

    private static void yasadigimSehir(){
        System.out.println("yasadigim sehir = Goes ");
    }











}
