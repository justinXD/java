package segundo_parcial;
import javax.swing.*;
import java.awt.event.*;

public class raton extends JFrame implements MouseListener, ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public JLabel etiqueta;
    public JTextField campo;
    public JTextArea area;
    public int codigo;

    public raton()
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
        
        area.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
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

    public void mouseReleased(MouseEvent e) { 
    }

    public void mouseEntered(MouseEvent e) {
        /*if (mouseEntered(area) == true) {
            JOptionPane.showMessageDialog(null, "Puedes escribir texto e esta area");
        }*/
    }

    /*private boolean mouseEntered(JTextArea area2) {
        return false;
    }*/

    public void mouseExited(MouseEvent e) {
        /*if (mouseExited(area) == true) {
            JOptionPane.showMessageDialog(null, "Ya no puedes escribir porque te saliste");
        }*/
    }
    
    /*private boolean mouseExited(JTextArea area2) {
        return false;
    }*/

    public static void main(String[] args) {
        raton ventana = new raton();
        ventana.setBounds(750, 250, 400, 265);
        ventana.setVisible(true);
        ventana.setResizable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 

    }

    /*public void mouseMoved(MouseEvent e) {
        if (e.getSource() == area) {
            for(int x = 0;x < 1; x++)
            {
                JOptionPane.showMessageDialog(null, "Puedes escribir texto e esta area");
            }
        }
        if (e.getSource() != area) {
            for(int x = 0;x < 1; x++)
            {
                JOptionPane.showMessageDialog(null, "Aqui no puedes escribir porque no estas en el area");
            }
        }
    }
    

    @Override
    public void mouseDragged(MouseEvent e) {
        // 

    }*/


}
