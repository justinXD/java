public class mensaje
{
	String texto;
	public void Mensaje(String texto)
		{
			System.out.println(texto);
		}
		
	public static void main(String[] args) 
	{
			mensaje saludoMañana = new mensaje();
			mensaje saludoTarde = new mensaje();
			mensaje saludoNoche = new mensaje();

			saludoMañana.Mensaje("buenos dias");
			saludoTarde.Mensaje("buenas tardes");
			saludoNoche.Mensaje("buenas noches");
	}
}