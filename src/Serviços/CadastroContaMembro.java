package Serviços;

import Entidades.ContaMembro;
import Enums.SexoEnum;
import InterfacesServiços.IntServiçoContaMembro;
import Menu.Menu;
import Repositorios.RepositorioContaMembro;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CadastroContaMembro implements IntServiçoContaMembro  {

    static RepositorioContaMembro repositorioContaMembro = new RepositorioContaMembro();

    static ContaMembro contaMembro = new ContaMembro();

    static Menu menu = new Menu();
    static List<ContaMembro> contaMembroList = new ArrayList<ContaMembro>();

    @Override
    public void cadastrar() {
        ContaMembro contaMembro = new ContaMembro();
        contaMembro.setNome(JOptionPane.showInputDialog("Nome: "));
        contaMembro.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
        contaMembro.setCpf(JOptionPane.showInputDialog("CPF: "));
        contaMembro.setSexo(SexoEnum.valueOf(JOptionPane.showInputDialog("Sexo: ")));
        contaMembro.setContaMembro(Integer.parseInt(JOptionPane.showInputDialog("Numero da conta: ")));

        repositorioContaMembro.cadastrarContaMembro(contaMembro);
    }

    @Override
    public void excluirContaMembro() {
        repositorioContaMembro.excluir(Integer.parseInt(JOptionPane.showInputDialog("Numero da conta: ")));
    }

    @Override
    public void alterarContaMembro() {
        ContaMembro contaMembro = new ContaMembro();
        contaMembro.setNome(JOptionPane.showInputDialog("Nome: "));
        contaMembro.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
        contaMembro.setCpf(JOptionPane.showInputDialog("CPF: "));
        contaMembro.setSexo(SexoEnum.valueOf(JOptionPane.showInputDialog("Sexo: ")));
        contaMembro.setContaMembro(Integer.parseInt(JOptionPane.showInputDialog("Numero da conta: ")));

        repositorioContaMembro.alterar(contaMembro);
    }

    @Override
    public List<ContaMembro> listarMembros() {
        contaMembroList = repositorioContaMembro.listContaMembro();
        for (ContaMembro contaMembro : contaMembroList){
            JOptionPane.showMessageDialog(null,"\nNome: " + contaMembro.getNome() +
                    "\nIdade: " + contaMembro.getIdade() +
                    "\nCPF: " + contaMembro.getCpf() +
                    "\nSexo: " + contaMembro.getSexo() +
                    "\nNumero da conta: " + contaMembro.getContaMembro() +
                    "\nSaldo: " + contaMembro.getSaldo());
        }
        return contaMembroList;
    }

    public static ContaMembro encontrarConta(int numeroDaConta){

        ContaMembro contaMembro = null;

        if (contaMembroList.size() > 0 ){
            for (ContaMembro c : contaMembroList){
                if (c.getContaMembro() == numeroDaConta){
                    contaMembro = c;
                    JOptionPane.showMessageDialog(null,"conta encontrada");
                }else {
                    JOptionPane.showMessageDialog(null,"Conta não encontrada");
                    menu.menu();
                }
            }

        }
        return contaMembro;
    }

    @Override
    public void depositar() {
        int numeroDaConta =
                Integer.parseInt(JOptionPane.showInputDialog("Numero da conta: "));

        ContaMembro cadastroContaMembro = encontrarConta(numeroDaConta);

        if (cadastroContaMembro != null){
            double valorDeposito =
                    Double.parseDouble(JOptionPane.showInputDialog("Valor para depositar: "));
            repositorioContaMembro.depositar(valorDeposito);
            JOptionPane.showMessageDialog(null,"valor depositado com sucesso");
        }else {
            JOptionPane.showMessageDialog(null,"Não foi possivel realizar seu deposito");
        }

    }

    @Override
    public void sacar() {

    }

    @Override
    public void transferir() {

    }



}
