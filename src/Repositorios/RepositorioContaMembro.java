package Repositorios;

import Entidades.ContaIgreja;
import Entidades.ContaMembro;
import InterfacesRepositorios.IntRepositorioContaMembro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioContaMembro implements IntRepositorioContaMembro {

    static ContaMembro contaMembro = new ContaMembro();

    List<ContaMembro> contaMembroList = new ArrayList<ContaMembro>();


    @Override
    public boolean cadastrarContaMembro(ContaMembro contaMembro) {
        try {
            contaMembroList.add(contaMembro);
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null, "Conta não cadastrada");
            return false;
        }
        JOptionPane.showMessageDialog(null,"Conta cadastrada com sucesso");
        return true;
    }

    @Override
    public boolean alterar(ContaMembro contaMembro) {
        for (ContaMembro contaMembro1 : contaMembroList){
            if (contaMembro1.getContaMembro() == contaMembro.getContaMembro()){
                contaMembroList.remove(contaMembro1);
                contaMembroList.add(contaMembro);
                JOptionPane.showMessageDialog(null,"Conta alterada com sucesso");
                break;
            }
        }

        return false;
    }

    @Override
    public boolean excluir(int idConta) {
        for (ContaMembro contaMembro1 : contaMembroList){
            if (contaMembro1.getContaMembro() == idConta){
                contaMembroList.remove(contaMembro1);
                JOptionPane.showMessageDialog(null,"Conta removida com sucesso");
            }
        }
        return false;
    }

    @Override
    public List<ContaMembro> listContaMembro() {
        return this.contaMembroList;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0 ){
            this.contaMembro.setSaldo(contaMembro.getSaldo() + valor);
        }
    }

    @Override
    public void transferir(ContaIgreja contaDepositoIgreja, double valor) {
        if (valor > 0 && contaMembro.getSaldo() >= valor ){
            contaMembro.setSaldo(contaMembro.getSaldo() - valor);
            contaDepositoIgreja.setSaldo(contaDepositoIgreja.getSaldo() + valor);
            JOptionPane.showMessageDialog(null,"Transferencia realizada com sucesso");
        }else {
            JOptionPane.showMessageDialog(null,"Impossivel realizar a transferencia ");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && contaMembro.getSaldo() >= valor){
            contaMembro.setSaldo(contaMembro.getSaldo() - valor);
            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso");
        }else {
            JOptionPane.showMessageDialog(null,"Impossivel realizar o saque");
        }
    }
}
