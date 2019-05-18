package vista;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import modelo.NumberAnswers;
import vista.nivelesMate.LevelMath1;
import vista.nivelesMate.LevelMath10;
import vista.nivelesMate.LevelMath2;
import vista.nivelesMate.LevelMath3;
import vista.nivelesMate.LevelMath4;
import vista.nivelesMate.LevelMath5;
import vista.nivelesMate.LevelMath6;
import vista.nivelesMate.LevelMath7;
import vista.nivelesMate.LevelMath8;
import vista.nivelesMate.LevelMath9;

public class PanelNivelesMatematicas extends PanelNiveles{

    private Ventana ventanaJuego;

    public PanelNivelesMatematicas() throws NumberAnswers {
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        super.actionPerformed(ae); //To change body of generated methods, choose Tools | Templates.
        if(ae.getSource().equals(getBotones().get(0))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelMath1());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(1))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelMath2());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(2))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelMath3());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(3))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelMath4());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(4))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelMath5());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(5))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelMath6());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(6))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelMath7());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(7))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelMath8());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(8))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelMath9());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(9))){
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelMath10());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
    }
}
