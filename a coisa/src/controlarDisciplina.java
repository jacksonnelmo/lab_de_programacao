import java.util.Arrays;

/** * Representa uma disciplina e armazena informações sobre notas,
 * horas de estudo e situação acadêmica.
 * @author Jackson Nelmo Bernardino de Sousa - 20260004340
 */
public class controlarDisciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] arrayNotas;
    private double media;
    /** sem usos*/
    private int quantidadeDeNotas;

    /**
     * Cria uma disciplina com o nome informado.
     *
     * @param nomeDisciplina nome da disciplina.
     */
    public controlarDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        arrayNotas = new double[4];
    }

    /**
     * Cadastra uma quantidade de horas de estudo para a disciplina.
     *
     * @param horasDeEstudo quantidade de horas a ser cadastrada
     */
    public void cadastraHoras(int horasDeEstudo) {
        this.horasDeEstudo += horasDeEstudo;
    }

    /**
     * Cadastra uma nota para disciplina.
     *
     * @param notas notas obtidas nas avaliações
     * @param valorNota valor da nota
     */
    public void cadastraNota(int notas, double valorNota) {
        arrayNotas[notas - 1] = valorNota;
    }

    /**
     * Verifica se o estudante foi aprovado na disciplina.
     * If ṕode ser simplificado.
     * @return true se o estudante foi aprovado e false se não for aprovado
     */
    public boolean aprovado() {
        media = 0;
        for (double nota : arrayNotas) {
            media += nota;
        }
        media = media / 4;

        return media >= 7.0;
    }

    /**
     * Retorna uma representação textual da disciplina.
     *
     * @return representação textual da disciplina
     */

    @Override
    public String toString() {
        media = 0;
        for (double nota : arrayNotas) {
            media += nota;
        }
        media = media / 4;
        return nomeDisciplina + " " + horasDeEstudo + " " + media + " " + Arrays.toString(arrayNotas);
    }
}
