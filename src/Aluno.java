public class Aluno extends Pessoa{
    /*
     A classe Aluno herda os atributos da classe Pessoa. A herança é do tipo diferenciação,
     onde a classe mãe (Pessoa) serve mais como modelo genérico, e a filha (Aluno) adiciona
     características específicas.
    */

    private String curso;
    private int matricula;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome() + "!");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
