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
                int id = res.getInt("id_ferramenta");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                float custo = res.getFloat("custo");

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
    public int maiorID() {
        int maiorID = 0;
        try {
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

    /**
     * Atualiza as informações de uma ferramenta no banco de dados.
     *
     * Este método recebe um objeto do tipo Ferramenta e atualiza seus dados
     * (nome, marca e custo) na tabela `tb_Ferramenta` do banco de dados, com
     * base no ID da ferramenta.
     *
     * @param objeto O objeto Ferramenta contendo as informações a serem
     * atualizadas.
     * @return true se a atualização foi bem-sucedida, false caso contrário.
     * @throws RuntimeException se ocorrer um erro de SQL durante a operação.
     */
    public boolean updateFerramentaBD(Ferramenta objeto) {
        String sql = "UPDATE tb_Ferramenta SET nome = ?, marca = ?, custo = ? WHERE id_Ferramenta = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getMarca());
            stmt.setFloat(3, objeto.getCusto());
            stmt.setInt(4, objeto.getId());
            stmt.executeUpdate();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Deleta uma ferramenta do banco de dados.
     *
     * Este método recebe um ID de ferramenta e remove o registro correspondente
     * da tabela `tb_Ferramenta` no banco de dados.
     *
     * @param id O ID da ferramenta a ser removida.
     * @return true se a remoção foi bem-sucedida, false caso contrário.
     * @throws RuntimeException se ocorrer um erro de SQL durante a operação.
     */
    public boolean deleteFerramentaBD(int id) {
        String sql = "DELETE FROM tb_Ferramenta WHERE id_Ferramenta = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Verifica se uma ferramenta está associada a algum empréstimo no banco de
     * dados.
     *
     * Este método recebe o ID de uma ferramenta e verifica se existe algum
     * registro na tabela `tb_emprestimo` que associa essa ferramenta.
     *
     * @param idFerramenta O ID da ferramenta a ser verificada.
     * @return true se a ferramenta está associada a pelo menos um empréstimo,
     * false caso contrário.
     * @throws RuntimeException se ocorrer um erro de SQL durante a operação.
     */
    public boolean verificaFerramenta(int idFerramenta) {
        String sql = "SELECT * FROM tb_emprestimo WHERE tb_Ferramenta_id_Ferramenta = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, idFerramenta);
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    stmt.close();
                    return true;
                } else {
                    stmt.close();
                    return false;
                }
            }

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return true;

    }

}
