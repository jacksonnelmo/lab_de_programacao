import java.util.Arrays;
//falta fazer os javadocadawd
public class controlarDisciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] arrayNotas;
    private double media;
    private int quantidadeDeNotas;

    public controlarDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        arrayNotas = new double[4];
    }

    public void cadastraHoras(int horasDeEstudo) {
        this.horasDeEstudo += horasDeEstudo;
    }

    public void cadastraNota(int notas, double valorNota) {
        arrayNotas[notas - 1] = valorNota;
    }

    public boolean aprovado() {
        media = 0;
        for (double nota : arrayNotas) {
            media += nota;
        }
        media = media / 4;

        if (media >= 7.0) return true;
        else return false;
    }

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
