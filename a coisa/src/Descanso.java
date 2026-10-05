public class Descanso {
    private int horasDeDescanso;
    private int numeroDeSemanas;

    public void defineHorasDescanso(int horasDeDescanso) {
        this.horasDeDescanso = horasDeDescanso;
    }

    public void defineNumeroSemanas(int numeroDeSemanas) {
        this.numeroDeSemanas = numeroDeSemanas;
    }

    public String getStatusGeral() {
        numeroDeSemanas = (numeroDeSemanas == 0) ? 1 : numeroDeSemanas;
        if (horasDeDescanso / numeroDeSemanas >= 26) return "descansado";
        else return "cansado";
    }
}
