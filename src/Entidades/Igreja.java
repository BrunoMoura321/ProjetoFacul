package Entidades;

public class Igreja {
    private String nomeIgreja;
    private int idIgreja;

    public Igreja(String nomeIgreja, int idIgreja) {
        this.nomeIgreja = nomeIgreja;
        this.idIgreja = idIgreja;
    }

    public Igreja(){}

    public String getNomeIgreja() {
        return nomeIgreja;
    }

    public void setNomeIgreja(String nomeIgreja) {
        this.nomeIgreja = nomeIgreja;
    }

    public int getIdIgreja() {
        return idIgreja;
    }

    public void setIdIgreja(int idIgreja) {
        this.idIgreja = idIgreja;
    }

}
