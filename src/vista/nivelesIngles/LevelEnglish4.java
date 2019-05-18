package vista.nivelesIngles;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class LevelEnglish4 extends PanelNivel{

    public LevelEnglish4() throws NumberAnswers{
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("I");
        
        pregunta.getListaRespuestas().add("Yo");
        pregunta.getListaRespuestas().add("Tu");
        pregunta.getListaRespuestas().add("Ellos");
        pregunta.setRespuestaCorrecta("Yo");
        listaPreguntas.add(pregunta);
        
        pregunta = new Pregunta("He");
        
        pregunta.getListaRespuestas().add("El");
        pregunta.getListaRespuestas().add("Nosotros");
        pregunta.getListaRespuestas().add("Ella");
        pregunta.setRespuestaCorrecta("El");
        listaPreguntas.add(pregunta);
        
        pregunta = new Pregunta("It");
        
        pregunta.getListaRespuestas().add("Eso");
        pregunta.getListaRespuestas().add("Yo");
        pregunta.getListaRespuestas().add("Nosotros");
        pregunta.setRespuestaCorrecta("Eso");
        listaPreguntas.add(pregunta);
        
        pregunta = new Pregunta("She");
        
        pregunta.getListaRespuestas().add("Ella");
        pregunta.getListaRespuestas().add("Yo");
        pregunta.getListaRespuestas().add("El");
        pregunta.setRespuestaCorrecta("Ella");
        listaPreguntas.add(pregunta);
        
        pregunta = new Pregunta("We");
        
        pregunta.getListaRespuestas().add("Nosotros");
        pregunta.getListaRespuestas().add("Ella");
        pregunta.getListaRespuestas().add("Yo");
        pregunta.setRespuestaCorrecta("Nosotos");
        listaPreguntas.add(pregunta); 
        
        crearCartas(listaPreguntas);
    }
}
