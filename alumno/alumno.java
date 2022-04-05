package alumno;

public class alumno {
    String registro;
    String nombre;
    String domicilio;
    String carrera;
    String promedio;
    String semestre;

    public alumno(String r, String n, String d, String c, String p, String s)
    {
        registro = r;
        nombre = n;
        domicilio = d;
        carrera = c;
        promedio = p;
        semestre = s;
    }

    public void datosGenerales()
    {
        System.out.println("datos generales");
        System.out.println(registro);
        System.out.println(nombre);
        System.out.println(domicilio);
        System.out.println(carrera);
        System.out.println(promedio);
        System.out.println(semestre);
    }
}
