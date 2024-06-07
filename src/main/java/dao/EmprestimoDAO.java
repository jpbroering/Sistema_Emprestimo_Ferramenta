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

    /**
     * Remove um empréstimo do banco de dados.
     *
     * @param idEmprestimo o ID do emprestimo a ser removido.
     * @return Verdadeiro se a remoção for bem-sucedida, falso caso contrário.
     */
    public boolean deleteEmprestimoBD(int idEmprestimo) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_emprestimo where id_emprestimo = " + idEmprestimo);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return true;
    }

    /**
     * Atualiza o conteúdo de um emprestimo no banco de dados.
     *
     * @param objeto do tipo emprestimo.
     * @return Verdadeiro se a atualização for bem-sucedida, falso caso
     * contrário.
     */
    public boolean updateEmprestimoBD(Emprestimo objeto) {
        String sql = "UPDATE tb_emprestimo set data_emprestimo = ?, data_devolucao = ?, tb_amigo_id_amigo = ?, tb_ferramenta_id_ferramenta = ? WHERE id_emprestimo = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setDate(1, objeto.getDataEmprestimo());
            stmt.setDate(2, objeto.getDataDevolucao());
            stmt.setInt(3, objeto.getIdAmigo());
            stmt.setInt(4, objeto.getIdFerramenta());
            stmt.setInt(5, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Verifica se tem emprestimos pendentes vinculados a idFerramenta.
     *
     * @param idFerramenta o ID da ferramenta a ser verificada.
     * @return Verdadeiro se achar pelo menos um emprestimo pendente, falso caso
     * contrário.
     */
    public boolean verificaFerramentaEmprestada(int idFerramenta) {
        String sql = "SELECT * FROM tb_emprestimo WHERE tb_ferramenta_id_ferramenta = ? and data_devolucao is null";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, idFerramenta);
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    stmt.close();
                    return false;
                } else {
                    stmt.close();
                    return true;
                }
            }
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return true;
    }

    /**
     * Verifica se tem emprestimos pendentes vinculados a idFerramenta.
     *
     * @param idAmigo o ID da ferramenta a ser verificada.
     * @return Verdadeiro se achar pelo menos um emprestimo pendente, falso caso
     * contrário.
     */
    public boolean verificaEmprestimoPendente(int idAmigo) {
        String sql = "SELECT * FROM tb_emprestimo WHERE tb_amigo_id_amigo = ? and data_devolucao is null";
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

    /**
     * Este método identifica o amigo que fez mais empréstimos.
     *
     * <p>
     * Ele executa uma consulta SQL que conta o número de empréstimos feitos por
     * cada amigo, ordena os resultados em ordem decrescente e retorna o nome do
     * amigo com o maior número de empréstimos.
     * </p>
     *
     * @return Uma string contendo o nome do amigo que fez mais empréstimos e o
     * total de empréstimos, ou {@code null} se não houver resultados.
     */
    public String identificaQtdEmprestimo() {
        String sql = "SELECT a.nome, COUNT(e.id_emprestimo) AS total_emprestimos FROM tb_amigo a JOIN tb_emprestimo e ON a.id_amigo = e.tb_amigo_id_amigo GROUP BY a.id_amigo, a.nome ORDER BY total_emprestimos DESC LIMIT 1";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            try (ResultSet resultSet = stmt.executeQuery()) {
                // Processar os resultados
                if (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    int totalEmprestimos = resultSet.getInt("total_emprestimos");
                    stmt.close();
                    return nome + " fez mais emprestimos com um total de " + totalEmprestimos + "\n\n";
                } else {
                    stmt.close();
                    return null;
                }
            }

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return null;
    }

    /**
     * Este método identifica os amigos que não devolveram nenhuma ferramenta.
     *
     * <p>
     * Ele executa uma consulta SQL que seleciona amigos que fizeram empréstimos
     * mas não devolveram nenhuma ferramenta. A consulta conta o número de
     * empréstimos não devolvidos para cada amigo e retorna uma lista de nomes
     * desses amigos.
     * </p>
     *
     * @return Uma string contendo os nomes dos amigos que não devolveram
     * nenhuma ferramenta, ou {@code null} se não houver resultados.
     */
    public String identificaSemDevolucao() {
        String sql = "SELECT a.nome, COUNT(e.id_emprestimo) AS total_emprestimos FROM tb_amigo a JOIN tb_emprestimo e ON a.id_amigo = e.tb_amigo_id_amigo WHERE a.id_amigo NOT IN (SELECT e2.tb_amigo_id_amigo FROM tb_emprestimo e2 WHERE e2.data_devolucao IS NOT NULL) GROUP BY a.id_amigo, a.nome HAVING COUNT(e.id_emprestimo) > 0;";
        String nome = "";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            try (ResultSet resultSet = stmt.executeQuery()) {
                // Processar os resultados
                while (resultSet.next()) {
                    nome = nome + resultSet.getString("nome") + " não devolveu nenhuma ferramenta\n\n";
                }
                stmt.close();
                return nome;
            }

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return null;
    }
}
