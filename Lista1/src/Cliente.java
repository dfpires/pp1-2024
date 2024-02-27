public class Cliente {
    public int nroConta, nroAgencia;
    public String nome;
    public float saldo;
    public Cliente(){

    }
    public Cliente(int nroConta, int nroAgencia, String nome, float saldo) {
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    public void depositar(float x){
        this.saldo += x;
    }
    public void sacar(float x){
        if (this.saldo - x >= 0){
            this.saldo -= x;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nroConta=" + this.nroConta +
                ", nroAgencia=" + this.nroAgencia +
                ", nome='" + this.nome + '\'' +
                ", saldo=" + this.saldo +
                '}';
    }
}
