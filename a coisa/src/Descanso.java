/**
 * Representa o controle de descanso de um estudante,
 * considerando a quantidade de horas de descanso e
 * a quantidade de semanas informada.
 * @author Jackson Nelmo Bernardino de Sousa - 20260004340
 */
public class Descanso {
    private int horasDeDescanso;
    private int numeroDeSemanas;

    /**
     * Cria um registro de descanso com os valores iniciais.
     *
     * @param horasDeDescanso horas de descanso
     */
    public void defineHorasDescanso(int horasDeDescanso) {
        this.horasDeDescanso = horasDeDescanso;
    }

    /**
     * Define a quantidade de semanas consideradas.
     *
     * @param numeroDeSemanas numero de semanas
     */
    public void defineNumeroSemanas(int numeroDeSemanas) {
        this.numeroDeSemanas = numeroDeSemanas;
    }

    /**
     * Verifica se o estudante está suficientemente descansado.
     *
     * @return true se estiver suficientemente descansado
     * e false caso contrário
     */
    public String getStatusGeral() {
        numeroDeSemanas = (numeroDeSemanas == 0) ? 1 : numeroDeSemanas;
        if (horasDeDescanso / numeroDeSemanas >= 26) return "descansado";
        else return "cansado";
    }
}
