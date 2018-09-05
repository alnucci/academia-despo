public class Principal {

	public static void main(String[] args) {

		Paciente pacienteA = new Paciente(160,1.75); //OM
		
		Paciente pacienteB = new Paciente(94,1.56 ); //OGII
		
		Paciente pacienteC = new Paciente(74,1.56 ); //OGI
		
		Paciente pacienteD = new Paciente(46,1.34 ); //S
		
	    Paciente pacienteE = new Paciente(63,1.75);  //NORMAL
		
		Paciente pacienteF = new Paciente(56,1.74 ); //BP
		
		Paciente pacienteG = new Paciente(50,1.74 ); //BPG
		
		Paciente pacienteH = new Paciente(46,1.84 ); //BPMG
	
		
		System.out.println("Indice de massa corporal (IMC) do paciente A: " + pacienteA.diagnostico() + "\n" );
		System.out.println("Indice de massa corporal (IMC) do paciente B: " + pacienteB.diagnostico() + "\n");
		System.out.println("Indice de massa corporal (IMC) do paciente C: " + pacienteC.diagnostico() + "\n");
		System.out.println("Indice de massa corporal (IMC) do paciente D: " + pacienteD.diagnostico() + "\n");

		System.out.println("Indice de massa corporal (IMC) do paciente E: " + pacienteE.diagnostico() + "\n" );
		System.out.println("Indice de massa corporal (IMC) do paciente F: " + pacienteF.diagnostico() + "\n");
		System.out.println("Indice de massa corporal (IMC) do paciente G: " + pacienteG.diagnostico() + "\n");
		System.out.println("Indice de massa corporal (IMC) do paciente H: " + pacienteH.diagnostico() + "\n");

}
}

