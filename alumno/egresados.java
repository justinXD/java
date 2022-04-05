package alumno;

public class egresados extends alumno{
    String fechaGraduacion;
    String area;
    String horas;
    String sueldo;
    String empresa;
    String salario;

    public egresados(String r, String n, String d, String c, String p, String s, String fg, String ar, String hrs, String su, String emp, String sal)
    {
        super(r, n, d, c, p, s);
        fechaGraduacion = fg;
        horas = hrs;
        sueldo = su;
        empresa = emp;
        salario = sal;
        area = ar;
    }

    public void egreso()
    {
        System.out.println(fechaGraduacion);
    }

    public void cetiWorker()
    {
        System.out.println(nombre + " trabaja en el area de " + area + " "+ horas + " horas al dia  de lunes a viernes y gana " + sueldo + " diarios");
    }

    public void industria()
    {
        System.out.println(nombre + " trabaja en " + empresa + " y gana " + salario + " diarios");
    }

    public static void main(String[] args) {
        egresados trabajadores = new egresados("19310447", "isaac justin davila sapiens", "el canal de panama", "mecanica", "86", "tercero", "18 de marzo de 2023", "IOT", "8", "900", "IBM", "1110");
        trabajadores.egreso();
        trabajadores.cetiWorker();
        trabajadores.industria();
    }
}
