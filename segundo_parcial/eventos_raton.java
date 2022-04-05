package segundo_parcial;
import javax.swing.*;
import java.awt.event.*;

public class eventos_raton extends JFrame implements ActionListener, MouseListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public JLabel etiqueta;
    public JTextField campo;
    public JTextArea area;
    public int codigo;

    public eventos_raton()
    {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("eventos");

        campo = new JTextField();
        campo.setBounds(20, 80, 200, 20);
        add(campo);

        etiqueta = new JLabel("nombre");
        etiqueta.setBounds(20, 110, 200, 20);
        add(etiqueta);

        JTextArea area = new JTextArea("");
        area.setBounds(230, 10, 140, 200);
        add(area);

        addMouseListener(this);
        area.addMouseListener(this);
    }

    public void mouseClicked(java.awt.event.MouseEvent e) {

    }

    public void mousePressed(java.awt.event.MouseEvent e) {
        if (e.getModifiersEx() == 1024) {
            campo.setText("Isaac Justin Davila Sapiens");
        }
        if (e.getModifiersEx() == 4096) {
            etiqueta.setText("Isaac Justin Davila Sapiens");
        }
        if (e.getModifiersEx() == 2048) {
            codigo = JOptionPane.showConfirmDialog(null, "Estas seguro??");
            if (codigo == 0) {
                JOptionPane.showMessageDialog(null, "Adios");
                System.exit(0);
            }
            if (codigo == 1) {
                JOptionPane.showMessageDialog(null, "Vuelve");
            }
            if (codigo == 2) {
                JOptionPane.showMessageDialog(null, "Cancelado");
            }
        }

    }

    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    public void mouseEntered(java.awt.event.MouseEvent e) {
        
        JOptionPane.showMessageDialog(null, "Puedes escribir texto e esta area");
    }

    public void mouseExited(java.awt.event.MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Aqui no puedes escribir porque no estas en el area");
    }

    public void actionPerformed(ActionEvent e) {


    }
    public static void main(String[] args) {
        eventos_raton ventana = new eventos_raton();
        ventana.setBounds(750, 250, 400, 265);
        ventana.setVisible(true);
        ventana.setResizable(true);
    } 
}
