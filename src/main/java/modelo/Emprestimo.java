package modelo;

import java.sql.Date;
import dao.EmprestimoDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Classe para representar um objeto de empréstimo.
 */
public class Emprestimo {

    private int id;
    private int idFerramenta;
    private int idAmigo;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private EmprestimoDAO dao;

    /**
     * Construtor padrão da classe Emprestimo. Inicializa todos os campos com
     * valores padrão.
     */
    public Emprestimo() {
        this(0, 0, 0, null, null);
    }

    /**
     * Construtor da classe Emprestimo.
     *
     * @param id ID do empréstimo.
     * @param idFerramenta ID da ferramenta emprestada.
     * @param idAmigo ID do amigo que recebeu o empréstimo.
     * @param dataEmprestimo Data do empréstimo.
     */
    public Emprestimo(int id, int idFerramenta, int idAmigo, Date dataEmprestimo) {
        this.id = id;
        this.idFerramenta = idFerramenta;
        this.idAmigo = idAmigo;
        this.dataEmprestimo = dataEmprestimo;

    }

    /**
     * Construtor da classe Emprestimo.
     *
     * @param id ID do empréstimo.
     * @param idFerramenta ID da ferramenta emprestada.
     * @param idAmigo ID do amigo que recebeu o empréstimo.
     * @param dataEmprestimo Data do empréstimo.
     * @param dataDevolucao Data prevista para a devolução.
     */
    public Emprestimo(int id, int idFerramenta, int idAmigo, Date dataEmprestimo, Date dataDevolucao) {
        this.id = id;
        this.idFerramenta = idFerramenta;
        this.idAmigo = idAmigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        dao = new EmprestimoDAO();
    }

    /**
     * Obtém o ID do empréstimo.
     *
     * @return O ID do empréstimo.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do empréstimo.
     *
     * @param id O ID do empréstimo.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o ID da ferramenta emprestada.
     *
     * @return O ID da ferramenta emprestada.
     */
    public int getIdFerramenta() {
        return idFerramenta;
    }

    /**
     * Define o ID da ferramenta emprestada.
     *
     * @param idFerramenta O ID da ferramenta emprestada.
     */
    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    /**
     * Obtém o ID do amigo que recebeu o empréstimo.
     *
     * @return O ID do amigo que recebeu o empréstimo.
     */
    public int getIdAmigo() {
        return idAmigo;
    }

    /**
     * Define o ID do amigo que recebeu o empréstimo.
     *
     * @param idAmigo O ID do amigo que recebeu o empréstimo.
     */
    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    /**
     * Obtém a data do empréstimo.
     *
     * @return A data do empréstimo.
     */
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * Define a data do empréstimo.
     *
     * @param dataEmprestimo A data do empréstimo.
     */
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * Obtém a data prevista para a devolução.
     *
     * @return A data prevista para a devolução.
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * Define a data prevista para a devolução.
     *
     * @param dataDevolucao A data prevista para a devolução.
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * Obtém a lista de empréstimos.
     *
     * @return A lista de empréstimos.
     */
    public ArrayList<Emprestimo> getMinhaLista() {
        return dao.getMinhalista();
    }

    /**
     * Insere um empréstimo no banco de dados.
     *
     * @param idFerramenta O ID da ferramenta emprestada.
     * @param idAmigo O ID do amigo que recebeu o empréstimo.
     * @param dataEmprestimo A data do empréstimo.
     * @return Verdadeiro se a inserção for bem-sucedida, falso caso contrário.
     */
    public boolean insertEmprestimoBD(int idFerramenta, int idAmigo, Date dataEmprestimo) {
        int id = dao.maiorID() + 1;
        Emprestimo objeto = new Emprestimo(id, idFerramenta, idAmigo, dataEmprestimo);
        dao.insertEmprestimoBD(objeto);
        return true;
    }

    /**
     * Apaga um empréstimo do banco de dados.
     *
     * @param idEmprestimo O id do emprestimo a ser apagado.
     * @return Verdadeiro se a remoção for bem-sucedida, falso caso contrário.
     */
    public boolean deleteEmprestimoBD(int idEmprestimo) {
        return dao.deleteEmprestimoBD(idEmprestimo);
    }

    /**
     * Atualiza o conteúdo de um empréstimo no banco de dados.
     *
     * @param id O identificador do empréstimo.
     * @param idFerramenta O identificador da ferramenta.
     * @param idAmigo O identificador do amigo.
     * @param dataEmprestimo A data do empréstimo.
     * @param dataDevolucao A data de devolução.
     * @return Verdadeiro se a atualização for bem-sucedida, falso caso
     * contrário.
     */
    public boolean updateEmprestimoBD(int id, int idFerramenta, int idAmigo, Date dataEmprestimo, Date dataDevolucao) {
        Emprestimo objeto = new Emprestimo(id, idFerramenta, idAmigo, dataEmprestimo, dataDevolucao);
        return dao.updateEmprestimoBD(objeto);
    }

    /**
     * Verifica se tem emprestimos pendentes vinculados ao idAmigo.
     *
     * @param idAmigo o ID do amigo a ser verificado.
     * @return Verdadeiro se achar pelo menos um emprestimo pendente, falso caso
     * contrário.
     */
    public boolean verificaEmprestimoPendente(int idAmigo) {
        return dao.verificaEmprestimoPendente(idAmigo);
    }

    /**
     * Verifica se tem emprestimos pendentes vinculados a idFerramenta.
     *
     * @param idFerramenta o ID da ferramenta a ser verificada.
     * @return Verdadeiro se achar pelo menos um emprestimo pendente, falso caso
     * contrário.
     */
    public boolean verificaFerramentaEmprestada(int idFerramenta) {
        return dao.verificaFerramentaEmprestada(idFerramenta);
    }

    /**
     * Transforma um objeto Date em uma string formatada.
     *
     * @param data Data a ser formatada.
     * @return String formatada ou uma string vazia se a data for nula.
     */
    public String transformaData(Date data) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); // Define o formato da data.
        if (data != null) {
            return formato.format(data); // Retorna a data formatada.
        } else {
            return ""; // Retorna uma string vazia se a data for nula.
        }
    }

    /**
     * Retorna o amigo que fez mais empréstimos.
     *
     * @return Nome do amigo e total de empréstimos, ou {@code null} se não
     * houver resultados.
     */
    public String identificaQtdEmprestimo() {
        return dao.identificaQtdEmprestimo();
    }

    /**
     * Retorna os amigos que não devolveram nenhuma ferramenta.
     *
     * @return Nomes dos amigos que não devolveram ferramentas, ou {@code null}
     * se não houver resultados.
     */
    public String identificaSemDevolucao() {
        return dao.identificaSemDevolucao();
    }
}
