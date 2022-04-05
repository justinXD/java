package banco;
import java.util.Scanner;

public class persona {

    private

    String nombre;
    String telefono;
    String domicilio;
    int edad;
    int saldo;
    int opciones;
    int alta;
    int retiro;
    int abono;

    Scanner entrada = new Scanner(System.in);

    public persona() {
       
    }
    
    public void menu(){
        
        saldo = 5000;
        
        do{
        
            System.out.println("  Bienvenido al banco!\nEliga una opcion");
            System.out.println("1.-Dar de alta\n2.-Mostrar Datos\n3.-Modificar datos\n4.-Hacer Retiro\n5.-Hacer Abono\n6.-Salir");

           opciones =  entrada.nextInt();
           
            switch(opciones){
                
                case 1:
                    System.out.println("Te haz dado de alta");
                    alta = 1;
                    System.out.print("\n");
                    System.out.print("\n");
                    System.out.print("\n");
                    break;
                
                case 2:
                    mostrardatos();
                    System.out.println("Saldo: $"+saldo);
                    System.out.print("\n");
                    System.out.print("\n");
                    System.out.print("\n");
                    break;
                
                case 3:
                    modificarDatos();
                    System.out.print("\n");
                    System.out.print("\n");
                    System.out.print("\n");
                    break;
                
                case 4:
                    retiro();
                    System.out.print("\n");
                    System.out.print("\n");
                    System.out.print("\n");
                    break;
                    
                case 5:
                    abono();
                    System.out.print("\n");
                    System.out.print("\n");
                    System.out.print("\n");
                    break;
                  
                case 6:
                    System.out.println("Adios papi!");
                    System.out.print("\n");
                    System.out.print("\n");
                    System.out.print("\n");
                    break; 
                default:
                    System.out.println("error de opcion, intenta de nuevo");
                    break;
            }
            
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\n");
            
        }while(opciones != 6);

    }
    
    public void ingresardatos(){
        
        System.out.println("Introdusca su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Edad: ");
        edad = entrada.nextInt();
        System.out.println("Telefono: ");
        telefono = entrada.nextLine();
        telefono = entrada.nextLine();
        System.out.println("Domicilio: ");
        domicilio = entrada.nextLine();
           
    }

    public void modificarDatos(){
        System.out.println("Introdusca su nombre: ");
        nombre = entrada.nextLine();
        nombre = entrada.nextLine();
        System.out.println("Edad: ");
        edad = entrada.nextInt();
        System.out.println("Telefono: ");
        telefono = entrada.nextLine();
        telefono = entrada.nextLine();
        System.out.println("Domicilio: ");
        domicilio = entrada.nextLine();
    }
    
    public void mostrardatos(){
        
        System.out.println("Mostrando Datos");
        System.out.print("\nNombre: "+nombre);  
        System.out.println("\nEdad: "+edad);
        System.out.println("Telefono: "+telefono);
        System.out.println("Domicilio: "+domicilio);
    }
    
    public void retiro(){
        
        if(alta == 1){
            
        if(saldo > 1){
        
         System.out.println("Ingrese el monto a retirar");
            retiro = entrada.nextInt();
         
            if(retiro > saldo) 
                System.out.println("No puedes retirar mas dinero que el de tu saldo");

            else{
                System.out.println("Retiro Satisfactorio");
                saldo -= retiro;
                System.out.println("Su nuevo saldo es de: "+saldo);
            }
        }

        else

            System.out.println("No tienes suficiente saldo para realizar un retiro");
        }

        else
            System.out.println("Aun no te haz dado de alta");
    }
    
    public void abono(){
        
        if(alta == 1){
            System.out.println("Ingrese el monto a abonar");
            abono = entrada.nextInt();
            saldo += abono;
            System.out.println("Su nuevo saldo es: "+saldo);
        }

        else
            
            System.out.println("Aun no te haz dado de alta");
    }
        
}
