public class Principal {

	public static void main(String[] args) {

		Paciente pacienteA = new Paciente(63,1.75);
		
		Paciente pacienteB = new Paciente(74,1.56 );
		
		Paciente pacienteC = new Paciente(46,1.34 );
		
		System.out.println("Indice de massa corporal (IMC) do paciente A: " + pacienteA.diagnostico()+ "\n" );
		System.out.println("Indice de massa corporal (IMC) do paciente B: " + pacienteB.diagnostico() + "\n");
		System.out.println("Indice de massa corporal (IMC) do paciente C: " + pacienteB.diagnostico() + "\n");

}
}

