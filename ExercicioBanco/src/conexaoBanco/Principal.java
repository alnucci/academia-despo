package conexaoBanco;

public class Principal {

	public static void conectar(Conexao conectar) {
		conectar.connect();
		conectar.commit();
		conectar.rollback();
	}

	public static void main(String[] args) {
		
      conectar(new Mysql());
      conectar(new Oracle());
      conectar(new SqlServer());
      
	}

}
