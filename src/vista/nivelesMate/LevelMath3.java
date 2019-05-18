package vista.nivelesMate;

import java.io.File;
import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Reproductor;
import modelo.Preguntas;
import vista.PanelNivel;

public class LevelMath3 extends PanelNivel{
    

    public LevelMath3() throws NumberAnswers{
        
        Reproductor.reproducir(new File("recursos\\ost.wav"));
        
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
       
        pregunta = new Pregunta("2x3");
        
        pregunta.getListaRespuestas().add("3");
        pregunta.getListaRespuestas().add("6");
        pregunta.getListaRespuestas().add("10");
        pregunta.setRespuestaCorrecta("6");
        listaPreguntas.add(pregunta);  
        
        pregunta = new Pregunta("2x1");
        
        pregunta.getListaRespuestas().add("2");
        pregunta.getListaRespuestas().add("4");
        pregunta.getListaRespuestas().add("10");
        pregunta.setRespuestaCorrecta("2");
        listaPreguntas.add(pregunta);  
        
        pregunta = new Pregunta("2x5");
        
        pregunta.getListaRespuestas().add("6");
        pregunta.getListaRespuestas().add("10");
        pregunta.getListaRespuestas().add("16");
        pregunta.setRespuestaCorrecta("10");
        listaPreguntas.add(pregunta);  
        
        pregunta = new Pregunta("2x2");
        
        pregunta.getListaRespuestas().add("4");
        pregunta.getListaRespuestas().add("6");
        pregunta.getListaRespuestas().add("20");
        pregunta.setRespuestaCorrecta("4");
        listaPreguntas.add(pregunta);  
        
        pregunta = new Pregunta("2x7");
        
        pregunta.getListaRespuestas().add("12");
        pregunta.getListaRespuestas().add("2");
        pregunta.getListaRespuestas().add("14");
        pregunta.setRespuestaCorrecta("14");
        listaPreguntas.add(pregunta);  
        
        pregunta = new Pregunta("2x10");
        
        pregunta.getListaRespuestas().add("12");
        pregunta.getListaRespuestas().add("21");
        pregunta.getListaRespuestas().add("20");
        pregunta.setRespuestaCorrecta("20");
        listaPreguntas.add(pregunta);        
        
        crearCartas(listaPreguntas);
        
    }
    
}
