package segundo_parcial;
import javax.swing.*;

public class primerUX extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public JLabel etiqueta1;
    public JLabel etiqueta2;
    public JLabel etiqueta3;
    public JLabel etiqueta4;
    public JLabel etiqueta5;

    public primerUX()
    {
        setLayout(null);
        setTitle("ventana");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiqueta1 = new JLabel("papu pro");
        etiqueta1.setBounds(100, 100, 100, 15);  //x, y, ancho, alto
        add(etiqueta1);

        
        etiqueta2 = new JLabel("papu pro");
        etiqueta2.setBounds(0, 0, 100, 15);  
        add(etiqueta2);

        etiqueta3 = new JLabel("papu pro");
        etiqueta3.setBounds(230, 240, 100, 15);  
        add(etiqueta3);

        etiqueta4 = new JLabel("papu pro");
        etiqueta4.setBounds(230, 0, 100, 15);  
        add(etiqueta4);

        etiqueta5 = new JLabel("papu pro");
        etiqueta5.setBounds(0, 240, 100, 15);  
        add(etiqueta5);
    }

    public static void main(String[] args) {
        primerUX ventana = new primerUX();
        ventana.setBounds(800, 350, 300, 300);
        ventana.setVisible(true);

        primerUX ventana1 = new primerUX();
        ventana1.setBounds(0, 0, 300, 300);
        ventana1.setVisible(true);

        primerUX ventana2 = new primerUX();
        ventana2.setBounds(1625, 0, 300, 300);
        ventana2.setVisible(true);

        primerUX ventana3 = new primerUX();
        ventana3.setBounds(0, 720, 300, 300);
        ventana3.setVisible(true);

        primerUX ventana4 = new primerUX();
        ventana4.setBounds(1625, 720, 300, 300);
        ventana4.setVisible(true);

    }
}
