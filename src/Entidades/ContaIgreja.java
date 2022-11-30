package Entidades;

public class ContaIgreja {
    private int contaIgreja;
    private Igreja igreja;
    private double saldo;

    public ContaIgreja(int contaIgreja, Igreja igreja, double saldo) {
        this.contaIgreja = contaIgreja;
        this.igreja = igreja;
        this.saldo = 0.0;
    }

    public int getContaIgreja() {
        return contaIgreja;
    }

    public void setContaIgreja(int contaIgreja) {
        this.contaIgreja = contaIgreja;
    }

    public Igreja getIgreja() {
        return igreja;
    }

    public void setIgreja(Igreja igreja) {
        this.igreja = igreja;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaIgreja{" +
                "contaIgreja=" + contaIgreja +
                ", igreja=" + igreja +
                ", saldo=" + saldo +
                '}';
    }
}
