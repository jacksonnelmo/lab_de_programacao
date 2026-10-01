import java.util.Arrays;

public class controlarDisciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] arrayNotas = new double[4];
    private double media;
    private int quantidadeDeNotas;

    public controlarDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horasDeEstudo) {
        this.horasDeEstudo += horasDeEstudo;
    }

    public void cadastraNota(int notas, double valorNota) {
        arrayNotas[notas - 1] = valorNota;
    }

    public boolean aprovado() {
        for (double nota : arrayNotas) {
            media += nota;
        }
        media = media / 4;

        if media >= 7 return true;
        else return false;
    }

    public String toString() {
        return nomeDisciplina + quantidadeDeNotas + media + Arrays.toString(arrayNotas);
    }
}
