package modelo;

import java.util.Date;
import dao.EmprestimoDAO;
import java.util.ArrayList;

/**
 * Classe para representar um objeto de empréstimo.
 */
public class Emprestimo {

    private int id;
    private int idFerramenta;
    private int idAmigo;
    private String dataEmprestimo;
    private String dataDevolucao;
    EmprestimoDAO dao;

    /**
     * Construtor padrão da classe Emprestimo. Inicializa todos os campos com
     * valores padrão.
     */
    public Emprestimo() {
        this(0, 0, 0, "", "");
    }

    /**
     * Construtor da classe Emprestimo.
     *
     * @param id ID do empréstimo.
     * @param idFerramenta ID da ferramenta emprestada.
     * @param idAmigo ID do amigo que recebeu o empréstimo.
     * @param dataEmprestimo Data do empréstimo.
     */
    public Emprestimo(int id, int idFerramenta, int idAmigo, String dataEmprestimo) {
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
    public Emprestimo(int id, int idFerramenta, int idAmigo, String dataEmprestimo, String dataDevolucao) {
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
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * Define a data do empréstimo.
     *
     * @param dataEmprestimo A data do empréstimo.
     */
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * Obtém a data prevista para a devolução.
     *
     * @return A data prevista para a devolução.
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * Define a data prevista para a devolução.
     *
     * @param dataDevolucao A data prevista para a devolução.
     */
    public void setDataDevolucao(String dataDevolucao) {
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
    public boolean InsertEmprestimoBD(int idFerramenta, int idAmigo, String dataEmprestimo) {

        int id = dao.maiorID() + 1;
        Emprestimo objeto = new Emprestimo(id, idFerramenta, idAmigo, dataEmprestimo);
        dao.insertEmprestimoBD(objeto);
        return true;
    }
}
