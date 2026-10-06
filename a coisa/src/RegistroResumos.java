public class RegistroResumos {
    private Resumo[] resumos;
    private int cont;

    public RegistroResumos(int quantidade) {
        resumos = new Resumo[quantidade];
    }

    public void adiciona(String tema, String resumo) {
        resumos[cont] = new Resumo(tema, resumo);
        cont++;
    }

    public String[] pegaResumos() {
        String[] resultado = new String[cont];
        for (int i = 0; i < cont; i++) {
            resultado[i] = resumos[i].toString();
        }
        return resultado;
    }

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

    public int conta() {
        return cont;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < cont; i++) {
            if (resumos[i].getTema().equals(tema)) return true;
            return false;
        }
        return false;
    }
}