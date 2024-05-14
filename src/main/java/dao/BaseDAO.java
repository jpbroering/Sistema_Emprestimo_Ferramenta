package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Ferramenta;

public class BaseDAO {
    /**
     * Esse método é utilizado para
     * 
     */
    public Connection getConexao() {
        Connection connection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "alunos_bd";
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

    public boolean insertAlunoBD(Ferramenta objeto) {
        String sql = "INSERT INTO alunos_tb(idFerramenta,nome,marca,custo) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getIdFerramenta());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getMarca());
            stmt.setDouble(4, objeto.getCusto());
            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

}
