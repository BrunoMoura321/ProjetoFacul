package InterfacesRepositorios;

import Entidades.ContaIgreja;
import Entidades.ContaMembro;

import java.util.List;

public interface IntRepositorioContaMembro {

    public boolean cadastrarContaMembro(ContaMembro contaMembro);

    public boolean alterar(ContaMembro contaMembro);

    public boolean excluir(int idConta);

    public List<ContaMembro> listContaMembro();

    public void depositar(double valor);

    public void transferir(ContaIgreja contaDepositoIgreja, double valor);

    public void sacar(double valor);

}
