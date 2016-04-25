package ohtu;

import javax.swing.JTextField;

public class Summa extends Operaatio {
    private int edellinen = 0;

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void suorita() {
        edellinen = getArvo();
        sovellus.plus(getArvo());
        setTulos(sovellus.tulos());
    }

    @Override
    public void peru() {
        sovellus.miinus(edellinen);
        setTulos(sovellus.tulos());
    }
}
