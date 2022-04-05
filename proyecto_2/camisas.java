package proyecto_2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class camisas extends JFrame implements ItemListener, ActionListener, MouseListener{
    
    /**
   *
   */
  private static final long serialVersionUID = 1L;
  public JLabel etiqueta, portada, camisa1, camisa2, camisa3, dcamisa1, dcamisa2, dcamisa3, tcamisa2, tcamisa3;
    public JLabel p1,p2,p3,eventor;
    public JScrollPane scroll;
    public JPanel miPanel;
    public JButton carrito,agregar;
    public JComboBox <String> bcamisa1;
    public JComboBox <String> bcamisa2;
    public JComboBox <String> bcamisa3;
    public String seleccion, pr,pr2;
    public JTextArea textArea;
    public int totalarticulos;
    public int total, prov, prov2,num1,num2,num3;
    public camisas(){
       miPanel = new JPanel();
       miPanel.setLayout(null);
       setTitle("Camisas");
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       miPanel.setBackground(new Color(250,249,248));
       setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());

       bcamisa1 = new JComboBox<String>();
       bcamisa1.setBounds(240,390,60,30);
       miPanel.add(bcamisa1);
   
       bcamisa1.addItem("0");
       bcamisa1.addItem("1");
       bcamisa1.addItem("2");
       bcamisa1.addItem("3");
       bcamisa1.addItem("4");
       bcamisa1.addItem("5");
       bcamisa1.addItem("6");
       bcamisa1.addItem("7");
       bcamisa1.addItem("8");
       bcamisa1.addItem("9");
       bcamisa1.addItem("10");

       bcamisa1.addItemListener(this); 

       bcamisa2 = new JComboBox<String>();
       bcamisa2.setBounds(240,650,60,30);
       miPanel.add(bcamisa2);
   
       bcamisa2.addItem("0");
       bcamisa2.addItem("1");
       bcamisa2.addItem("2");
       bcamisa2.addItem("3");
       bcamisa2.addItem("4");
       bcamisa2.addItem("5");
       bcamisa2.addItem("6");
       bcamisa2.addItem("7");
       bcamisa2.addItem("8");
       bcamisa2.addItem("9");
       bcamisa2.addItem("10");

       bcamisa2.addItemListener(this);

       bcamisa3 = new JComboBox<String>();
       bcamisa3.setBounds(240,875,60,30);
       miPanel.add(bcamisa3);
   
       bcamisa3.addItem("0");
       bcamisa3.addItem("1");
       bcamisa3.addItem("2");
       bcamisa3.addItem("3");
       bcamisa3.addItem("4");
       bcamisa3.addItem("5");
       bcamisa3.addItem("6");
       bcamisa3.addItem("7");
       bcamisa3.addItem("8");
       bcamisa3.addItem("9");
       bcamisa3.addItem("10");

       bcamisa3.addItemListener(this);

       ImageIcon imagen = new ImageIcon("logomoda.png");
       portada = new JLabel(imagen);
       portada.setBounds(0,0,700,150);
       Icon icono = new ImageIcon(imagen.getImage() .getScaledInstance(portada.getWidth(),portada.getHeight(),Image.SCALE_DEFAULT));
       portada.setIcon(icono);
       miPanel.add(portada);

       Font fuentee = new Font("Times New Roman", Font.PLAIN, 20);
       etiqueta = new JLabel("<html>Camisa negra formal<html>");
       etiqueta.setBounds(230,100,600,200);
       etiqueta.setFont(fuentee);
       etiqueta.setForeground(new Color(227, 13, 51));
       miPanel.add(etiqueta);

       ImageIcon imagen1 = new ImageIcon("camisa1.png");
       camisa1 = new JLabel(imagen1);
       camisa1.setBounds(20,200,200,200);
       Icon icono2 = new ImageIcon(imagen1.getImage() .getScaledInstance(camisa1.getWidth(),camisa1.getHeight(),Image.SCALE_DEFAULT));
       camisa1.setIcon(icono2);
       miPanel.add(camisa1);

       Font fuentev1 = new Font("Times New Roman", Font.PLAIN, 20);
       dcamisa1 = new JLabel("<html>Indispensable en el aramrio de todo hombre<html>");
       dcamisa1.setBounds(240,200,600,200);
       dcamisa1.setFont(fuentev1);
       dcamisa1.setForeground(new Color(227, 13, 51));
       miPanel.add(dcamisa1);

       tcamisa2 = new JLabel("<html>Camisa de rayas azules<html>");
       tcamisa2.setBounds(230,360,600,200);
       tcamisa2.setFont(fuentee);
       tcamisa2.setForeground(new Color(227, 13, 51));
       miPanel.add(tcamisa2);

       dcamisa2 = new JLabel("<html>Ideal para una cita con tu pareja<html>");
       dcamisa2.setBounds(240,460,600,200);
       dcamisa2.setFont(fuentee);
       dcamisa2.setForeground(new Color(227, 13, 51));
       miPanel.add(dcamisa2);

       ImageIcon imagen2 = new ImageIcon("camisa2.png");
       camisa2 = new JLabel(imagen2);
       camisa2.setBounds(20,450,200,200);
       Icon icono3 = new ImageIcon(imagen2.getImage() .getScaledInstance(camisa2.getWidth(),camisa2.getHeight(),Image.SCALE_DEFAULT));
       camisa2.setIcon(icono3);
       miPanel.add(camisa2);

       ImageIcon imagen3 = new ImageIcon("camisa3.png");
       camisa3 = new JLabel(imagen3);
       camisa3.setBounds(20,700,200,200);
       Icon icono4 = new ImageIcon(imagen3.getImage() .getScaledInstance(camisa3.getWidth(),camisa3.getHeight(),Image.SCALE_DEFAULT));
       camisa3.setIcon(icono4);
       miPanel.add(camisa3);

       tcamisa3 = new JLabel("<html>Camisa rayas doradas<html>");
       tcamisa3.setBounds(230,610,600,200);
       tcamisa3.setFont(fuentee);
       tcamisa3.setForeground(new Color(227, 13, 51));
       miPanel.add(tcamisa3);

       dcamisa3 = new JLabel("<html>Conviertete en el rey de la fiesta con esta camisa<html>");
       dcamisa3.setBounds(240,700,600,200);
       dcamisa3.setFont(fuentee);
       dcamisa3.setForeground(new Color(227, 13, 51));
       miPanel.add(dcamisa3);

       p1 = new JLabel("400$");
       p1.setBounds(300,305,600,200);
       p1.setFont(fuentee);
       p1.setForeground(new Color(227, 13, 51));
       miPanel.add(p1);

       p2 = new JLabel("450$");
       p2.setBounds(305,565,600,200);
       p2.setFont(fuentee);
       p2.setForeground(new Color(227, 13, 51));
       miPanel.add(p2);

       p3 = new JLabel("400$");
       p3.setBounds(305,790,600,200);
       p3.setFont(fuentee);
       p3.setForeground(new Color(227, 13, 51));
       miPanel.add(p3);

       carrito = new JButton("Carrito");
       carrito.setBounds(20,1050,120,20);
       carrito.setBackground(new Color(227, 13, 51));
       carrito.setForeground(new Color(250, 249, 248));
       miPanel.add(carrito);

       agregar = new JButton("Agregar al carrito");
       agregar.setBounds(500,1050,150,20);
       agregar.setBackground(new Color(227, 13, 51));
       agregar.setForeground(new Color(250, 249, 248));
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
        
       String seleccion ="Camisas:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" +  "Camisa negra formal" + "\n" +
                bcamisa1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Camisa de rayas azules" + "\n" +
                bcamisa2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Camisa rayas doradas" + "\n" + bcamisa3.getSelectedItem().toString();

         num1 = Integer.parseInt((String) bcamisa1.getSelectedItem());
         num2 = Integer.parseInt((String) bcamisa2.getSelectedItem());
         num3 = Integer.parseInt((String) bcamisa3.getSelectedItem());
        totalarticulos = num1+num2+num3;
        total = (num1*400) + (num2*450) + (num3*400);
        String mostrar = Integer.toString(total);
        if(totalarticulos<=10){
           textArea.setText(seleccion);
        }
}
   
  public void actionPerformed(ActionEvent accion){
   if(accion.getSource() == carrito){
     try{
       Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/solo_moda_shop","root","");
         }catch (Exception e){}
     carrito  ventana = new carrito();
     ventana.setBounds(300,250,700,700);
     ventana.setVisible(true);
     ventana.setResizable(false);
   }
   if(accion.getSource() == agregar){
    if(totalarticulos<=10){
     String metodopago = "nulo";
     String articulos = "Camisas:" + "\n" + "----------------------------------------------------------------------------"+
                "\n" +  "Camisa negra formal" + "\n" +
                bcamisa1.getSelectedItem().toString() + 
                "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Camisa de rayas azules" + "\n" +
                bcamisa2.getSelectedItem().toString() + "\n" + "----------------------------------------------------------------------------" +
                "\n" + "Camisa rayas doradas" + "\n" + bcamisa3.getSelectedItem().toString();
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
      camisas ventana = new camisas();
      ventana.setBounds(300,250,700,700);
      ventana.setVisible(true);
      ventana.setResizable(false);
    }
}