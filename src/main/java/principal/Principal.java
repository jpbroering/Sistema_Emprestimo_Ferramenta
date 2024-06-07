package principal;

import visao.FrmMenuInicial;

/**
 * Classe principal que inicia a aplicação.
 */
public class Principal {

    /**
     * Método principal que inicializa a janela do menu inicial.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        FrmMenuInicial janela = new FrmMenuInicial();
        janela.setVisible(true);
    }
}
