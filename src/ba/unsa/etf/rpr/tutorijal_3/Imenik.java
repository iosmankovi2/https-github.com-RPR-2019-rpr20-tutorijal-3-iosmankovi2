package ba.unsa.etf.rpr.tutorijal_3;

import ba.unsa.etf.rpr.tutorijal_3.FiksniBroj.Grad;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {

    public HashMap<String, TelefonskiBroj> getBrojKorisnika() {
        return brojKorisnika;
    }

    private HashMap<String, TelefonskiBroj> brojKorisnika = new HashMap<>();

    public Imenik() {}

    public String dajBroj(String ime) {
        return brojKorisnika.get(ime).ispisi();
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        brojKorisnika.putIfAbsent(ime, broj);
    }

    public Set<String> izGrada(Grad g) {
        Set<String> stanovniciGrada = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> elementi : brojKorisnika.entrySet()) {
            TelefonskiBroj broj = elementi.getValue();
            if(broj instanceof  FiksniBroj) {
                if(((FiksniBroj)broj).getGrad().equals(g)) stanovniciGrada.add(elementi.getKey());
            }
        }
        return  stanovniciGrada;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> gradskiBrojevi = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> elementi : brojKorisnika.entrySet()) {
            TelefonskiBroj broj = elementi.getValue();
            if(broj instanceof  FiksniBroj) {
                if(((FiksniBroj)broj).getGrad().equals(g)) gradskiBrojevi.add(elementi.getValue());
            }
        }
        return gradskiBrojevi;
    }

    public String naSlovo(char s) {
        int br = 1;
        StringBuilder ljudi = new StringBuilder();
        for(Map.Entry<String, TelefonskiBroj> elementi : brojKorisnika.entrySet()) {
            if(elementi.getKey().charAt(0) == s)
            {
                ljudi.append(String.format("%d. %s - %s\n",br, elementi.getKey(), elementi.getValue().ispisi()));
                br++;
            }
        }
        return ljudi.toString();
    }

    public String dajIme(TelefonskiBroj broj) {
        for(Map.Entry<String, TelefonskiBroj> elementi : brojKorisnika.entrySet()) {
            if(elementi.getValue().compareTo(broj) == 0) return elementi.getKey();
        }
        return "";
    }
}
