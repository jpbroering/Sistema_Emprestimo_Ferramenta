package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    /**
     * Esse método é utilizado para conectar com o banco de dados
     * @return connection;
     */
    public Connection getConexao() {
        Connection connection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "bd_emprestimo";//colocar db
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "Unisul@1520";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: Não Conectado!");
            }
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println(" O Driver não foi encontrado");
            return null;
        } catch (SQLException e) {
            System.out.println(" não foi possivel conectar");
            return null;
        }
    }
}
