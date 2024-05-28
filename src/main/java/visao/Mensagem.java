package visao;

/**
 * A classe Mensagem representa uma exceção customizada que pode ser lançada
 * para representar erros relacionados a mensagens.
 */
public class Mensagem extends Exception {

    /**
     * Construtor da classe Mensagem.
     *
     * @param msg a mensagem que descreve a exceção
     */
    Mensagem(String msg) {
        super(msg);
    }
}
