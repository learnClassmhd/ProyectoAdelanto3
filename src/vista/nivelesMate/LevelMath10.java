package vista.nivelesMate;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class LevelMath10 extends PanelNivel{

    public LevelMath10() throws NumberAnswers {
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("15y^3 x 2y^2");
        
        pregunta.getListaRespuestas().add("30y^6");
        pregunta.getListaRespuestas().add("17y^5");
        pregunta.getListaRespuestas().add("30y^5");
        pregunta.setRespuestaCorrecta("30y^5");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("73y^2 x 43^7");
        
        pregunta.getListaRespuestas().add("3.139y^9");
        pregunta.getListaRespuestas().add("3.139y^14");
        pregunta.getListaRespuestas().add("116y^9");
        pregunta.setRespuestaCorrecta("3.139y^9");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("23y^6 x 12y^2");
        
        pregunta.getListaRespuestas().add("276y^8");
        pregunta.getListaRespuestas().add("276y^12");
        pregunta.getListaRespuestas().add("256y^8");
        pregunta.setRespuestaCorrecta("276y^8");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("12y^5 x 32y^3");
        
        pregunta.getListaRespuestas().add("384y^8");
        pregunta.getListaRespuestas().add("384y^15");
        pregunta.getListaRespuestas().add("44y^6");
        pregunta.setRespuestaCorrecta("384y^8");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("42y^4 x 12y^3");
        
        pregunta.getListaRespuestas().add("504y^7");
        pregunta.getListaRespuestas().add("504y^12");
        pregunta.getListaRespuestas().add("54y^12");
        pregunta.setRespuestaCorrecta("504y^7");
        listaPreguntas.add(pregunta); 
        
        
        crearCartas(listaPreguntas);
    }
    
}
