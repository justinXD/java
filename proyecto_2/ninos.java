package proyecto_2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class ninos extends JFrame implements ItemListener, ActionListener, MouseListener{
    
    /**
    *
    */
   private static final long serialVersionUID = 1L;
   public JLabel etiqueta, portada, titulo, nino1, nino2, nino3, etiqueta2, etiqueta3;
    public JLabel p1,p2,p3,eventor;
    public JScrollPane scroll;
    public JPanel miPanel;
    public JButton carrito,agregar;
    public JComboBox <String> bnino1;
    public JComboBox <String> bnino2;
    public JComboBox <String> bnino3;
    public String seleccion,pr,pr2;
    public JTextArea textArea;
    public int totalarticulos;
    public int total, prov, prov2,num1,num2,num3;
    public ninos(){
       miPanel = new JPanel();
       miPanel.setLayout(null);
       setTitle("Niños");
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
       miPanel.setBackground(new Color(250,249,248));

       bnino1 = new JComboBox<String>();
       bnino1.setBounds(240,220,60,30);
       miPanel.add(bnino1);
   
       bnino1.addItem("0");
       bnino1.addItem("1");
       bnino1.addItem("2");
       bnino1.addItem("3");
       bnino1.addItem("4");
       bnino1.addItem("5");
       bnino1.addItem("6");
       bnino1.addItem("7");
       bnino1.addItem("8");
       bnino1.addItem("9");
       bnino1.addItem("10");

       bnino1.addItemListener(this); 

       bnino2 = new JComboBox<String>();
       bnino2.setBounds(240,475,60,30);
       miPanel.add(bnino2);
   
       bnino2.addItem("0");
       bnino2.addItem("1");
       bnino2.addItem("2");
       bnino2.addItem("3");
       bnino2.addItem("4");
       bnino2.addItem("5");
       bnino2.addItem("6");
       bnino2.addItem("7");
       bnino2.addItem("8");
       bnino2.addItem("9");
       bnino2.addItem("10");

       bnino2.addItemListener(this);

       bnino3 = new JComboBox<String>();
       bnino3.setBounds(240,730,60,30);
       miPanel.add(bnino3);
   
       bnino3.addItem("0");
       bnino3.addItem("1");
       bnino3.addItem("2");
       bnino3.addItem("3");
       bnino3.addItem("4");
       bnino3.addItem("5");
       bnino3.addItem("6");
       bnino3.addItem("7");
       bnino3.addItem("8");
       bnino3.addItem("9");
       bnino3.addItem("10");

       bnino3.addItemListener(this);

       ImageIcon imagen = new ImageIcon("logomoda.png");
       portada = new JLabel(imagen);
       portada.setBounds(0,0,700,150);
       Icon icono = new ImageIcon(imagen.getImage() .getScaledInstance(portada.getWidth(),portada.getHeight(),Image.SCALE_DEFAULT));
       portada.setIcon(icono);
       miPanel.add(portada);

       Font fuentee = new Font("Times New Roman", Font.PLAIN, 20);
       etiqueta = new JLabel("<html>Camisa azul con moño<html>");
       etiqueta.setBounds(230,100,600,200);
       etiqueta.setFont(fuentee);
       etiqueta.setForeground(new Color(227, 13, 51));
       miPanel.add(etiqueta);

       ImageIcon imagen1 = new ImageIcon("niño1.png");
       nino1 = new JLabel(imagen1);
       nino1.setBounds(20,200,200,200);
       Icon icono2 = new ImageIcon(imagen1.getImage() .getScaledInstance(nino1.getWidth(),nino1.getHeight(),Image.SCALE_DEFAULT));
       nino1.setIcon(icono2);
       miPanel.add(nino1);

       etiqueta2 = new JLabel("<html>Camisa blanca basica<html>");
       etiqueta2.setBounds(230,360,600,200);
       etiqueta2.setFont(fuentee);
       etiqueta2.setForeground(new Color(227, 13, 51));
       miPanel.add(etiqueta2);

       ImageIcon imagen2 = new ImageIcon("niño2.png");
       nino2 = new JLabel(imagen2);
       nino2.setBounds(20,450,200,200);
       Icon icono3 = new ImageIcon(imagen2.getImage() .getScaledInstance(nino2.getWidth(),nino2.getHeight(),Image.SCALE_DEFAULT));
       nino2.setIcon(icono3);
       miPanel.add(nino2);

       ImageIcon imagen3 = new ImageIcon("niño3.png");
       nino3 = new JLabel(imagen3);
       nino3.setBounds(20,700,200,200);
       Icon icono4 = new ImageIcon(imagen3.getImage() .getScaledInstance(nino3.getWidth(),nino3.getHeight(),Image.SCALE_DEFAULT));
       nino3.setIcon(icono4);
       miPanel.add(nino3);

       etiqueta3 = new JLabel("<html>Camisa de diseño<html>");
       etiqueta3.setBounds(230,610,600,200);
       etiqueta3.setFont(fuentee);
       etiqueta3.setForeground(new Color(227, 13, 51));
       miPanel.add(etiqueta3);

       p1 = new JLabel("320$");
       p1.setBounds(310,135,600,200);
       p1.setFont(fuentee);
       p1.setForeground(new Color(227, 13, 51));
       miPanel.add(p1);

       p2 = new JLabel("280$ c/u");
       p2.setBounds(310,390,600,200);
       p2.setFont(fuentee);
       p2.setForeground(new Color(227, 13, 51));
       miPanel.add(p2);

       p3 = new JLabel("300$");
       p3.setBounds(310,645,600,200);
       p3.setFont(fuentee);
       p3.setForeground(new Color(227, 13, 51));
       miPanel.add(p3);

       carrito = new JButton("Carrito");
       carrito.setBounds(20,1050,120,20);
       carrito.setBackground(new Color(227, 13, 51));
       carrito.setForeground(new Color(250,249,248));
       miPanel.add(carrito);

       agregar = new JButton("Agregar al carrito");
       agregar.setBounds(500,1050,150,20);
       agregar.setBackground(new Color(227, 13, 51));
       agregar.setForeground(new Color(250,249,248));
       miPanel.add(agregar);

       scroll = new JScrollPane(miPanel);
       miPanel.setPreferredSize(new Dimension(600,1100));
       scroll.getVerticalScrollBar().setUnitIncrement(16);
       add(scroll);

       textArea = new JTextArea("");
       textArea.setBounds(160, 925, 300, 165);
       textArea.setEditable(false);
       miPanel.add(textArea);

       eventor = new JLabel("");
       eventor.setBounds(470,950,210,100);
       eventor.setFont(fuentee);
       eventor.setForeground(new Color(227, 13, 51));
       miPanel.add(eventor);

       agregar.addActionListener(this);
       miPanel.addMouseListener(this);
       carrito.addActionListener(this);
}

public void itemStateChanged(ItemEvent accion){

        String seleccion = "Niños:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" + "Camisa azul con moño:" + "\n" +
                bnino1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Camisa blanca basica:" + "\n" +
                bnino2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Camisa de diseño:" + "\n" + bnino3.getSelectedItem().toString() + "\n";

        num1 = Integer.parseInt((String) bnino1.getSelectedItem());
        num2 = Integer.parseInt((String) bnino2.getSelectedItem());
        num3 = Integer.parseInt((String) bnino3.getSelectedItem());
        totalarticulos = num1+num2+num3;
        total = (num1*320) + (num2*280) + (num3*300);
        String mostrar = Integer.toString(total);
        if(totalarticulos<=10){
           textArea.setText(seleccion);
        }
}
   
  public void actionPerformed(ActionEvent accion){
   if(accion.getSource() == carrito){
     try{
         Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/solo_moda_shop","root","");
        }catch(Exception e){}
     carrito ventana = new carrito();
     ventana.setBounds(300,250,700,700);
     ventana.setVisible(true);
     ventana.setResizable(false);
   }
   if(accion.getSource() == agregar){
     if(totalarticulos<=10){ 
      String metodopago = "nulo";
      String articulos = "Niños:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" + "Camisa azul con moño:" + "\n" +
                bnino1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Camisa blanca basica:" + "\n" +
                bnino2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Camisa de diseño:" + "\n" + bnino3.getSelectedItem().toString() + "\n";

    try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/solo_moda_shop","root","");
      PreparedStatement pst = cn.prepareStatement("SELECT * FROM tienda");
      PreparedStatement query = cn.prepareStatement("INSERT INTO tienda(total,n_articulos,metodo_pago,articulos) VALUES(?, ?, ?, ?)");

 
      ResultSet rs = pst.executeQuery();
  
      while(rs.next()){
         prov = rs.getInt("total");
         prov2 = rs.getInt("n_articulos");
         pr = rs.getString("metodo_pago");
         pr2 = rs.getString("articulos");
      }
       prov = prov+total;
       prov2 = prov2+totalarticulos;
       pr = "nulo";
       pr2 = pr2 + articulos;
       if(prov2<=10 && totalarticulos<=10){
       query.setInt(1, prov);
       query.setInt(2, prov2);
       query.setString(3, pr);
       query.setString(4, pr2);
       query.executeUpdate(); 
       }
    }catch (Exception e){}
    }else{
     eventor.setText("Solo puedes agregar 10");
     }
   }
}
public void mouseReleased(MouseEvent e){
     if(totalarticulos>10){
        eventor.setText("Solo puedes agregar 10");
     }else{
        eventor.setText("Agregado exitosamente");
      }
 }
public void mouseExited(MouseEvent e){
}
public void mouseEntered(MouseEvent e){
}
public void mousePressed(MouseEvent e){
}
public void mouseClicked(MouseEvent e){
}
    public static void main(String args[]){
      ninos ventana = new ninos();
      ventana.setBounds(300,250,700,700);
      ventana.setVisible(true);
      ventana.setResizable(false);
    }
}