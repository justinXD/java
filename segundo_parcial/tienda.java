package segundo_parcial;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class tienda extends JFrame implements ItemListener, ActionListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public JLabel etiqueta1;
    public JLabel etiqueta2;
    public JLabel etiqueta3;
    public JLabel etiqueta4;
    public JLabel etiqueta5;

    public JComboBox <String> combo1;
    public JComboBox <String> combo2;
    public JComboBox <String> combo3;
    public JComboBox <String> combo4;
    public JComboBox <String> combo5;
    public JComboBox <String> combo6;
    public JComboBox <String> combo7;
    public JComboBox <String> combo8;
    public JComboBox <String> combo9;

    public JButton botonComprar;

    public JTextArea textArea;

    public JScrollPane scroll;

    public String seleccion;

    public tienda()
    {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(166, 65, 56));
        setTitle("mate shop");

        combo1 = new JComboBox<String>();
        combo1.setBounds(20, 40, 90, 20);
        add(combo1);
        
        combo1.addItem("color");
        combo1.addItem("azul");
        combo1.addItem("negro");
        combo1.addItem("blanco");
        combo1.addItem("cafe");
        
        combo2 = new JComboBox<String>();
        combo2.setBounds(20, 80, 90, 20);
        add(combo2);

        combo2.addItem("talla");
        combo2.addItem("chica");
        combo2.addItem("mediana");
        combo2.addItem("grande");
        combo2.addItem("gordo");

        combo3 = new JComboBox<String>();
        combo3.setBounds(20, 120, 90, 20);
        add(combo3);

        combo3.addItem("corte");
        combo3.addItem("recto");
        combo3.addItem("slim");
        combo3.addItem("slim-fit");
        combo3.addItem("skinny");

        combo4 = new JComboBox<String>();
        combo4.setBounds(140, 40, 90, 20);
        add(combo4);

        combo4.addItem("color");
        combo4.addItem("blanca");
        combo4.addItem("azul");
        combo4.addItem("cuadros");
        combo4.addItem("negra");
        combo4.addItem("de rayas");

        combo5 = new JComboBox<String>();
        combo5.setBounds(140, 80, 90, 20);
        add(combo5);

        combo5.addItem("talla");
        combo5.addItem("chica");
        combo5.addItem("mediana");
        combo5.addItem("grande");
        combo5.addItem("gordo");

        combo6 = new JComboBox<String>();
        combo6.setBounds(140, 120, 90, 20);
        add(combo6);

        combo6.addItem("mangas");
        combo6.addItem("corta");
        combo6.addItem("3/4");
        combo6.addItem("larga");

        combo7 = new JComboBox<String>();
        combo7.setBounds(20, 180, 90, 20);
        add(combo7);

        combo7.addItem("calcetin");
        combo7.addItem("negro dama");
        combo7.addItem("tines blancos");
        combo7.addItem("negro hombre");

        combo8 = new JComboBox<String>();
        combo8.setBounds(20, 220, 90, 20);
        add(combo8);

        combo8.addItem("niña");
        combo8.addItem("niño");

        combo9 = new JComboBox<String>();
        combo9.setBounds(20, 260, 90, 20);
        add(combo9);

        combo9.addItem("talla");
        combo9.addItem("0-3 meses");
        combo9.addItem("3-6 meses");
        combo9.addItem("6-9 meses");
        combo9.addItem("9-12 meses");
        combo9.addItem("12-15 meses");
        combo9.addItem("15-18 meses");

        etiqueta1 = new JLabel("pantalon");
        etiqueta1.setBounds(20, 10, 90, 20);
        add(etiqueta1);

        etiqueta2 = new JLabel("camisas");
        etiqueta2.setBounds(140, 10, 90, 20);
        add(etiqueta2);

        etiqueta3 = new JLabel("calcetas");
        etiqueta3.setBounds(20, 150, 90, 20);
        add(etiqueta3);

        etiqueta4 = new JLabel("ropa INF.");
        etiqueta4.setBounds(20, 200, 90, 20);
        add(etiqueta4);

        Font fuente = new Font("SCRIPT MT BOLD", Font.PLAIN, 25);
        etiqueta5 = new JLabel("tienda de ropa");
        etiqueta5.setFont(fuente);
        etiqueta5.setBounds(140, 180, 150, 20);
        add(etiqueta5);

        textArea = new JTextArea("");
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBounds(300, 20, 300, 300);
        scroll.setViewportView(textArea);
        add(scroll);
        
        botonComprar = new JButton("comprar");
        botonComprar.setBounds(150, 230, 90, 50);
        botonComprar.setBackground(new Color(242, 241, 223));
        add(botonComprar);

        combo1.addItemListener(this);
        combo2.addItemListener(this);
        combo3.addItemListener(this);
        combo4.addItemListener(this);
        combo5.addItemListener(this);
        combo6.addItemListener(this);
        combo7.addItemListener(this);
        combo8.addItemListener(this);
        combo9.addItemListener(this);
        botonComprar.addActionListener(this);
    }
    
    public void itemStateChanged(ItemEvent accion)
    {
        seleccion = "\tpantalones" + "\n" + "Color: " + "\n" + combo1.getSelectedItem().toString() + "\n" + "Talla: " + "\n" + combo2.getSelectedItem().toString() + 
        "\n" + "estilo: " + "\n" + combo3.getSelectedItem().toString() + "\n\n" + "\tCamisa" + "\n\n" + "Color o estilo: " + "\n" + combo4.getSelectedItem().toString() + 
        "\n" + "Talla: " + "\n" + combo5.getSelectedItem().toString() + "\n" + "Manga: " + "\n" + combo6.getSelectedItem().toString() + "\n\n" + "\tCalcetines" + 
        "\n" + "Calcetines: " + "\n" + combo7.getSelectedItem().toString() + "\n" + "\tRopa de infantes" + "\n\n" + "Ropa de: " + "\n" + combo8.getSelectedItem().toString() + 
        "\n" + "Talla" + "\n" + combo9.getSelectedItem().toString();
    }

    public void actionPerformed(ActionEvent accion)
    {
        if (accion.getSource() == botonComprar) 
        {
            textArea.setText(seleccion);

        }  
    }
    public static void main(String[] args) {
        tienda ventana = new tienda();
        ventana.setBounds(700, 250, 630, 400);
        ventana.setVisible(true);
        ventana.setResizable(false);
    }
}