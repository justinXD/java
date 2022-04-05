package proyecto_2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Tiendaonline extends JFrame implements ActionListener{
    /**
   *
   */
  private static final long serialVersionUID = 1L;
  public JLabel portada, etiqueta, historia, historia1, imhistoria, historia2, historia3, historia4;
    public JLabel imag, camisa, ninos, mujer, hombre, ninos1,mujer1,hombre1,ninos2;
    public JPanel miPanel;
    public JScrollPane scroll;
    public JButton historiab, vestidob,camisasb,productob,salir,carrito;

  public Tiendaonline(){
     
    miPanel = new JPanel();
    miPanel.setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Solo Moda Shop");
    miPanel.setBackground(new Color(250, 249, 248));
    setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());

    ImageIcon imagen = new ImageIcon("logomoda.png");
    portada = new JLabel(imagen);
    portada.setBounds(0,0,600,170);
    Icon icono = new ImageIcon(imagen.getImage() .getScaledInstance(portada.getWidth(),portada.getHeight(),Image.SCALE_DEFAULT));
    portada.setIcon(icono);
    miPanel.add(portada);

    historia = new JLabel("Solo Moda Shop");
    historia.setBounds(50,200,300,80);
    Font fuente2 = new Font("Edwardian Script ITC", Font.PLAIN, 40);
    historia.setFont(fuente2);
    historia.setForeground(new Color(227, 13, 51));
    miPanel.add(historia);

    historia1 = new JLabel("Somos una tienda especializada en ropa de importacion ");
    historia1.setBounds(90,230,600,100);
    Font fuente3 = new Font("Times New Roman", Font.PLAIN,20);
    historia1.setFont(fuente3);
    historia1.setForeground(new Color(227, 13, 51));
    miPanel.add(historia1);

    historia2 = new JLabel("que no esta disponible para su venta en Mexico.");
    historia2.setBounds(90,250,600,100);
    historia2.setFont(fuente3);
    historia2.setForeground(new Color(227, 13, 51));
    miPanel.add(historia2);

    historia3 = new JLabel("Para tener lo mejor en moda de importacion, estas ");
    historia3.setBounds(90,270,600,100);
    historia3.setFont(fuente3);
    historia3.setForeground(new Color(227, 13, 51));
    miPanel.add(historia3);


    historia4 = new JLabel("en en lugar correcto, Mas de nosotros en el boton.");
    historia4.setBounds(90,290,600,100);
    historia4.setFont(fuente3);
    historia4.setForeground(new Color(227, 13, 51));
    miPanel.add(historia4);

    historiab = new JButton("Conocer mas");
    historiab.setBounds(430,360,120,20);
    historiab.setForeground(new Color(250, 249, 248));
    historiab.setBackground(new Color(227, 13, 51));
    miPanel.add(historiab);

    ImageIcon imagenh = new ImageIcon("icono1.png");
    imag = new JLabel(imagenh);
    imag.setBounds(40,430,190,90);
    Icon iconoo = new ImageIcon(imagenh.getImage() .getScaledInstance(imag.getWidth(),imag.getHeight(),Image.SCALE_DEFAULT));
    imag.setIcon(iconoo);
    miPanel.add(imag);

    mujer = new JLabel("Mujer");
    Font fuentep = new Font("Edwardian Script ITC", Font.PLAIN, 40);
    mujer.setBounds(50,350,300,100);
    mujer.setFont(fuentep);
    mujer.setForeground(new Color(227, 13, 51));
    miPanel.add(mujer);

    mujer1 = new JLabel("Vestidos Franceses");
    mujer1.setBounds(240,390,600,100);
    Font fuentedp = new Font("Edwardian Script ITC", Font.PLAIN,30);
    mujer1.setFont(fuentedp);
    mujer1.setForeground(new Color(227, 13, 51));
    miPanel.add(mujer1);

    vestidob = new JButton("Ver vestidos");
    vestidob.setBounds(420,490,120,20);
    vestidob.setBackground(new Color(227, 13, 51));
    vestidob.setForeground(new Color(250, 249, 248));
    miPanel.add(vestidob);

    ImageIcon imagenc = new ImageIcon("icono2.png");
    camisa = new JLabel(imagenc);
    camisa.setBounds(40,600,190,110);
    Icon iconooo = new ImageIcon(imagenc.getImage() .getScaledInstance(camisa.getWidth(),camisa.getHeight(),Image.SCALE_DEFAULT));
    camisa.setIcon(iconooo);
    miPanel.add(camisa);

    hombre = new JLabel("Hombre");
    Font fuentevv = new Font("Edwardian Script ITC", Font.PLAIN, 40);
    hombre.setBounds(60,520,300,100);
    hombre.setFont(fuentevv);
    hombre.setForeground(new Color(227, 13, 51));
    miPanel.add(hombre);

    hombre1 = new JLabel("Camisas finlandesas");
    hombre1.setBounds(240,570,600,100);
    Font fuentedv = new Font("Edwardian Script ITC", Font.PLAIN,30);
    hombre1.setFont(fuentedv);
    hombre1.setForeground(new Color(227, 13, 51));
    miPanel.add(hombre1);
    
    camisasb = new JButton("Ver camisas");
    camisasb.setBounds(420,670,120,20);
    camisasb.setBackground(new Color(227, 13, 51));
    camisasb.setForeground(new Color(250, 249, 248));
    miPanel.add(camisasb);

    ninos1 = new JLabel("Niños");
    Font fuentevvv = new Font("Edwardian Script ITC", Font.PLAIN, 40);
    ninos1.setBounds(80,720,300,100);
    ninos1.setFont(fuentevvv);
    ninos1.setForeground(new Color(227, 13, 51));
    miPanel.add(ninos1);

    ninos2 = new JLabel("Moda de Ucrania");
    ninos2.setBounds(250,770,600,100);
    Font fuentedpp = new Font("Edwardian Script ITC", Font.PLAIN,30);
    ninos2.setFont(fuentedpp);
    ninos2.setForeground(new Color(227, 13, 51));
    miPanel.add(ninos2);

    ImageIcon imagenn = new ImageIcon("icono3.png");
    ninos = new JLabel(imagenn);
    ninos.setBounds(40,800,190,110);
    Icon iconoooop = new ImageIcon(imagenn.getImage() .getScaledInstance(ninos.getWidth(),ninos.getHeight(),Image.SCALE_DEFAULT));
    ninos.setIcon(iconoooop);
    miPanel.add(ninos);

    productob = new JButton("Ver producto");
    productob.setBounds(420,870,120,20);
    productob.setBackground(new Color(227, 13, 51));
    productob.setForeground(new Color(250, 249, 248));
    miPanel.add(productob);
 
    salir = new JButton("Salir");
    salir.setBounds(420,1050,120,20);
    salir.setBackground(new Color(227, 13, 51));
    salir.setForeground(new Color(250, 249, 248));
    miPanel.add(salir);

    carrito = new JButton("Carrito");
    carrito.setBounds(20,1050,120,20);
    carrito.setBackground(new Color(227, 13, 51));
    carrito.setForeground(new Color(250, 249, 248));
    miPanel.add(carrito);

    scroll = new JScrollPane(miPanel);
    miPanel.setPreferredSize(new Dimension(550,1100));
    scroll.getVerticalScrollBar().setUnitIncrement(16);
    add(scroll);

    historiab.addActionListener(this);
    vestidob.addActionListener(this);
    productob.addActionListener(this);
    camisasb.addActionListener(this);
    salir.addActionListener(this);
    carrito.addActionListener(this);
  }

  public void actionPerformed(ActionEvent accion){
   if(accion.getSource() == historiab){
     historia  ventana = new historia();
     ventana.setBounds(400,400,500,600);
     ventana.setVisible(true);
     ventana.setResizable(false);
   }
    if(accion.getSource() == vestidob){
      try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/solo_moda_shop","root","");
        }catch(Exception e){}   
        vestidos ventana = new vestidos();
        ventana.setBounds(300,250,700,700);
        ventana.setVisible(true);
        ventana.setResizable(false);
   }
    if(accion.getSource() == productob){
     try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/solo_moda_shop","root","");
        }catch(Exception e){}
     ninos  ventana = new ninos();
     ventana.setBounds(300,250,700,700);
     ventana.setVisible(true);
     ventana.setResizable(false);
   }
    if(accion.getSource() == salir){
     System.exit(0);
   }
    if(accion.getSource() == camisasb){
     try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/solo_moda_shop","root","");
        }catch(Exception e){}
     camisas ventana = new camisas();
     ventana.setBounds(300,250,700,700);
     ventana.setVisible(true);
     ventana.setResizable(false);
   }    
    if(accion.getSource() == carrito){
     try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/solo_moda_shop","root","");
        }catch(Exception e){}
     carrito ventana = new carrito();
     ventana.setBounds(300,250,700,700);
     ventana.setVisible(true);
     ventana.setResizable(false);
   }
  }
  public static void main(String args[]){

     Tiendaonline ventana = new Tiendaonline();
     ventana.setBounds(100,100,600,800);
     ventana.setVisible(true);
     ventana.setResizable(false);

  }
}