package modelo;

public class ganaO extends Resultado{

    @Override
    public void tipoderesultado(){
    if (buno.equals("O") && bdos.equals("O") && btres.equals("O")){
        return;
    }
    if (bcuatro.equals("O") && bcinco.equals("O") && bseis.equals("O")){
        return;
    }
    if (bsiete.equals("O") && bocho.equals("O") && bnueve.equals("O")){
        return;
    }
    if (buno.equals("O") && bcuatro.equals("O") && bsiete.equals("O")){
        return;
    }
    if (bdos.equals("O") && bcinco.equals("O") && bocho.equals("O")){
        return;
    }
    if (btres.equals("O") && bseis.equals("O") && bnueve.equals("O")){
        return;
    }    
    if (buno.equals("O") && bcinco.equals("O") && bnueve.equals("O")){
        return;
    }    
    if (btres.equals("O") && bcinco.equals("O") && bsiete.equals("O")){
        return;
    }   
        
        
    }
    
}
