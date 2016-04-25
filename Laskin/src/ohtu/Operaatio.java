package ohtu;

import javax.swing.JTextField;

public abstract class Operaatio implements Komento {
    protected Sovelluslogiikka sovellus;
    protected JTextField tuloskentta;
    protected JTextField syotekentta;
    
    public Operaatio(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }
    
    protected int getArvo() {
        int arvo = 0;
 
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        
        return arvo;
    }
    
    protected void setTulos(int tulos) {
        tuloskentta.setText("" + tulos);
        syotekentta.setText("");
    }
}
