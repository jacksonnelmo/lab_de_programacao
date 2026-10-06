/**
 * Representa o registro de resumos de estudo de um estudante.
 *
 * @author Jackson Nelmo
 */
public class RegistroResumos {
    private Resumo[] resumos;
    private int cont;

    /**
     * Cria um registro de resumos.
     *
     * @param quantidade número de resumos que seram guardados
     */
    public RegistroResumos(int quantidade) {
        resumos = new Resumo[quantidade];
    }

    /**
     * Cadastra um novo resumo de estudo.
     *
     * @param tema título do resumo
     * @param resumo conteúdo do resumo
     */
    public void adiciona(String tema, String resumo) {
        resumos[cont] = new Resumo(tema, resumo);
        cont++;
    }

    /**
     * Retorna os resumos de estudo cadastrados.
     *
     * @return resumos cadastrados
     */
    public String[] pegaResumos() {
        String[] resultado = new String[cont];
        for (int i = 0; i < cont; i++) {
            resultado[i] = resumos[i].toString();
        }
        return resultado;
    }

    /**
     * Imprime os resumos de estudo cadastrados.
     *
     * @return resumos de estudo cadastrados.
     */
    public String imprimeResumos() {
        String concatenacao = "- " + cont + " resumo(s) cadastrado(s)\n";
        concatenacao += "- ";

        for (int i = 0; i < cont; i++) {
            if (i > 0) {
                concatenacao += " | ";
            }
            concatenacao += resumos[i].getTema();
        }
        return concatenacao;
    }

    /**
     * Retorna a quantidade de resumos cadastrados.
     *
     * @return quantidade de resumos
     */
    public int conta() {
        return cont;
    }

    /**
     * Verifica se existe um resumo cadastrado com o nome informado.
     *
     * @param tema nome do resumo a ser procurado
     * @return true se o resumo estiver cadastrado ou false caso contrário
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < cont; i++) {
            if (resumos[i].getTema().equals(tema)) return true;
            return false;
        }
        return false;
    }
}