package primeiroexemplo;
public class Banco {
    private String nome;
    public String cpf;
    public double saldo;
    public Banco (String novoNome, String novoCPF, double novoSaldo){
        this.nome = novoNome;
        this.cpf = novoCPF;
        this.saldo = novoSaldo;
    }

    public Banco (){
        this.nome = "Sem nome";
        this.cpf = "Sem CPF";
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNomeAtualizado) {
        this.nome = novoNomeAtualizado;
    }
}
