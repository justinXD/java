package segundo_parcial;
import javax.swing.*;
import java.awt.event.*;

public class primerFormulario extends JFrame implements ActionListener, KeyListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public JLabel etiqueta;
    public JLabel etiqueta1;
    public JLabel etiqueta2;
    public JButton boton;
    public JButton boton2;
    public JTextField campo;
    public JTextField campo1;
    public JTextField campo2;
    public String cadena;
    public int longitudCadena;

    public primerFormulario()
    {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("mini-encuesta");

        campo = new JTextField();
        campo.setBounds(30, 40, 300, 30);
        add(campo);

        campo1 = new JTextField();
        campo1.setBounds(30, 80, 300, 30);
        add(campo1);

        campo2 = new JTextField();
        campo2.setBounds(30, 120, 300, 30);
        add(campo2);

        etiqueta = new JLabel("nombre");
        etiqueta.setBounds(360, 40, 300, 30);
        add(etiqueta);

        etiqueta1 = new JLabel("direccion");
        etiqueta1.setBounds(360, 80, 300, 30);
        add(etiqueta1);

        etiqueta2 = new JLabel("correo electronico");
        etiqueta2.setBounds(360, 120, 300, 30);
        add(etiqueta2);

        boton = new JButton("salir");
        boton.setBounds(170, 200, 100, 30);
        add(boton);

        boton2 = new JButton("actualizar");
        boton2.setBounds(280, 200, 100, 30);
        boton2.requestFocus();
        add(boton2);

        setFocusable(true);
        campo.addKeyListener(this);
        campo1.addKeyListener(this);
        campo2.addKeyListener(this);
        boton.addActionListener(this);
        boton2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent accion)
    {
        if (accion.getSource() == boton) {
           System.exit(0); 
        }
        if (accion.getSource() == boton2) {
            etiqueta.setText(campo.getText());
            etiqueta1.setText(campo1.getText());
            etiqueta2.setText(campo2.getText());

            cadena = etiqueta.getText();
            longitudCadena = cadena.length();
            for (int x=0; x < longitudCadena; x++){
                char caracter = cadena.charAt(x);
                int  caracterCode = (int) caracter;
                System.out.println(caracterCode);
                if (caracterCode >= 48 && caracterCode <58){ 
                    JOptionPane.showMessageDialog(null, "Hay un numero en uno de los tres campos");
                }
            }
            cadena = etiqueta1.getText();
            longitudCadena = cadena.length();
            for (int x=0; x < longitudCadena; x++){
                char caracter = cadena.charAt(x);
                int  caracterCode = (int) caracter;
                if (caracterCode >= 48 && caracterCode <58){ 
                    JOptionPane.showMessageDialog(null, "Hay un numero en uno de los tres campos");
                }
            }
            cadena = etiqueta2.getText();
            longitudCadena = cadena.length();
            for (int x=0; x < longitudCadena; x++){
                char caracter = cadena.charAt(x);
                int  caracterCode = (int) caracter;
                if (caracterCode >= 48 && caracterCode <58){ 
                    JOptionPane.showMessageDialog(null, "Hay un numero en uno de los tres campos");
                }
            }
        }
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent accion) {

        if (accion.getKeyCode() == 10) {
            
            etiqueta.setText(campo.getText());
            etiqueta1.setText(campo1.getText());
            etiqueta2.setText(campo2.getText());

            cadena = etiqueta.getText();
            longitudCadena = cadena.length();

            for (int x=0; x < longitudCadena; x++){
                char caracter = cadena.charAt(x);
                int  caracterCode = (int) caracter;
                if (caracterCode >= 48 && caracterCode <58){ 
                    JOptionPane.showMessageDialog(null, "Hay un numero en uno de los tres campos");
                }
            }
            cadena = etiqueta1.getText();
            longitudCadena = cadena.length();
            for (int x=0; x < longitudCadena; x++){
                char caracter = cadena.charAt(x);
                int  caracterCode = (int) caracter;
                if (caracterCode >= 48 && caracterCode <58){ 
                    JOptionPane.showMessageDialog(null, "Hay un numero en uno de los tres campos");
                }
            }
            cadena = etiqueta2.getText();
            longitudCadena = cadena.length();
            for (int x=0; x < longitudCadena; x++){
                char caracter = cadena.charAt(x);
                int  caracterCode = (int) caracter;
                if (caracterCode >= 48 && caracterCode <58){ 
                    JOptionPane.showMessageDialog(null, "Hay un numero en uno de los tres campos");
                }
            }
        }
    }
    public static void main(String[] args) {
        primerFormulario ventana = new primerFormulario();
        ventana.setBounds(750, 250, 700, 300);
        ventana.setVisible(true);
    }

}
