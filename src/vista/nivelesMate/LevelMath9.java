package vista.nivelesMate;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class LevelMath9 extends PanelNivel{

    public LevelMath9() throws NumberAnswers {
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("12y^2+32y^2");
        
        pregunta.getListaRespuestas().add("44y^2");
        pregunta.getListaRespuestas().add("34y^4");
        pregunta.getListaRespuestas().add("23y^2");
        pregunta.setRespuestaCorrecta("44y^2");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("34y^5+23y^2");
        
        pregunta.getListaRespuestas().add("34y^5+23^2");
        pregunta.getListaRespuestas().add("57y^7");
        pregunta.getListaRespuestas().add("57y^10");
        pregunta.setRespuestaCorrecta("34y^5+23^2");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("23y^6+12y^6");
        
        pregunta.getListaRespuestas().add("23y^6+12y^6");
        pregunta.getListaRespuestas().add("35y^12");
        pregunta.getListaRespuestas().add("35y^6");
        pregunta.setRespuestaCorrecta("35y^6");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("32y^3+65y^3");
        
        pregunta.getListaRespuestas().add("32y^3+65y^6");
        pregunta.getListaRespuestas().add("97y^12");
        pregunta.getListaRespuestas().add("97y^6");
        pregunta.setRespuestaCorrecta("97y^6");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("23y^6+12y^6");
        
        pregunta.getListaRespuestas().add("23y^6+12y^6");
        pregunta.getListaRespuestas().add("35y^12");
        pregunta.getListaRespuestas().add("35y^12");
        pregunta.setRespuestaCorrecta("35y^6");
        listaPreguntas.add(pregunta); 
        
        
        crearCartas(listaPreguntas);
    }
    
}
