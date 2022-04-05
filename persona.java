import java.util.Scanner;
    
    public class persona {
        String nombre;
        int edad;
        String direccion;
        long telefono;
        float promedio;
    public static void main(final String[] args) {
        final Scanner datos = new Scanner(System.in);
        final persona persona1 = new persona();
        final persona persona2 = new persona();
        final persona persona3 = new persona();
        
        System.out.println("\tbienvenido al programa!!!");
        System.out.println("vamos a empezar con los datos de la presona 1");
        System.out.println("\tcual es tu nombre?");
        persona1.nombre = datos.nextLine();
        System.out.println("\tcuanto años tienes?");
        persona1.edad = datos.nextInt();
        System.out.println("\tcual es tu direccion?");
        persona1.direccion = datos.nextLine();
        persona1.direccion = datos.nextLine();
        System.out.println("\tingresa tu numero telefonico");
        persona1.telefono = datos.nextInt();
        System.out.println("\tingresa tu promedio");
        persona1.promedio = datos.nextFloat();

        System.out.println("\tvamos con la persona 2");
        System.out.println("\tcual es tu nombre?");
        persona2.nombre = datos.nextLine();
        persona2.nombre = datos.nextLine();
        System.out.println("\tcuanto años tienes?");
        persona2.edad = datos.nextInt();
        System.out.println("\tcual es tu direccion?");
        persona2.direccion = datos.nextLine();
        persona2.direccion = datos.nextLine();
        System.out.println("\tingresa tu numero telefonico");
        persona2.telefono = datos.nextInt();
        System.out.println("\tingresa tu promedio");
        persona2.promedio = datos.nextFloat();

        System.out.println("\tvamos con la persona 3");
        System.out.println("\tcual es tu nombre?");
        persona3.nombre = datos.nextLine();
        persona3.nombre = datos.nextLine();
        System.out.println("\tcuanto años tienes?");
        persona3.edad = datos.nextInt();
        System.out.println("\tcual es tu direccion?");
        persona3.direccion = datos.nextLine();
        persona3.direccion = datos.nextLine();
        System.out.println("\tingresa tu numero telefonico");
        persona3.telefono = datos.nextInt();
        System.out.println("\tingresa tu promedio");
        persona3.promedio = datos.nextFloat();

        System.out.println("\tvamos a imprimir los datos de la persona 1");
        System.out.println("nombre: " + persona1.nombre + "\nedad: " + persona1.edad + "\ndireccion: " + persona1.direccion + "\ntelefono: " + persona1.telefono + "\npromedio: " + persona1.promedio);

        System.out.println("\tvamos a imprimir los datos de la persona 2");
        System.out.println("nombre: " + persona2.nombre + "\nedad: " + persona2.edad + "\ndireccion: " + persona2.direccion + "\ntelefono: " + persona2.telefono + "\npromedio: " + persona2.promedio);

        System.out.println("\tvamos a imprimir los datos de la persona 3");
        System.out.println("nombre: " + persona3.nombre + "\nedad: " + persona3.edad + "\ndireccion: " + persona3.direccion + "\ntelefono: " + persona3.telefono + "\npromedio: " + persona3.promedio);
        
    }
}