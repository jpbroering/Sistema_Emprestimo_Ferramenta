package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Amigo;

/**
 * Classe responsável por realizar operações de acesso a dados relacionadas aos
 * amigos no banco de dados.
 */
public class AmigoDAO extends BaseDAO {

    private static ArrayList<Amigo> listaAmigo = new ArrayList<>();

    /**
     * Retorna a lista de todos os amigos cadastrados no banco de dados.
     *
     * @return lista de objetos Amigo
     */
    public ArrayList<Amigo> getMinhalista() {
        listaAmigo.clear();
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigo");
            while (res.next()) {
                int id = res.getInt("id_amigo");
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");

                Amigo objeto = new Amigo(id, nome, telefone);
                listaAmigo.add(objeto);
            }
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaAmigo;
    }

    /**
     * Define a lista de amigos.
     *
     * @param listaAmigo lista de objetos Amigo
     */
    public void setMinhalista(ArrayList<Amigo> listaAmigo) {
        AmigoDAO.listaAmigo = listaAmigo;
    }

    /**
     * Retorna o maior ID de amigo presente no banco de dados.
     *
     * @return o maior ID de amigo
     */
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_amigo) id FROM tb_amigo");
            res.next();
            maiorID = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return maiorID;
    }

    /**
     * Insere um novo amigo no banco de dados.
     *
     * @param objeto amigo a ser inserido
     * @return true se a inserção for bem-sucedida
     */
    public boolean insertAmigoBD(Amigo objeto) {
        String sql = "INSERT INTO tb_amigo(id_amigo, nome, telefone) VALUES(?, ?, ?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getTelefone());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Atualiza os dados de um amigo no banco de dados.
     *
     * @param objeto amigo com os dados atualizados
     * @return true se a atualização for bem-sucedida
     */
    public boolean atualizarAmigoBD(Amigo objeto) {
        String sql = "UPDATE tb_amigo SET nome = ?, telefone = ? WHERE id_amigo = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getId());
            stmt.executeUpdate();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Remove um amigo do banco de dados.
     *
     * @param id ID do amigo a ser removido
     * @return true se a remoção for bem-sucedida
     */
    public boolean removerAmigoBD(int id) {
        String sql = "DELETE FROM tb_amigo WHERE id_amigo = ?";
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
     * Busca um amigo no banco de dados pelo ID.
     *
     * @param id ID do amigo a ser buscado
     * @return objeto Amigo se encontrado, caso contrário retorna null
     */
    public Amigo buscarAmigoBD(int id) {
        String sql = "SELECT * FROM tb_amigo WHER"
                + "E id_amigo = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet res = stmt.executeQuery();
            if (res.next()) {
                int amigoId = res.getInt("id_amigo");
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");
                stmt.close();
                return new Amigo(amigoId, nome, telefone);
            }
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return null;

    }

    public boolean verificaAmigo(int idAmigo) {
        String sql = "SELECT * FROM tb_emprestimo WHERE tb_amigo_id_amigo = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, idAmigo);
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
