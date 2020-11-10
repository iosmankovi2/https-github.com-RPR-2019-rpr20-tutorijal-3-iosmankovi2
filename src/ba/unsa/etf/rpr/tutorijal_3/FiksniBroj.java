package ba.unsa.etf.rpr.tutorijal_3;

   public class FiksniBroj extends TelefonskiBroj {

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

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

       @Override
       public String ispisi() {
           String ispisi="";
           switch(grad)
           {
               case TUZLA:
                   ispisi += "035/";
                   break;
               case SARAJEVO:
                   ispisi += "033/";
                   break;
               case ZENICA:
                   ispisi += "032/";
                   break;
               case TRAVNIK:
                   ispisi += "030/";
                   break;
               case ORASJE:
                   ispisi += "031/";
                   break;
               case LIVNO:
                   ispisi += "034/";
               case MOSTAR:
                   ispisi += "036/";
                   break;
               case BIHAC:
                   ispisi += "037/";
                   break;
               case GORAZDE:
                   ispisi += "038/";
                   break;
               case SIROKIBRIJEG:
                   ispisi += "039";
                   break;
               case BRCKO:
                   ispisi += "049";
                   break;
               case MRKONJICGRAD:
                   ispisi += "050/";
                   break;
               case BANJALUKA:
                   ispisi += "051/";
                   break;
               case PRIJEDOR:
                   ispisi += "052/";
                   break;
               case DOBOJ:
                   ispisi += "053/";
                   break;
               case SAMAC:
                   ispisi += "054/";
                   break;
               case BIJELJINA:
                   ispisi += "055/";
                   break;
               case ZVORNIK:
                   ispisi += "056/";
                   break;
               case PALE:
                   ispisi += "057/";
                   break;
               case FOCA:
                   ispisi += "058/";
                   break;
               case TREBINJE:
                   ispisi += "059/";
                   break;

               default:
                   ispisi += "?";
                   break;

           }
           ispisi += broj;
           return  ispisi;
       }

       @Override
       public int hashCode() {
           return 0;
       }
}
