
public class Principal {

	public static void main(String[] args) throws Exception {
		a(100);
		System.out.println("Terminando a execu��o de main() ");
	}
	
	public static void a(int i) {
		System.out.println("Executando a() com "+i);

		try {
			b(100);
		} catch (Exception e) {
			System.out.println("Tratando a exce��o: "+e.getMessage());
		}
		System.out.println("Terminando a execu��o de a() ");

	}
	
	public static void b(int i) throws Exception {
		System.out.println("Executando b() com "+i);
		throw new Exception("Mensagem");
	}

}
