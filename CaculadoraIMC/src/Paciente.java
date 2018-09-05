public class Paciente {
 double peso;
 double altura;

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    class calcularIMC {
        public static void main ( String [] args ) {
            double ResultadoIMC = this.peso/(this.altura * this.altura);
            if( ResultadoIMC &gt 40 )
            System.out.println("Obesidade mórbida");
      else if (ResultadoIMC &gt 35)
            System.out.println("Obesidade grau II");
      else if (ResultadoIMC &gt 30)
            System.out.println("Obesidade grau I");
        else if (ResultadoIMC &gt 25)
            System.out.println("Sobrepeso");
      else if (ResultadoIMC &gt 18.5)
            System.out.println("Peso normal");
      else if (ResultadoIMC &gt 17)
            System.out.println("Baixo peso");
      else if (ResultadoIMC &gt 16)
            System.out.println("Baixo peso grave");

      else
            System.out.println("Baixo peso muito grave");
        }
    }
}
