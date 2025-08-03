public abstract class Pessoa {
    /*A classe Pessoa foi definida como abstrata.
    Isso significa que ela NÃO pode ser instanciada diretamente e serve APENAS como modelo para outras classes.
     */

    protected String nome, sexo;
    protected int idade;

    public void fazerAniversario(){
        this.idade++; // O mesmo que dizer "Idade recebe a Idade atual + 1"
    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
