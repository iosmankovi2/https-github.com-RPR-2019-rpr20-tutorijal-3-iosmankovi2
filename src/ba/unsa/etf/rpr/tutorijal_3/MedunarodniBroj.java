package ba.unsa.etf.rpr.tutorijal_3;

public class MedunarodniBroj extends TelefonskiBroj {

    private String drzava;
    private String broj;

    // konstruktor
     public MedunarodniBroj(String drzava, String broj) {
         this.drzava = drzava;
         this.broj = broj;
     }

     @Override

     public int hashCode() {
         return  0;
     }

     @Override

     public String ispisi() {

         return ""+drzava + broj;
     }
}
