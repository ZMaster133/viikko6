package ohtu;

import javax.swing.JTextField;

public class Erotus extends Operaatio {

    private int edellinen = 0;

    public Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void suorita() {
        edellinen = getArvo();
        sovellus.miinus(getArvo());
        setTulos(sovellus.tulos());
    }

    @Override
    public void peru() {
        sovellus.plus(edellinen);
        setTulos(sovellus.tulos());
    }
}
