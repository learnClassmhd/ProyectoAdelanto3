package vista.nivelesMate;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class LevelMath6 extends PanelNivel{

    public LevelMath6() throws NumberAnswers {
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("20,5-10,9");
        
        pregunta.getListaRespuestas().add("9,6");
        pregunta.getListaRespuestas().add("8,4");
        pregunta.getListaRespuestas().add("10,3");
        pregunta.setRespuestaCorrecta("9,8");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("321,41-32,43");
        
        pregunta.getListaRespuestas().add("288,98");
        pregunta.getListaRespuestas().add("321,42");
        pregunta.getListaRespuestas().add("531,23");
        pregunta.setRespuestaCorrecta("288,98");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("645,32-53,43");
        
        pregunta.getListaRespuestas().add("591,89");
        pregunta.getListaRespuestas().add("592,24");
        pregunta.getListaRespuestas().add("641,412");
        pregunta.setRespuestaCorrecta("591,89");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("849,8-768,4");
        
        pregunta.getListaRespuestas().add("81,4");
        pregunta.getListaRespuestas().add("120,4");
        pregunta.getListaRespuestas().add("110,43");
        pregunta.setRespuestaCorrecta("81,4");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("63,45-42,52");
        
        pregunta.getListaRespuestas().add("20,93");
        pregunta.getListaRespuestas().add("69,56");
        pregunta.getListaRespuestas().add("58,34");
        pregunta.setRespuestaCorrecta("20,93");
        listaPreguntas.add(pregunta);        
        
        crearCartas(listaPreguntas);
    }
    
}
