
package modelo;

import javax.swing.JOptionPane;

public class empate extends Resultado{

    
    @Override
    public void tipoderesultado(){
        if (buno !="" && bdos != "" && btres !="" && bcuatro !=""
        && bcinco !="" && bseis !="" && bsiete !="" && bocho !="" && bnueve !="") {
        JOptionPane.showMessageDialog(null,"Empate");
    }
    }
}
