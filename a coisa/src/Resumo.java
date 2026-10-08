/**
 * Representa um resumo de estudo, contendo um tema e seu conteúdo.
 *
 * @author Jackson Nelmo Bernardino de Sousa - 20260004340
 */
public class Resumo {
    private final String tema;
    private final String conteudo;

    /**
     * Cria um resumo com o tema e o conteúdo informados.
     *
     * @param tema tema do resumo
     * @param conteudo conteúdo do resumo
     */
    public Resumo (String tema, String conteudo) {
    this.tema = tema;
    this.conteudo = conteudo;
    }

    /**
     * Retorna uma representação textual do resumo.
     *
     * @return tema e conteúdo do resumo
     */
    @Override
    public String toString() {
        return tema + ": " + conteudo;
    }

    /**
     * Retorna o tema do resumo.
     *
     * @return tema do resumo
     */
    public String getTema() {
        return tema;
    }

    public String getConteudo() {return conteudo;}
}
