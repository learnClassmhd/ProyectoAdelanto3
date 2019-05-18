package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.NumberAnswers;
import vista.nivelesIngles.LevelEnglish1;
import vista.nivelesIngles.LevelEnglish10;
import vista.nivelesIngles.LevelEnglish2;
import vista.nivelesIngles.LevelEnglish3;
import vista.nivelesIngles.LevelEnglish4;
import vista.nivelesIngles.LevelEnglish5;
import vista.nivelesIngles.LevelEnglish6;
import vista.nivelesIngles.LevelEnglish7;
import vista.nivelesIngles.LevelEnglish8;
import vista.nivelesIngles.LevelEnglish9;

public class PanelNivelesIngles extends PanelNiveles{
      private Image fondo = new ImageIcon("recursos\\landscape.jpg").getImage();

    public PanelNivelesIngles() throws NumberAnswers {
        Botones boton1 = new Botones(new LevelEnglish1());
        if(boton1.equals(ui)){
            boton1.niveles();
        }
    }
    
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.drawImage(fondo,  0, 0, getWidth(), getHeight(), this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        super.actionPerformed(ae); //To change body of generated methods, choose Tools | Templates.
        if(ae.getSource().equals(getBotones().get(0))){
            JFrame ventanaJuego = (JFrame)(getParent().getParent().getParent().getParent());
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelEnglish1());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(1))){
            JFrame ventanaJuego = (JFrame)(getParent().getParent().getParent().getParent());
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelEnglish2());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(2))){
            JFrame ventanaJuego = (JFrame)(getParent().getParent().getParent().getParent());
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelEnglish3());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(3))){
            JFrame ventanaJuego = (JFrame)(getParent().getParent().getParent().getParent());
            //ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelEnglish4());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(4))){
            JFrame ventanaJuego = (JFrame)(getParent().getParent().getParent().getParent());
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelEnglish5());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(5))){
            JFrame ventanaJuego = (JFrame)(getParent().getParent().getParent().getParent());
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelEnglish6());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(6))){
            JFrame ventanaJuego = (JFrame)(getParent().getParent().getParent().getParent());
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelEnglish7());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(7))){
            JFrame ventanaJuego = (JFrame)(getParent().getParent().getParent().getParent());
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelEnglish8());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(8))){
            JFrame ventanaJuego = (JFrame)(getParent().getParent().getParent().getParent());
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelEnglish9());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
        if(ae.getSource().equals(getBotones().get(9))){
            JFrame ventanaJuego = (JFrame)(getParent().getParent().getParent().getParent());
            ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
            ventanaJuego.remove(this);
            try {
                ventanaJuego.add(new LevelEnglish10());
            } catch (NumberAnswers ex) {
                JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
            }
            ventanaJuego.revalidate();
            ventanaJuego.repaint();
        }
    }
 
}