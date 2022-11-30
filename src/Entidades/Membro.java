package Entidades;

import Enums.SexoEnum;

public class Membro extends Pessoa{
    private int idMembro;

    public Membro(String nome, int idade, String cpf, SexoEnum sexo, int idMembro) {
        super(nome, idade, cpf, sexo);
        this.idMembro = idMembro;
    }

    public Membro() {
    }

    public int getIdMembro() {
        return idMembro;
    }

    public void setIdMembro(int idMembro) {
        this.idMembro = idMembro;
    }

}
