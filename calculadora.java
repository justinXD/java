import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

public class calculadora 
{
    Scanner datos = new Scanner(System.in);
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    private int opc;
    void sumar()
    {
        System.out.print("ingresa el primer numero: ");
        a = datos.nextInt();
        System.out.print("ingresa el segundo numero: ");
        b = datos.nextInt();
        c = a + b;
    }
    int restar()
    {
        System.out.print("ingresa el primer numero: ");
        a = datos.nextInt();
        System.out.print("ingresa el segundo numero: ");
        b = datos.nextInt();
        c = a - b;
        return c;
    }
    int multiplicar()
    {
        System.out.print("ingresa el primer numero: ");
        a = datos.nextInt();
        System.out.print("ingresa el segundo numero: ");
        b = datos.nextInt();
        c = a * b;
        return c;
    }
    float dividir()
    {
        System.out.print("ingresa el primer numero: ");
        d = datos.nextInt();
        System.out.print("ingresa el segundo numero: ");
        e = datos.nextInt();
        f = d / e;
        return f;
    }
    public void menu()
    {
        do {
            try {
                //int opc;
                System.out.print("\n");
                System.out.print("\tbienvenido a la calculadora");
                System.out.print("\ningresa\n1 si quieres hacer una suma,\n2 si quieres restar,\n3 si quieres multiplicar, \n4 si quieres dividir o, \n5 si quieres salir de la calculadora: ");
            opc = datos.nextInt();
            switch (opc) {
                case 1:
                    sumar();
                    System.out.printf("%d + %d = %d\n", a, b, c);
                    break;
                case 2:
                    restar();
                    System.out.printf("%d - %d = %d\n", a, b, c);
                    break;
                case 3:
                    multiplicar();
                    System.out.printf("%d x %d = %d\n", a, b, c);
                    break;
                case 4:
                    dividir();
                    System.out.println(d);
                    System.out.printf("%.2f / %.2f = %.2f\n", d, e, f);
                    break;
                case 5:
                System.out.println("adios papu");
                    break;
                default:
                    System.out.println("error de seleccion\n");
                    break;
            }
            } catch (InputMismatchException error) {
                System.out.println("\tSyntax error");
                System.out.println("\tingresaste un tipo de dato no permitido");
                System.out.println("\tintenta de nuevo");
                datos.nextLine();
            }
            catch(ArithmeticException error)
            {
                System.out.println("\tMath error");
                System.out.println("\tintentaste dividir entre 0, eso no esta permitido");
                System.out.println("\ttu denominador debe ser > 0");
            }
            catch(Exception exception)
            {
                System.out.println("\tfatal error");
                System.out.println("\tvas a quemar la calculadora si sigues asi");
            }
        } while (opc != 5);
        
    }
    public static void main(final String[] args) {
        final calculadora calculadora = new calculadora();
        calculadora.menu();

    }
}
