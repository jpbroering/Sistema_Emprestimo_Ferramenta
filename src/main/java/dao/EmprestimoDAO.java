package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Emprestimo;

/**
 * Classe para acessar e manipular dados de empréstimos no banco de dados.
 */
public class EmprestimoDAO extends BaseDAO {

    private static ArrayList<Emprestimo> listaEmprestimo = new ArrayList<>();

    /**
     * Obtém a lista de empréstimos do banco de dados.
     *
     * @return A lista de empréstimos.
     */
    public ArrayList<Emprestimo> getMinhalista() {
        listaEmprestimo.clear();
        try {
            Statement stmt = this.getConexao().createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo");
            while (res.next()) {
                int id = res.getInt("id_emprestimo");
                int idFerramenta = res.getInt("tb_ferramenta_id_ferramenta");
                int idAmigo = res.getInt("tb_amigo_id_amigo");
                Date dataEmprestimo = res.getDate("data_emprestimo");
                Date dataDevolucao = res.getDate("data_devolucao");

                Emprestimo objeto = new Emprestimo(id, idFerramenta, idAmigo, dataEmprestimo, dataDevolucao);
                listaEmprestimo.add(objeto);
            }
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaEmprestimo;
    }

    /**
     * Define a lista de empréstimos.
     *
     * @param Emprestimo Para lista de empréstimos a ser definida.
     */
    public void setMinhalista(ArrayList<Emprestimo> Emprestimo) {
        EmprestimoDAO.listaEmprestimo = listaEmprestimo;
    }

    /**
     * Obtém o maior ID de empréstimo presente no banco de dados.
     *
     * @return O maior ID de empréstimo.
     */
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_emprestimo) id FROM tb_emprestimo");
            res.next();
            maiorID = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return maiorID;
    }

    /**
     * Insere um empréstimo no banco de dados.
     *
     * @param objeto Para o objeto de empréstimo a ser inserido.
     * @return Verdadeiro se for bem-sucedido, falso caso contrário.
     */
    public boolean insertEmprestimoBD(Emprestimo objeto) {
        String sql = "INSERT INTO tb_emprestimo(id_emprestimo,tb_amigo_id_amigo,tb_ferramenta_id_ferramenta,data_emprestimo,data_devolucao) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setInt(2, objeto.getIdAmigo());
            stmt.setInt(3, objeto.getIdFerramenta());
            stmt.setDate(4, objeto.getDataEmprestimo());
            stmt.setDate(5, objeto.getDataDevolucao());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public boolean verificaFerramenta (int idFerramenta) {
        String sql = "SELECT * FROM tb_emprestimo WHERE tb_ferramenta_id_ferramenta = ? and data_devolucao is null";
        try{
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, idFerramenta);
            try(ResultSet res = stmt.executeQuery()){
                if(res.next()){
                    stmt.close();
                    return false;
                } else {
                    stmt.close();
                    return true;
                }
            }
        } catch(SQLException erro) {
            System.out.println("Erro: "+erro);
        }
        return true;
    }
    
    public boolean verificaAmigo (int idAmigo) {
        String sql = "SELECT * FROM tb_emprestimo WHERE tb_amigo_id_amigo = ? and data_devolucao is null";
        try{
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, idAmigo);
            try(ResultSet res = stmt.executeQuery()){
                if(res.next()){
                    stmt.close();
                    return true;
                } else {
                    stmt.close();
                    return false;
                }
            }
            
        } catch(SQLException erro) {
            System.out.println("Erro: "+erro);
        }
        return true;
    }
}
