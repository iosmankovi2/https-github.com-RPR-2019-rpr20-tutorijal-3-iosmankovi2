package ba.unsa.etf.rpr.tutorijal_3;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) throws  IllegalArgumentException {

        //oznaka mobilne mreže predstavlja drugu i treću cifru pozivnog broja tj. 60-67(uslov)
        if(mobilnaMreza < 60 || mobilnaMreza > 67) throw  new  IllegalArgumentException("Mreža nije ispravna!");
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override

    public int hashCode() {
        return  0;
    }

    @Override

    public String ispisi() {
        //Metoda ispisi vraća broj istog oblika "061/987-654".
        return "0"+mobilnaMreza+"/"+broj;
    }

}
