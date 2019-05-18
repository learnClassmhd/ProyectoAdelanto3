package vista.nivelesMate;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class LevelMath7 extends PanelNivel{

    public LevelMath7() throws NumberAnswers {
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("12,5x25,2");
        
        pregunta.getListaRespuestas().add("315,0");
        pregunta.getListaRespuestas().add("421,1");
        pregunta.getListaRespuestas().add("523,5");
        pregunta.setRespuestaCorrecta("315,0");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("130,6x17,2");
        
        pregunta.getListaRespuestas().add("2.246,32");
        pregunta.getListaRespuestas().add("4.323,45");
        pregunta.getListaRespuestas().add("5.242,16");
        pregunta.setRespuestaCorrecta("2.246,32");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("15,4x42,5");
        
        pregunta.getListaRespuestas().add("654,5");
        pregunta.getListaRespuestas().add("541,2");
        pregunta.getListaRespuestas().add("412,4");
        pregunta.setRespuestaCorrecta("654,5");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("32,6x36,5");
        
        pregunta.getListaRespuestas().add("1.189,9");
        pregunta.getListaRespuestas().add("3.421,4");
        pregunta.getListaRespuestas().add("5.235,3");
        pregunta.setRespuestaCorrecta("1.189,9");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("12,42x23,21");
        
        pregunta.getListaRespuestas().add("288,2643");
        pregunta.getListaRespuestas().add("288,2682");
        pregunta.getListaRespuestas().add("388,2643");
        pregunta.setRespuestaCorrecta("288,2682");
        listaPreguntas.add(pregunta);        
        
        crearCartas(listaPreguntas);
    }
    
}
