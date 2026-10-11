import java.util.Arrays;
import java.util.Locale;

/**
 * Representa o registro de resumos de estudo de um estudante.
 *
 * @author Jackson Nelmo Bernardino de Sousa - 20260004340
 */
public class RegistroResumos {
    private final Resumo[] resumos;
    private final int quantidadeMaximaDeResumos;
    private int contadorDeResumos;
    private int contadorDeResumosSobrescrevidos;

    /**
     * Cria um registro de resumos.
     *
     * @param quantidade número de resumos que seram guardados
     */
    public RegistroResumos(int quantidade) {
        quantidadeMaximaDeResumos = quantidade;
        resumos = new Resumo[quantidadeMaximaDeResumos];
    }

    /**
     * Cadastra um novo resumo de estudo.
     * Se a quantidade máxima de resumos for atingida essa classe irá sobrescrever os resumos mais antigos.
     *
     * @param tema   título do resumo
     * @param resumo conteúdo do resumo
     */
    public void adiciona(String tema, String resumo) {
        if (!temResumo(tema)) {
            if (contadorDeResumos < quantidadeMaximaDeResumos) {
                resumos[contadorDeResumos] = new Resumo(tema, resumo);
                contadorDeResumos++;
            } else {
                if (contadorDeResumosSobrescrevidos < quantidadeMaximaDeResumos) {
                    contadorDeResumos = quantidadeMaximaDeResumos;
                    resumos[contadorDeResumosSobrescrevidos] = new Resumo(tema, resumo);
                    contadorDeResumosSobrescrevidos++;
                } else {
                    contadorDeResumosSobrescrevidos = 0;
                    resumos[contadorDeResumosSobrescrevidos] = new Resumo(tema, resumo);
                }
            }
        }
    }

    /**
     * Retorna os resumos de estudo cadastrados.
     *
     * @return resumos cadastrados
     */
    public String[] pegaResumos() {
        String[] resultado = new String[contadorDeResumos];
        for (int i = 0; i < contadorDeResumos; i++) {
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
        StringBuilder concatenacao = new StringBuilder("- " + contadorDeResumos + " resumo(s) cadastrado(s)\n");
        concatenacao.append("- ");

        for (int i = 0; i < contadorDeResumos; i++) {
            if (i > 0) {
                concatenacao.append(" | ");
            }
            concatenacao.append(resumos[i].getTema());
        }
        return concatenacao.toString();
    }

    /**
     * Retorna a quantidade de resumos cadastrados.
     *
     * @return quantidade de resumos
     */
    public int conta() {
        return contadorDeResumos;
    }

    /**
     * Verifica se existe um resumo cadastrado com o nome informado.
     *
     * @param tema tema do resumo a ser procurado
     * @return true se o resumo estiver cadastrado ou false caso contrário
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < contadorDeResumos; i++) {
            if (resumos[i].getTema().equals(tema)) return true;
        }
        return false;
    }

    /**
     * busca os temas dos resumos que possuem a chave de busca em seus conteúdos.
     *
     * @param chaveDeBusca palavra a ser procurada nos conteúdos dos resumos.
     */
    public void busca(String chaveDeBusca) {
        int contadorDaBusca = 0;
        for (int i = 0; i < contadorDeResumos; i++) {
            String conteudo = resumos[i].getConteudo();
            if (conteudo.toLowerCase(Locale.ROOT).contains(chaveDeBusca.toLowerCase(Locale.ROOT))) {
                contadorDaBusca++;
            }
        }
        String[] arrayBusca = new String[contadorDaBusca];
        for (int i = 0; i < contadorDeResumos; i++) {
            String conteudo = resumos[i].getConteudo();
            if (conteudo.toLowerCase(Locale.ROOT).contains(chaveDeBusca.toLowerCase(Locale.ROOT))) {
                arrayBusca[contadorDaBusca-1] = resumos[i].getTema();
                contadorDaBusca -= 1;
            }
        }
        Arrays.sort(arrayBusca);
        System.out.println(Arrays.toString(arrayBusca));
    }
}

