package ohtu;

import javax.swing.JTextField;

public class Nollaa extends Operaatio {
    
    private int edellinen = 0;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void suorita() {
        edellinen = sovellus.tulos();
        sovellus.nollaa();
        setTulos(sovellus.tulos());
    }

    @Override
    public void peru() {
        sovellus.plus(edellinen);
        setTulos(sovellus.tulos());
    }
}
