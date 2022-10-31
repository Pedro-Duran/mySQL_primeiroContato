
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaConexao {

public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		 Connection connection = connectionFactory.recuperarConexao();

		 System.out.println("fechando conexao!!");
		 connection.close();
	}

}


