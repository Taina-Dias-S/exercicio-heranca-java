
public class Main {
    public static void main(String[] args) {

        // Se tentarmos instanciar Pessoa p = new Pessoa(); a IDEA não permitirá, pois a classe Pessoa é abstrata.

        Visitante p = new Visitante();
        p.setIdade(12);
        p.setNome("Guilherme Pereira");
        p.setSexo("M");
        System.out.println(p.toString());

         Aluno a1 = new Aluno();
         a1.setNome("Matheus Martins");
         a1.setMatricula(111);
         a1.setCurso("Informática");
         a1.setIdade(20);
         a1.setSexo("M");
         a1.pagarMensalidade();

         Bolsista b1 = new Bolsista();
         b1.setMatricula(112);
         b1.setNome("Antony Lopes dos Santos");
         b1.setIdade(24);
         b1.setCurso("Inglês");
         b1.setBolsa(12.5f);
         b1.setSexo("M");
         b1.pagarMensalidade(); // Como se trata de um aluno bolsista, o método pagarMensalidade é sobrescrito e possui comportamento diferente.

    }
}
