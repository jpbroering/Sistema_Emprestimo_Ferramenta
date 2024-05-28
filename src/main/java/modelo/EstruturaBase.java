package modelo;

/**
 * Representa uma estrutura base com um identificador e um nome.
 */
public class EstruturaBase {

    private int id;
    private String nome;

    /**
     * Construtor padrão que inicializa um objeto EstruturaBase com ID zero e
     * nome vazio.
     */
    public EstruturaBase() {
        this(0, "");
    }

    /**
     * Construtor que inicializa um objeto EstruturaBase com os valores
     * fornecidos.
     *
     * @param id O identificador da estrutura.
     * @param nome O nome da estrutura.
     */
    public EstruturaBase(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /**
     * Obtém o identificador da estrutura.
     *
     * @return O identificador da estrutura.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador da estrutura.
     *
     * @param id O identificador a ser definido.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome da estrutura.
     *
     * @return O nome da estrutura.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da estrutura.
     *
     * @param nome O nome a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
