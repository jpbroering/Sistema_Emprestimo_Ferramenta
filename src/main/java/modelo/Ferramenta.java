package modelo;

import dao.FerramentaDAO;
import java.util.ArrayList;

/**
 * Classe que representa uma ferramenta, herdando de EstruturaBase. Possui uma
 * marca, um custo e métodos para manipular e persistir os dados no banco de
 * dados.
 */
public class Ferramenta extends EstruturaBase {

    private String marca;
    private float custo;
    private FerramentaDAO dao;

    /**
     * Construtor padrão que inicializa um objeto Ferramenta com valores padrão.
     */
    public Ferramenta() {
        this(0, "", "", 0);
    }

    /**
     * Construtor que inicializa um objeto Ferramenta com os valores fornecidos.
     *
     * @param id o ID da ferramenta
     * @param nome o nome da ferramenta
     * @param marca a marca da ferramenta
     * @param custo o custo da ferramenta
     */
    public Ferramenta(int id, String nome, String marca, float custo) {
        super(id, nome);
        this.marca = marca;
        this.custo = custo;
        dao = new FerramentaDAO();
    }

    /**
     * Retorna a marca da ferramenta.
     *
     * @return a marca da ferramenta
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define a marca da ferramenta.
     *
     * @param marca a nova marca da ferramenta
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Retorna o custo da ferramenta.
     *
     * @return o custo da ferramenta
     */
    public float getCusto() {
        return custo;
    }

    /**
     * Define o custo da ferramenta.
     *
     * @param custo o novo custo da ferramenta
     */
    public void setCusto(float custo) {
        this.custo = custo;
    }

    /**
     * Retorna uma lista de todas as ferramentas cadastradas.
     *
     * @return uma lista de objetos Ferramenta
     */
    public ArrayList<Ferramenta> getMinhaLista() {
        return dao.getMinhalista();
    }

    /**
     * Insere uma nova ferramenta no banco de dados.
     *
     * @param nome o nome da ferramenta
     * @param marca a marca da ferramenta
     * @param custo o custo da ferramenta
     * @return true se a inserção for bem-sucedida
     */
    public boolean insertFerramentaBD(String nome, String marca, float custo) {
        int id = dao.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(id, nome, marca, custo);
        dao.insertFerramentaBD(objeto);
        return true;
    }

    /**
     * Deleta uma ferramenta do banco de dados.
     *
     * @param id O ID da ferramenta a ser deletada.
     * @return {@code true} se a operação foi bem-sucedida.
     */
    public boolean deleteFerramentaBD(int id) {
        dao.deleteFerramentaBD(id);
        return true;
    }

    /**
     * Atualiza os dados de uma ferramenta no banco de dados.
     *
     * @param id O ID da ferramenta a ser atualizada.
     * @param nome O novo nome da ferramenta.
     * @param marca A nova marca da ferramenta.
     * @param custo O novo custo da ferramenta.
     * @return {@code true} se a operação foi bem-sucedida.
     */
    public boolean updateFerramentaBD(int id, String nome, String marca, float custo) {
        Ferramenta objeto = new Ferramenta(id, nome, marca, custo);
        dao.updateFerramentaBD(objeto);
        return true;
    }

    /**
     * Verifica se uma ferramenta existe no banco de dados.
     *
     * @param id O ID da ferramenta a ser verificada.
     * @return {@code true} se a ferramenta existe, {@code false} caso
     * contrário.
     */
    public boolean verificaFerramenta(int id) {
        return dao.verificaFerramenta(id);
    }
}
