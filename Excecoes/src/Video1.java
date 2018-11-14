
public class Video1 {

	public double porcao(double valor, double porCento) 
		throws ForaDoIntervaloException  {
		if(porCento > 100 || porCento <0) {
			throw new ForaDoIntervaloException(String.valueOf(porCento));
		}
		
		return valor * porCento / 100;
	}
	}
