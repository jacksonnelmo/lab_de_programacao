public class Coisa {
    public static void main(String[] args) {
        registrarDescanso();
        System.out.println("-----");
        registrarTempoOnline();
        System.out.println("-----");
        controlarDisciplina();
        System.out.println("-----");
        registrarResumos();
        System.out.println("-----");
        novasFuncoes();
    }

    public static void registrarDescanso() {
        Descanso descanso = new Descanso();
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(30);
        descanso.defineNumeroSemanas(1);
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(26);
        descanso.defineNumeroSemanas(2);
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(26);
        descanso.defineNumeroSemanas(1);
        System.out.println(descanso.getStatusGeral());
    }

    private static void registrarTempoOnline() {
        RegistroTempoOnline tempoLP2 = new RegistroTempoOnline("LP2", 30);
        tempoLP2.adicionaTempoOnline(10);
        System.out.println(tempoLP2.atingiuMetaTempoOnline());
        tempoLP2.adicionaTempoOnline(10);
        tempoLP2.adicionaTempoOnline(10);
        System.out.println(tempoLP2.atingiuMetaTempoOnline());
        tempoLP2.adicionaTempoOnline(2);
        System.out.println(tempoLP2.atingiuMetaTempoOnline());
        System.out.println(tempoLP2.toString());
        RegistroTempoOnline tempoP2 = new RegistroTempoOnline("P2");
        System.out.println(tempoP2.toString());
    }

    private static void controlarDisciplina() {
        controlarDisciplina prog2 = new controlarDisciplina("PROGRAMACAO 2");
        prog2.cadastraHoras(4);
        prog2.cadastraNota(1, 5.0);
        prog2.cadastraNota(2, 6.0);
        prog2.cadastraNota(3, 7.0);
        System.out.println(prog2.aprovado());
        prog2.cadastraNota(4, 10.0);
        System.out.println(prog2.aprovado());
        System.out.println(prog2.toString());
    }

    private static void registrarResumos() {
        RegistroResumos meusResumos = new RegistroResumos(100);  // 100 resumos

        meusResumos.adiciona("Classes", "Classes definem um tipo e a base de código para criação de objetos.");
        meusResumos.adiciona("Tipo", "Identifica a semântica (operações e significados) de um conjunto de dados.");


        String[] resumos = meusResumos.pegaResumos();


        for (int i = 0; i < meusResumos.conta(); i++) {
            System.out.println(resumos[i]);
        }


        System.out.println();
        System.out.println("Resumos: ");
        System.out.println(meusResumos.imprimeResumos());
        System.out.println(meusResumos.temResumo("Classes"));
        System.out.println(meusResumos.temResumo("Objetos"));
    }
    private static void novasFuncoes() {
        RegistroResumos meusResumos = new RegistroResumos(1);  // 100 resumos

        meusResumos.adiciona("d", "Classes definem um tipo e a base de código para criação de objetos.");
        meusResumos.adiciona("a", "Identifica a semântica (operações e significados) de um conjunto de dados.");
        meusResumos.adiciona("c", "Classes definem um tipo e a base de código para criação de objetos.");
        meusResumos.adiciona("z", "Classes definem um tipo e a base de código para criação de objetos.");

        String[] resumos = meusResumos.pegaResumos();


        for (int i = 0; i < meusResumos.conta(); i++) {
            System.out.println(resumos[i]);
        }


        System.out.println();
        System.out.println("Resumos: ");
        System.out.println(meusResumos.imprimeResumos());
        System.out.println(meusResumos.temResumo("um"));
        System.out.println(meusResumos.temResumo("Objetos"));
        meusResumos.busca("");

        System.out.println("----------------------------------------");
        controlarDisciplina prog2 = new controlarDisciplina("PROGRAMACAO 2", 2, new double[]{2});
        prog2.cadastraHoras(10);
        prog2.cadastraNota(1, 5.0);
        prog2.cadastraNota(1, 6.0);
        prog2.cadastraNota(1, 7.0);
        System.out.println(prog2.aprovado());
        prog2.cadastraNota(1, 10.0);
        System.out.println(prog2.aprovado());
        prog2.cadastraHoras(6);
        System.out.println(prog2.toString());

    }
}
