package proyecto_2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class vestidos extends JFrame implements ItemListener, ActionListener, MouseListener{
    
    /**
    *
    */
   private static final long serialVersionUID = 1L;
   public JLabel etiqueta, portada, titulo, vestido1, vestido2, vestido3, vestido4, tvestido1, tvestido2, tvestido3,
         tvestido4;
    public JLabel p1,p2,p3,p4,eventor;
    public JScrollPane scroll;
    public JPanel miPanel;
    public JButton carrito,agregar;
    public JComboBox <String> bvestido1;
    public JComboBox <String> bvestido2;
    public JComboBox <String> bvestido3;
    public JComboBox <String> bvestido4;
    public String seleccion, pr,pr2;
    public JTextArea textArea;
    public int totalarticulos;
    public int total, prov, prov2,num1,num2,num3,num4;
    public vestidos(){
       miPanel = new JPanel();
       miPanel.setLayout(null);
       setTitle("Vestidos");
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       miPanel.setBackground(new Color(250, 249, 248));
       setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());

       bvestido1 = new JComboBox<String>();
       bvestido1.setBounds(240,220,60,30);
       miPanel.add(bvestido1);
   
       bvestido1.addItem("0");
       bvestido1.addItem("1");
       bvestido1.addItem("2");
       bvestido1.addItem("3");
       bvestido1.addItem("4");
       bvestido1.addItem("5");
       bvestido1.addItem("6");
       bvestido1.addItem("7");
       bvestido1.addItem("8");
       bvestido1.addItem("9");
       bvestido1.addItem("10");

       bvestido1.addItemListener(this); 

       bvestido2 = new JComboBox<String>();
       bvestido2.setBounds(240,475,60,30);
       miPanel.add(bvestido2);
   
       bvestido2.addItem("0");
       bvestido2.addItem("1");
       bvestido2.addItem("2");
       bvestido2.addItem("3");
       bvestido2.addItem("4");
       bvestido2.addItem("5");
       bvestido2.addItem("6");
       bvestido2.addItem("7");
       bvestido2.addItem("8");
       bvestido2.addItem("9");
       bvestido2.addItem("10");

       bvestido2.addItemListener(this);

       bvestido3 = new JComboBox<String>();
       bvestido3.setBounds(240,730,60,30);
       miPanel.add(bvestido3);
   
       bvestido3.addItem("0");
       bvestido3.addItem("1");
       bvestido3.addItem("2");
       bvestido3.addItem("3");
       bvestido3.addItem("4");
       bvestido3.addItem("5");
       bvestido3.addItem("6");
       bvestido3.addItem("7");
       bvestido3.addItem("8");
       bvestido3.addItem("9");
       bvestido3.addItem("10");

       bvestido3.addItemListener(this);


       bvestido4 = new JComboBox<String>();
       bvestido4.setBounds(240,995,60,30);
       miPanel.add(bvestido4);
   
       bvestido4.addItem("0");
       bvestido4.addItem("1");
       bvestido4.addItem("2");
       bvestido4.addItem("3");
       bvestido4.addItem("4");
       bvestido4.addItem("5");
       bvestido4.addItem("6");
       bvestido4.addItem("7");
       bvestido4.addItem("8");
       bvestido4.addItem("9");
       bvestido4.addItem("10");

       bvestido4.addItemListener(this);


       ImageIcon imagen = new ImageIcon("logomoda.png");
       portada = new JLabel(imagen);
       portada.setBounds(0,0,700,150);
       Icon icono = new ImageIcon(imagen.getImage() .getScaledInstance(portada.getWidth(),portada.getHeight(),Image.SCALE_DEFAULT));
       portada.setIcon(icono);
       miPanel.add(portada);

       Font fuentee = new Font("Times New Roman", Font.PLAIN, 20);
       etiqueta = new JLabel("<html>Vestido negro casual largo<html>");
       etiqueta.setBounds(230,100,600,200);
       etiqueta.setFont(fuentee);
       etiqueta.setForeground(new Color(227, 13, 51));
       miPanel.add(etiqueta);

       ImageIcon imagen1 = new ImageIcon("vestido1.png");
       vestido1 = new JLabel(imagen1);
       vestido1.setBounds(20,200,200,200);
       Icon icono2 = new ImageIcon(imagen1.getImage() .getScaledInstance(vestido1.getWidth(),vestido1.getHeight(),Image.SCALE_DEFAULT));
       vestido1.setIcon(icono2);
       miPanel.add(vestido1);

       tvestido2 = new JLabel("<html>Vestido puntos de colores<html>");
       tvestido2.setBounds(230,360,600,200);
       tvestido2.setFont(fuentee);
       tvestido2.setForeground(new Color(227, 13, 51));
       miPanel.add(tvestido2);

       ImageIcon imagen2 = new ImageIcon("vestido2.png");
       vestido2 = new JLabel(imagen2);
       vestido2.setBounds(20,450,200,200);
       Icon icono3 = new ImageIcon(imagen2.getImage() .getScaledInstance(vestido2.getWidth(),vestido2.getHeight(),Image.SCALE_DEFAULT));
       vestido2.setIcon(icono3);
       miPanel.add(vestido2);

       ImageIcon imagen3 = new ImageIcon("vestido3.png");
       vestido3 = new JLabel(imagen3);
       vestido3.setBounds(20,710,200,200);
       Icon icono4 = new ImageIcon(imagen3.getImage() .getScaledInstance(vestido3.getWidth(),vestido3.getHeight(),Image.SCALE_DEFAULT));
       vestido3.setIcon(icono4);
       miPanel.add(vestido3);

       ImageIcon imagen4 = new ImageIcon("vestido4.png");
       vestido4 = new JLabel(imagen4);
       vestido4.setBounds(20,970,200,200);
       Icon icono5 = new ImageIcon(imagen4.getImage() .getScaledInstance(vestido4.getWidth(),vestido4.getHeight(),Image.SCALE_DEFAULT));
       vestido4.setIcon(icono5);
       miPanel.add(vestido4);

       tvestido3 = new JLabel("<html>Vestido tinto elegante<html>");
       tvestido3.setBounds(230,880,600,200);
       tvestido3.setFont(fuentee);
       tvestido3.setForeground(new Color(227, 13, 51));
       miPanel.add(tvestido3);

       tvestido4 = new JLabel("<html>Vestido negro corto<html>");
       tvestido4.setBounds(230,615,600,200);
       tvestido4.setFont(fuentee);
       tvestido4.setForeground(new Color(227, 13, 51));
       miPanel.add(tvestido4);

       p1 = new JLabel("450$");
       p1.setBounds(310,135,600,200);
       p1.setFont(fuentee);
       p1.setForeground(new Color(227, 13, 51));
       miPanel.add(p1);

       p2 = new JLabel("380$");
       p2.setBounds(310,390,600,200);
       p2.setFont(fuentee);
       p2.setForeground(new Color(227, 13, 51));
       miPanel.add(p2);

       p3 = new JLabel("400$");
       p3.setBounds(310,645,600,200);
       p3.setFont(fuentee);
       p3.setForeground(new Color(227, 13, 51));
       miPanel.add(p3);

       p4 = new JLabel("450$");
       p4.setBounds(310,910,600,200);
       p4.setFont(fuentee);
       p4.setForeground(new Color(227, 13, 51));
       miPanel.add(p4);

       carrito = new JButton("Carrito");
       carrito.setBounds(20,1460,120,20);
       carrito.setBackground(new Color(227,13,51));
       carrito.setForeground(new Color(250, 249, 248));
       miPanel.add(carrito);

       agregar = new JButton("Agregar al carrito");
       agregar.setBounds(500,1460,150,20);
       agregar.setBackground(new Color(227,13,51));
       agregar.setForeground(new Color(250, 249, 248));
       miPanel.add(agregar);

       scroll = new JScrollPane(miPanel);
       miPanel.setPreferredSize(new Dimension(600,1500));
       scroll.getVerticalScrollBar().setUnitIncrement(16);
       add(scroll);

       textArea = new JTextArea("");
       textArea.setBounds(160, 1240, 300, 230);
       textArea.setEditable(false);
       miPanel.add(textArea);

       Font fuenteev = new Font("Times New Roman", Font.PLAIN, 20);
       eventor = new JLabel("");
       eventor.setBounds(470,1300,210,100);
       eventor.setFont(fuenteev);
       eventor.setForeground(new Color(227, 13, 51));
       miPanel.add(eventor);

       agregar.addActionListener(this);
       miPanel.addMouseListener(this);
       carrito.addActionListener(this);
}

public void itemStateChanged(ItemEvent accion){
        
        String seleccion = "vestidos:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" + "Vestido negro casual largo" + "\n" +
                 bvestido1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Vestido puntos de colores" + "\n" +
                bvestido2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Vestido negro corto" + "\n" + 
                bvestido3.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" + "\n" +
                 "Vestido tinto elegante" + "\n" + bvestido4.getSelectedItem().toString();

         num1 = Integer.parseInt((String) bvestido1.getSelectedItem());
         num2 = Integer.parseInt((String) bvestido2.getSelectedItem());
         num3 = Integer.parseInt((String) bvestido3.getSelectedItem());
         num4 = Integer.parseInt((String) bvestido4.getSelectedItem());
        totalarticulos = num1+num2+num3+num4;
         total = (num1*450) + (num2*380) + (num3*400) + (num4*450);
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
     carrito  ventana = new carrito();
     ventana.setBounds(300,250,700,700);
     ventana.setVisible(true);
     ventana.setResizable(false);
   }
   if(accion.getSource() == agregar){
     if(totalarticulos<=10){
     String metodopago = "nulo";
     String articulos ="vestidos:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" + "Vestido negro casual largo" + "\n" +
                bvestido1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Vestido puntos de colores" + "\n" +
                bvestido2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Vestido negro corto" + "\n" + 
                bvestido3.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" + "\n" +
                 "Vestido tinto elegante" + "\n" + bvestido4.getSelectedItem().toString() + "\n";

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
       pr2 = pr2+articulos;
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
      vestidos ventana = new vestidos();
      ventana.setBounds(300,250,700,700);
      ventana.setVisible(true);
      ventana.setResizable(false);
    }
}