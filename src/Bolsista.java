public class Bolsista extends Aluno{
    //A classe Bolsista herda os atributos da classe Aluno.
    // Como Aluno já herda Pessoa, a classe Bolsista também herda todas as características da classe Pessoa.
    private float bolsa;

    public void renovarBolsar(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    // Temos um caso de sobrescrita, onde o método pagarMensalidade da classe atual sobrescreve o método da classe herdada (Aluno).
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento facilitado!");
    }

    public float getBolsa() {

        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
