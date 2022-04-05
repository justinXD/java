package proyecto_2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class historia extends JFrame{
    /**
   *
   */
  private static final long serialVersionUID = 1L;
  public JLabel etiqueta, portada;
    public historia(){
       setLayout(null);
       setTitle("Who we are");
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       getContentPane().setBackground(new Color(250,249,248));
       setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());

       ImageIcon imagen = new ImageIcon("logomoda.png");
       portada = new JLabel(imagen);
       portada.setBounds(0,0,490,150);
       Icon icono = new ImageIcon(imagen.getImage() .getScaledInstance(portada.getWidth(),portada.getHeight(),Image.SCALE_DEFAULT));
       portada.setIcon(icono);
       add(portada);

       Font fuentee = new Font("Times New Roman", Font.PLAIN, 20);
       etiqueta = new JLabel("<html>Nuestra historia inicia en 2018, con ayuda de unos contactos<p>europeos obtuvimos ropa de francia y cuando la<p> pusimos en venta todo se nos termino en<p> unas cuantas horas,<p> de alli surgio la idea de este proyecto que fue creciendo <p>hasta que pasamos de anuncios en facebook a <p> a esta pagina para alcanzar a mas gente <p>de una mejor manera.<html>");
       etiqueta.setBounds(30,200,600,200);
       etiqueta.setFont(fuentee);
       etiqueta.setForeground(new Color(227, 13, 51));
       add(etiqueta);
}
    public static void main(String args[]){
      historia ventana = new historia();
      ventana.setBounds(300,250,500,700);
      ventana.setVisible(true);
      ventana.setResizable(false);
    }
}