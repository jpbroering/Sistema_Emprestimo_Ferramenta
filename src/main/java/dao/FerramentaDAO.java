package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ferramenta;

/**
 * Classe responsável por realizar operações de acesso a dados relacionadas às
 * ferramentas no banco de dados.
 */
public class FerramentaDAO extends BaseDAO {
    
    private static ArrayList<Ferramenta> listaFerramenta = new ArrayList<>();

   /**
     * Retorna a lista de todas as ferramentas cadastradas no banco de dados.
     *
     * @return lista de objetos Ferramenta
     */
    public ArrayList<Ferramenta> getMinhalista() {
        listaFerramenta.clear();
        try {
            Statement stmt = this.getConexao().createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramenta");
            while (res.next()) {
                int id = res.getInt("id");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                float custo = res.getInt("custo");

                Ferramenta objeto = new Ferramenta(id, nome, marca, custo);
                listaFerramenta.add(objeto);
            }
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaFerramenta;
    }
    
     /**
     * Define a lista de ferramentas.
     *
     * @param listaFerramenta lista de objetos Ferramenta
     */
    public void setMinhalista(ArrayList<Ferramenta> listaFerramenta) {
        FerramentaDAO.listaFerramenta = listaFerramenta;
    }
    
     /**
     * Retorna o maior ID de ferramenta presente no banco de dados.
     *
     * @return o maior ID de ferramenta
     */
    public int maiorID(){
        int maiorID = 0;
        try{
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_ferramenta) id FROM tb_ferramenta");
            res.next();
            maiorID = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return maiorID;
    }
    
    /**
     * Insere uma nova ferramenta no banco de dados.
     *
     * @param objeto ferramenta a ser inserida
     * @return true se a inserção for bem-sucedida
     */
    public boolean insertFerramentaBD(Ferramenta objeto) {
        String sql = "INSERT INTO tb_ferramenta(id_ferramenta,nome,marca,custo) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getMarca());
            stmt.setFloat(4, (float) objeto.getCusto());
            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }
}
