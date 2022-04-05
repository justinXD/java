package segundo_parcial;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class encuesta extends JFrame implements ChangeListener, ItemListener, ActionListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public JRadioButton radio1, radio2, radio3, radio4, radio5;
    public ButtonGroup opciones;
    public JComboBox <String> combo1;
    public String seleccionChida, seleccion1, seleccion2, seleccion3, seleccion4, seleccion5;
    public JCheckBox opcion1, opcion2, opcion3, opcion4, opcion5, opcion6;
    public JTextArea area;
    public JButton boton;
    public JLabel etiqueta1;
    public JLabel etiqueta2;
    public JLabel etiqueta3;
    public JLabel etiqueta4;
    public JLabel etiqueta5;

    public encuesta()
    {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("encuesta");

        etiqueta1 = new JLabel("Municipio");
        etiqueta1.setBounds(30, 30, 250, 20);
        add(etiqueta1);

        etiqueta2 = new JLabel("Genero");
        etiqueta2.setBounds(30, 90, 250, 20);
        add(etiqueta2);

        etiqueta3 = new JLabel("Nivel de estudios");
        etiqueta3.setBounds(30, 210, 250, 20);
        add(etiqueta3);

        etiqueta4 = new JLabel("Gustos");
        etiqueta4.setBounds(30, 330, 250, 20);
        add(etiqueta4);

        etiqueta5 = new JLabel("Turno");
        etiqueta5.setBounds(30, 450, 250, 20);
        add(etiqueta5);

        combo1 = new JComboBox<String>();
        combo1.setBounds(30, 60, 100, 20);
        add(combo1);
        combo1.addItem("Guadalajara\n");
        combo1.addItem("Zapopan\n");
        combo1.addItem("Tlajomulco\n");
        combo1.addItem("Tlaquepaque\n");
        combo1.addItem("Tonala\n");
        combo1.addItem("El salto\n");

        radio1 = new JRadioButton("Hombre");
        radio1.setBounds(30, 120, 100, 20);
        add(radio1);

        radio2 = new JRadioButton("Mujer");
        radio2.setBounds(30, 150, 100, 20);
        add(radio2);

        radio3 = new JRadioButton("Prefiero no decir");
        radio3.setBounds(30, 180, 150, 20);
        add(radio3);

        opcion1 = new JCheckBox("Licenciatura");
        opcion1.setBounds(30, 240, 100, 20);
        add(opcion1);

        opcion2 = new JCheckBox("Maestria");
        opcion2.setBounds(30, 270, 100, 20);
        add(opcion2);

        opcion3 = new JCheckBox("Doctorado");
        opcion3.setBounds(30, 300, 100, 20);
        add(opcion3);

        opcion4 = new JCheckBox("Leer");
        opcion4.setBounds(30, 360, 100, 20);
        add(opcion4);

        opcion5 = new JCheckBox("Correr");
        opcion5.setBounds(30, 390, 100, 20);
        add(opcion5);

        opcion6 = new JCheckBox("Bicicleta");
        opcion6.setBounds(30, 420, 100, 20);
        add(opcion6);

        radio4 = new JRadioButton("Matutino");
        radio4.setBounds(30, 480, 150, 20);
        add(radio4);

        radio5 = new JRadioButton("Vespertino");
        radio5.setBounds(30, 510, 150, 20);
        add(radio5);

        area = new JTextArea("");
        area.setBounds(250, 50, 400, 450);
        area.setEditable(false);
        add(area);

        boton = new JButton("Terminar encuesta");
        boton.setBounds(60, 550, 200, 35);
        add(boton);

        opciones = new ButtonGroup();
        opciones.add(radio1);
        opciones.add(radio2);
        opciones.add(radio3);
        opciones.add(radio4);
        opciones.add(radio5);
        
        combo1.addItemListener(this);
        boton.addActionListener(this);
        radio1.addChangeListener(this);
        radio2.addChangeListener(this);
        radio3.addChangeListener(this);
        radio4.addChangeListener(this);
        radio5.addChangeListener(this);
        opcion1.addChangeListener(this);
        opcion2.addChangeListener(this);
        opcion3.addChangeListener(this);
        opcion4.addChangeListener(this);
        opcion5.addChangeListener(this);
        opcion6.addChangeListener(this);
    }

    public void actionPerformed(ActionEvent accion)
    {
        if (accion.getSource() == boton) 
        {
            area.setText(seleccionChida);
        }  
    }

    public void itemStateChanged(ItemEvent accion)
    {
        seleccion1 = "\tMunicipio: " + "\n" + combo1.getSelectedItem().toString() + "\n";
    }

    public void stateChanged(ChangeEvent accion)
    {
        if (radio1.isSelected() == true) {
          seleccion2 = "\tGenero:" + "\n" + "Hombre" + "\n\n";
        }
        if (radio2.isSelected() == true) {
            seleccion2 = "\tGenero:" + "\n" + "Mujer" + "\n\n";
        }
        if (radio3.isSelected() == true) {
            seleccion2 = "\tGenero:" + "\n" + "Prefiero no decir" + "\n\n";
        }
        seleccion3 = "";
		if (opcion1.isSelected() == true) {
          seleccion3 = seleccion3 + "\n" + "Licenciatura " + "\n";
        }
        if (opcion2.isSelected() == true) {
            seleccion3 = seleccion3 + "\n" + "Maestria " + "\n";
        }
        if (opcion3.isSelected() == true) {
            seleccion3 = seleccion3 + "\n" + "Doctorado " + "\n";
        }
        seleccion4 = "";
        if (opcion4.isSelected() == true) {
            seleccion4 = seleccion4 + "\n" + "Leer " + "\n";
        }
        if (opcion5.isSelected() == true) {
            seleccion4 = seleccion4 + "\n" + "Correr " + "\n";
        }
        if (opcion6.isSelected() == true) {
            seleccion4 = seleccion4 + "\n" + "Bicicleta " + "\n";
        }
        seleccion5 = "";
        if (radio4.isSelected() == true) {
            seleccion5 = "\tTurno" + "\n" + "Matutino" + "\n";
        }
        if (radio5.isSelected() == true) {
            seleccion5 = "\tTurno" + "\n" + "Vespertino" + "\n";
        }

        seleccionChida = "\tEncuesta\n\n" + seleccion1 + seleccion2 + "\tNivel de estudios:" + seleccion3 + "\tGustos" + seleccion4 + seleccion5;
    }


    public static void main(String[] args) {
        encuesta ventana = new encuesta();
        ventana.setBounds(700, 250, 700, 650);
        ventana.setVisible(true);
    }
}
