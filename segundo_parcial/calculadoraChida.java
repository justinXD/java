package segundo_parcial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class calculadoraChida extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    public JButton boton0;
    public JButton boton1;
    public JButton boton2;
    public JButton boton3;
    public JButton boton4;
    public JButton boton5;
    public JButton boton6;
    public JButton boton7;
    public JButton boton8;
    public JButton boton9;
    public JButton botonSuma;
    public JButton botonResta;
    public JButton botonMultiplicacion;
    public JButton botonDivision;
    public JButton botonLimpiar;
    public JButton botonIgual;
    public JTextField campo;

    public float a = 0;
    public float b = 0;
    public float c = 0;

    public int x;

    public String r;

    public calculadoraChida() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        campo = new JTextField();
        campo.setBounds(25, 40, 310, 80);
        add(campo);

        boton0 = new JButton("0");
        boton0.setBounds(25, 325, 180, 50);
        add(boton0);

        boton1 = new JButton("1");
        boton1.setBounds(25, 260, 50, 50);
        add(boton1);

        boton2 = new JButton("2");
        boton2.setBounds(90, 260, 50, 50);
        add(boton2);

        boton3 = new JButton("3");
        boton3.setBounds(155, 260, 50, 50);
        add(boton3);

        boton4 = new JButton("4");
        boton4.setBounds(25, 195, 50, 50);
        add(boton4);

        boton5 = new JButton("5");
        boton5.setBounds(90, 195, 50, 50);
        add(boton5);

        boton6 = new JButton("6");
        boton6.setBounds(155, 195, 50, 50);
        add(boton6);

        boton7 = new JButton("7");
        boton7.setBounds(25, 130, 50, 50);
        add(boton7);

        boton8 = new JButton("8");
        boton8.setBounds(90, 130, 50, 50);
        add(boton8);

        boton9 = new JButton("9");
        boton9.setBounds(155, 130, 50, 50);
        add(boton9);

        botonSuma = new JButton("+");
        botonSuma.setBounds(220, 325, 50, 50);
        add(botonSuma);

        botonResta = new JButton("-");
        botonResta.setBounds(220, 260, 50, 50);
        add(botonResta);

        botonMultiplicacion = new JButton("x");
        botonMultiplicacion.setBounds(220, 195, 50, 50);
        add(botonMultiplicacion);

        botonDivision = new JButton("/");
        botonDivision.setBounds(220, 130, 50, 50);
        add(botonDivision);

        botonLimpiar = new JButton("CE");
        botonLimpiar.setBounds(285, 130, 50, 115);
        add(botonLimpiar);

        botonIgual = new JButton("=");
        botonIgual.setBounds(285, 260, 50, 115);
        add(botonIgual);

        boton0.addActionListener(this);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
        boton6.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        boton9.addActionListener(this);
        botonSuma.addActionListener(this);
        botonResta.addActionListener(this);
        botonMultiplicacion.addActionListener(this);
        botonDivision.addActionListener(this);
        botonIgual.addActionListener(this);
        botonLimpiar.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent accion) {
        if (accion.getSource() == boton0) {
            campo.setText(campo.getText() + "0");
        }
        if (accion.getSource() == boton1) {
            campo.setText(campo.getText() + "1");
        }
        if (accion.getSource() == boton2) {
            campo.setText(campo.getText() + "2");
        }
        if (accion.getSource() == boton3) {
            campo.setText(campo.getText() + "3");
        }
        if (accion.getSource() == boton4) {
            campo.setText(campo.getText() + "4");
        }
        if (accion.getSource() == boton5) {
            campo.setText(campo.getText() + "5");
        }
        if (accion.getSource() == boton6) {
            campo.setText(campo.getText() + "6");
        }
        if (accion.getSource() == boton7) {
            campo.setText(campo.getText() + "7");
        }
        if (accion.getSource() == boton8) {
            campo.setText(campo.getText() + "8");
        }
        if (accion.getSource() == boton9) {
            campo.setText(campo.getText() + "9");
        }
        if (accion.getSource() == botonSuma) {
            x = 1;
            a = Float.parseFloat(campo.getText());
            campo.setText("   ");
        }
        if (accion.getSource() == botonResta) {
            x = 2;
            a = Float.parseFloat(campo.getText());
            campo.setText("   ");
        }
        if (accion.getSource() == botonMultiplicacion) {
            x = 3;
            a = Float.parseFloat(campo.getText());
            campo.setText("   ");
        }
        if (accion.getSource() == botonDivision) {
            x = 4;
            a = Float.parseFloat(campo.getText());
            campo.setText("   ");
        }
        if (accion.getSource() == botonIgual) {
            b = Float.parseFloat(campo.getText());
            switch (x) {
                case 1:
                    c = a + b;
                    break;
                case 2:
                    c = a - b;
                    break;
                case 3:
                    c = a * b;
                    break;
                case 4:
                    c = a / b;
                    break;
                default:
                    campo.setText("error");
                    break;
            }
            x = 0;
            r = Float.toString(c);
            campo.setText(r);
        }
        if (accion.getSource() == botonLimpiar) {
            a = 0;
            b = 0;
            c = 0;
            x = 0;
            campo.setText("    ");
        }
    }

    public static void main(String[] args) {
        calculadoraChida calcu = new calculadoraChida();
        calcu.setBounds(750, 250, 375, 440);
        calcu.setVisible(true);
    }

}
