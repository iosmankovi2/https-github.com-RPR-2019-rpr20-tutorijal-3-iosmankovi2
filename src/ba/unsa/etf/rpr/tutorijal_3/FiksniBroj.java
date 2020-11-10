package ba.unsa.etf.rpr.tutorijal_3;

   public class FiksniBroj extends TelefonskiBroj {

       @Override
       public String ispisi() {
           return null;
       }

       @Override
       public int hashCode() {
           return 0;
       }

       public enum Grad {
        TUZLA, SARAJEVO, ZENICA, TRAVNIK, ORASJE, LIVNO,
        MOSTAR, BIHAC, GORAZDE, SIROKIBRIJEG, BRCKO,
        MRKONJICGRAD, BANJALUKA, PRIJEDOR, DOBOJ,
        SAMAC, BIJELJINA, ZVORNIK, PALE, FOCA, TREBINJE
    }

    private Grad grad;
    private String broj;

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;

    }

}
