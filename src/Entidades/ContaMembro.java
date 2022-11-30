package Entidades;

import Enums.SexoEnum;

public class ContaMembro extends Membro {
    private int contaMembro;
    private double saldo;

    public ContaMembro(String nome, int idade, String cpf, SexoEnum sexo, int idMembro, int contaMembro, double saldo) {
        super(nome, idade, cpf, sexo, idMembro);
        this.contaMembro = contaMembro;
        this.saldo = saldo;
    }

    public ContaMembro(){}

    public int getContaMembro() {
        return contaMembro;
    }

    public void setContaMembro(int contaMembro) {
        this.contaMembro = contaMembro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
