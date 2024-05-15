
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Emprestimo;


public class EmprestimoDAO extends BaseDAO {
    private static ArrayList<Emprestimo> listaEmprestimo = new ArrayList<>();

    public ArrayList<Emprestimo> getMinhalista() {
        listaEmprestimo.clear();
        try {
            Statement stmt = this.getConexao().createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo");
            while (res.next()) {
                int id = res.getInt("id_emprestimo");
                int idFerramenta = res.getInt("tb_ferramenta_id_ferramenta");
                int idAmigo = res.getInt("tb_amigo_id_amigo");
                String dataEmprestimo = res.getString("data_emprestimo");
                String dataDevolucao = res.getString("data_devolucao");
                
                    Emprestimo objeto = new Emprestimo(id,idFerramenta , idAmigo, dataEmprestimo, dataDevolucao);
                listaEmprestimo.add(objeto);
            }
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaEmprestimo;
    }
    
    public void setMinhalista(ArrayList<Emprestimo> Emprestimo) {
        EmprestimoDAO.listaEmprestimo = listaEmprestimo;
    }
    
    public int maiorID(){
        int maiorID = 0;
        try{
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
    
    public boolean insertEmprestimoBD(Emprestimo objeto) {
        String sql = "INSERT INTO tb_emprestimo(id_emprestimo,tb_amigo_id_amigo,tb_ferramenta_id_ferramenta,data_emprestimo,data_devolucao) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setInt(3, objeto.getIdAmigo());
            stmt.setInt(2, objeto.getIdFerramenta());
            stmt.setString(4, objeto.getDataEmprestimo());
            stmt.setString(5, objeto.getDataDevolucao());
            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }
}

