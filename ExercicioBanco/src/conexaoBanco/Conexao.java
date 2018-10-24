package conexaoBanco;

public interface Conexao {

	//rollback()
	
	void rollback();
	
	//commit()
	
	void commit();
	
	//connect()
	
    void connect();	

}
