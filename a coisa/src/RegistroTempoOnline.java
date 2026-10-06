/**
 * Representa o registro de tempo online dedicado a uma disciplina.
 *
 * @author Jackson Nelmo
 */
public class RegistroTempoOnline {
    private String nomeDaDisciplina;
    private int tempoInvestidoOnline;
    private int tempoOnlineEsperado = 120;

    /**
     * Cria um registro de tempo online para a disciplina informada.
     * @param nomeDisciplina nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDaDisciplina = nomeDisciplina;
    }
    /**
     * Cria um registro de tempo online para a disciplina informada.
     * @param nomeDisciplina nome da disciplina
     * @param tempoOnlineEsperado tempo esperado online
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDaDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Adiciona uma quantidade de tempo ao registro de estudo.
     * @param tempoInvestidoOnline quantidade de tempo a ser adicionada
     */
    public void adicionaTempoOnline(int tempoInvestidoOnline) {
        this.tempoInvestidoOnline +=  tempoInvestidoOnline;
    }

    /**
     * Verifica se a meta de tempo online foi atingida.
     *
     * @returntrue se a meta foi atingida e false caso contrário
     */
    public boolean atingiuMetaTempoOnline() {
        if (tempoInvestidoOnline >= tempoOnlineEsperado) return true;
        else return false;
    }
    /**
     * Retorna uma representação textual do registro de tempo online.
     *
     * @return representação textual do registro
     */
    @Override
    public String toString() {
        return nomeDaDisciplina + " " +  tempoInvestidoOnline + "/" + tempoOnlineEsperado;
    }
}
