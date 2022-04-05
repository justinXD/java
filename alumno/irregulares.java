package alumno;

public class irregulares extends alumno{

    String materia;
    String calificacion;
    String calificacion2;
    String calificacion3;
    String justificacion;

    public irregulares(String r, String n, String d, String c, String p, String s, String m, String cal1, String cal2, String cal3, String jus)
    {
        super(r, n, d, c, p, s);
        materia = m;
        calificacion = cal1;
        calificacion2 = cal2;
        calificacion3 = cal3;
        justificacion = jus;
    }

    public void irregular()
    {
        System.out.println("me quedo la materia de " + materia + " porque saque " + calificacion);
    }

    public void titulo()
    {
        System.out.println("tengo titulo en la materia de " + materia + " porque el profe me reprobo con " + calificacion2);
    }

    public void carta()
    {
        System.out.println("tengo que meter carta para que no me corran porque saque " + calificacion3);
        System.out.println(justificacion);
    }

    public static void main(String[] args) {
        irregulares chavos = new irregulares("19310447", "isaac justin davila sapiens", "el canal de panama", "mecanica", "50", "tercero", "ecuaciones diferenciales",
                                            "55", "69", "60", "tire paro profe :'(");
        chavos.irregular();
        chavos.titulo();
        chavos.carta();
    }
}
