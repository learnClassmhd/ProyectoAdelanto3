package vista.nivelesMate;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class LevelMath5 extends PanelNivel{

    public LevelMath5() throws NumberAnswers {
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("1,5+2,5");
        
        pregunta.getListaRespuestas().add("3,5");
        pregunta.getListaRespuestas().add("4,5");
        pregunta.getListaRespuestas().add("4,0");
        pregunta.setRespuestaCorrecta("4,0");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("3,1+5,7");
        
        pregunta.getListaRespuestas().add("8,8");
        pregunta.getListaRespuestas().add("6,7");
        pregunta.getListaRespuestas().add("9,4");
        pregunta.setRespuestaCorrecta("8,8");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("1,5+4,7");
        
        pregunta.getListaRespuestas().add("6,2");
        pregunta.getListaRespuestas().add("5,13");
        pregunta.getListaRespuestas().add("7,12");
        pregunta.setRespuestaCorrecta("6,2");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("3,21+6,5");
        
        pregunta.getListaRespuestas().add("7,72");
        pregunta.getListaRespuestas().add("9,71");
        pregunta.getListaRespuestas().add("5,83");
        pregunta.setRespuestaCorrecta("9,71");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("17,25+42,31");
        
        pregunta.getListaRespuestas().add("59,56");
        pregunta.getListaRespuestas().add("69,56");
        pregunta.getListaRespuestas().add("52,34");
        pregunta.setRespuestaCorrecta("59,56");
        listaPreguntas.add(pregunta);        
        
        crearCartas(listaPreguntas);
    }
    
}
