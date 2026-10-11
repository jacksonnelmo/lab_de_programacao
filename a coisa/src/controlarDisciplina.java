import java.util.Arrays;

/** * Representa uma disciplina e armazena informações sobre notas,
 * horas de estudo e situação acadêmica.
 * @author Jackson Nelmo Bernardino de Sousa - 20260004340
 */
public class controlarDisciplina {
    private final String nomeDisciplina;
    private int horasDeEstudo;
    private final double[] arrayNotas;
    private final int numeroDeNotas;
    private final double[] arrayPeso;

    /**
     * Cria uma disciplina com o nome informado.
     *
     * @param nomeDisciplina nome da disciplina.
     */
    public controlarDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        numeroDeNotas = 4;
        arrayNotas = new double[numeroDeNotas];
        arrayPeso = new double[]{1};
    }

    /**
     * Cria uma disciplina com o nome e o número de notas informados.
     *
     * @param nomeDisciplina nome da disciplina.
     * @param numeroDeNotas número de notas da diciplina.
     */
    public controlarDisciplina(String nomeDisciplina, int numeroDeNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroDeNotas = numeroDeNotas;
        arrayNotas = new double[numeroDeNotas];
        arrayPeso = new double[]{1};
    }

    /**
     * Cria uma disciplina com o nome da disciplina, o número de notas da disciplina e os respectivos pesos das notas.
     *
     * @param nomeDisciplina nome da disciplina.
     * @param numeroDeNotas número de notas da disciplina.
     * @param arrayPeso ordem e pesos das notas.
     */
    public controlarDisciplina(String nomeDisciplina, int numeroDeNotas, double[] arrayPeso) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroDeNotas = numeroDeNotas;
        arrayNotas = new double[numeroDeNotas];
        this.arrayPeso = arrayPeso;
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
     * @param nota      nota obtida na determinada avaliação.
     * @param valorNota valor da nota
     */
    public void cadastraNota(int nota, double valorNota) {
        arrayNotas[nota - 1] = valorNota;
    }

    /**
     * Verifica se o estudante foi aprovado na disciplina.
     *
     * @return true se o estudante foi aprovado e false se não for aprovado
     */
    public boolean aprovado() {
        double media = media(this.arrayNotas, this.arrayPeso, this.numeroDeNotas);
        return media >= 7.0;
    }

    /**
     * Retorna uma representação textual da disciplina.
     *
     * @return representação textual da disciplina
     */
    @Override
    public String toString() {
        double media = media(this.arrayNotas, this.arrayPeso, this.numeroDeNotas);
        return nomeDisciplina + " " + horasDeEstudo + " " + media + " " + Arrays.toString(arrayNotas);
    }

    /**
     * Calcula a média das notas.
     *
     * @param arrayNotas um array de notas.
     * @param arrayPeso um array de pesos.
     * @param numeroDeNotas quantidade de notas cadastradas.
     * @return media das notas.
     */
    public double media(double[] arrayNotas, double[] arrayPeso, int numeroDeNotas) {
        double media = 0;
        if (Arrays.equals(arrayPeso, new double[]{1})) {
            media = 0;
            for (double nota : arrayNotas) {
                media += nota;
            }
            media = media / numeroDeNotas;
        } else {
            if (arrayNotas.length == arrayPeso.length) {
            double somadorDePesos = 0;
            media = 0;
            for (int i = 0; i < numeroDeNotas; i++) {
                media += arrayNotas[i] * arrayPeso[i];
                somadorDePesos += arrayPeso[i];
            }
            media = media / somadorDePesos;
        }}
        return media;
    }
}
