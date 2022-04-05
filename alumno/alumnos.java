package alumno;

public class alumnos extends alumno{
    String becado;
    String servicioSocial;
    String practicasProfecionales;
    int horas;
    String area;
    String empresa;
    String remuneracion;
    public alumnos(String r, String n, String d, String c, String p, String s, String SS, String bec, String PP, int hrs, String ar, String rem)
    {
        super(r, n, d, c, p, s);
        servicioSocial = SS;
        practicasProfecionales = PP;
        horas = hrs;
        area = ar;
        remuneracion = rem;
        becado = bec;
    }

    public void practicas()
    {
        System.out.println(nombre + " hace sus practicas en " + practicasProfecionales +
        ", le pagan " + remuneracion + " a la semana y tiene que cubrir " + horas + " en total");
    }

    public void beca()
    {
        System.out.println("la beca de " + nombre + " es de " + becado);
    }

    public void servicio()
    {
        System.out.println(nombre + " hace su servicio social en " + servicioSocial + " y tiene que cumplir " + (horas - 320) + " horas en total");
    }

    public static void main(String[] args) {
        alumnos chavos = new alumnos("19310447", "isaac justin davila sapiens", "el canal de panama", "mecanica", "86", "tercero", "teatro", "1600", "hyundai", 800, "mecanica", "500");
        chavos.datosGenerales();
        chavos.beca();
        chavos.practicas();
        chavos.servicio();
    }
}
