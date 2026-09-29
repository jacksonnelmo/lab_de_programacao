public class Aluno1 {
        private String nome;
        private int anoNascimento;
        private double cra;

        public Aluno1(String nome, int anoNascimento) {
            this.nome = nome;
            this.cra = 0.0;
            this.anoNascimento = anoNascimento;
        }

        public void setCra(double cra) {
            this.cra = cra;
        }

        public int getIdade() {
            return 2021 - anoNascimento;
        }

        public String toString() {
            return "Aluno - "  + this.nome;
        }

}
