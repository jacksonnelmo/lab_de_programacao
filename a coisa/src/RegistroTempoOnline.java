public class RegistroTempoOnline {
    private String nomeDaDisciplina;
    private int tempoInvestidoOnline;
    private int tempoOnlineEsperado = 120;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDaDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDaDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempoInvestidoOnline) {
        this.tempoInvestidoOnline +=  tempoInvestidoOnline;
    }

    public boolean atingiuMetaTempoOnline() {
        if tempoInvestidoOnline >= tempoOnlineEsperado return true;
        else return false;
    }

    public String ToString() {
        return nomeDaDisciplina + tempoInvestidoOnline + "/" + tempoOnlineEsperado;
    }
}
