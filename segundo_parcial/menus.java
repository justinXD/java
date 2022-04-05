package segundo_parcial;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

/**
 * ventana
 */
public class menus extends JFrame implements ActionListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public JMenuBar menuBar;
    public JMenu menu1, menu2, menu3, menu4;
    public JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6;
    public JMenuItem menuItem7, menuItem8, menuItem9;

    public menus()
    {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("ventanitas");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menu1 = new JMenu("Tamaño");
        menu2 = new JMenu("Titulo");
        menu3 = new JMenu("Proceso Terminado");
        menu4 = new JMenu("Color");
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);

        menuItem1 = new JMenuItem("240 X 480");
        menuItem2 = new JMenuItem("640 X 720");
        menuItem3 = new JMenuItem("Rojo");
        menuItem4 = new JMenuItem("Verde");
        menuItem5 = new JMenuItem("Azul");
        menuItem6 = new JMenuItem("Hola Mundo");
        menuItem7 = new JMenuItem("Hola guap@");
        menuItem8 = new JMenuItem("Ventana 1");
        menuItem9 = new JMenuItem("Tienda");

        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu1.add(menu4);
        menu4.add(menuItem3);
        menu4.add(menuItem4);
        menu4.add(menuItem5);
        menu2.add(menuItem6);
        menu2.add(menuItem7);
        menu3.add(menuItem8);
        menu3.add(menuItem9);

        menuItem1.addActionListener(this);
        menuItem2.addActionListener(this);
        menuItem3.addActionListener(this);
        menuItem4.addActionListener(this);
        menuItem5.addActionListener(this);
        menuItem6.addActionListener(this);
        menuItem7.addActionListener(this);
        menuItem8.addActionListener(this);
        menuItem9.addActionListener(this);

    }

    public void actionPerformed(ActionEvent accion)
    {
        if (accion.getSource() == menuItem1 ) {
            super.setSize(240, 480);
        }
        if (accion.getSource() == menuItem2 ) {
            super.setSize(640, 720);
        }
        if (accion.getSource() == menuItem3 ) {
            super.getContentPane().setBackground(new Color(255, 0, 0));
        }
        if (accion.getSource() == menuItem4 ) {
            super.getContentPane().setBackground(new Color(0, 255, 0));
        }
        if (accion.getSource() == menuItem5 ) {
            super.getContentPane().setBackground(new Color(0, 0, 255));
        }
        if (accion.getSource() == menuItem6 ) {
            super.setTitle("Hola Mundo");
        }
        if (accion.getSource() == menuItem7 ) {
            super.setTitle("Hola guap@");
        }
        if (accion.getSource() == menuItem8 ) {
            JOptionPane.showMessageDialog(null, "Lo lograste!!!");
        }
        if (accion.getSource() == menuItem9 ) {
            tienda ventana2 = new tienda();
            ventana2.setBounds(700, 250, 630, 400);
            ventana2.setVisible(true);
            ventana2.setResizable(false);
        }
    }

    public static void main(String[] args) {
        menus ventana = new menus();
        ventana.setBounds(700, 250, 630, 400);
        ventana.setVisible(true); 
    }
}
