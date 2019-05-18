package vista.nivelesMate;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class LevelMath8 extends PanelNivel{

    public LevelMath8() throws NumberAnswers {
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("253,32/124,43");
        
        pregunta.getListaRespuestas().add("2,035");
        pregunta.getListaRespuestas().add("4,211");
        pregunta.getListaRespuestas().add("5,235");
        pregunta.setRespuestaCorrecta("2,035");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("67,47/32,65");
        
        pregunta.getListaRespuestas().add("2,066");
        pregunta.getListaRespuestas().add("2,323");
        pregunta.getListaRespuestas().add("5,242");
        pregunta.setRespuestaCorrecta("2,066");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("57,534/1,321");
        
        pregunta.getListaRespuestas().add("43,553");
        pregunta.getListaRespuestas().add("35,412");
        pregunta.getListaRespuestas().add("54,124");
        pregunta.setRespuestaCorrecta("43,553");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("787,656/95,875");
        
        pregunta.getListaRespuestas().add("8,215");
        pregunta.getListaRespuestas().add("4,214");
        pregunta.getListaRespuestas().add("5,235");
        pregunta.setRespuestaCorrecta("8,215");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("41,24/23,14");
        
        pregunta.getListaRespuestas().add("1,782");
        pregunta.getListaRespuestas().add("2,423");
        pregunta.getListaRespuestas().add("2,798");
        pregunta.setRespuestaCorrecta("1,782");
        listaPreguntas.add(pregunta);        
        
        crearCartas(listaPreguntas);
    }
    
}
