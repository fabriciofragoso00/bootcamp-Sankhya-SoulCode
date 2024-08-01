// Caso de Uso 2: Conexão com Banco de Dados

// Você está desenvolvendo uma aplicação que se conecta a um banco de dados PostgreSQL para buscar dados de uma tabela. Se a conexão com o banco de dados falhar, deve ser lançada uma exceção personalizada `DatabaseConnectionException`. Se a consulta SQL falhar, deve ser lançada uma exceção personalizada `SQLQueryException`.

package AULA_28_06.EXERCICIO_4_EXCECOES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class atv_02 {
     public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try{

            // Carregar o driver JDBC 
            Class.forName("org.postgresql.Driver");

            //Parâmetros de conexão
            String url = "jdbc:postgresql://localhost:5432/aulasSoulcode";
            String user = "postgres";
            String password = "postgres";

            //Estabelecendo a conexão
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");

            //Criando uma declaração
            statement = connection.createStatement();
            String sql = "SELECT * FROM clientes";
            statement.executeQuery(sql);
            System.out.println("Consulta realizada com sucesso!");
        } catch (SQLException | ClassNotFoundException e){
            //Tratamento de exceção
            System.out.println("Erro ao conectar ou executar a consulta: " + e.getMessage());
        } finally {
            //Fechando a declaração e a conexão
            try {
                if(statement != null){
                    statement.close();
                    System.out.println("Statement fechado com sucesso!");
                }
                if (connection != null){
                    connection.close();
                    System.out.println("Conexão fechada com sucesso!");
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar os recursos: " + e.getMessage());
            }
        }
    }
}
