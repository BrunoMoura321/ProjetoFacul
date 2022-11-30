package Serviços;

import Entidades.Igreja;
import Entidades.Membro;
import InterfacesServiços.IntServiçoIgreja;
import Repositorios.RepositorioIgreja;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CadastrarIgreja implements IntServiçoIgreja {

    static RepositorioIgreja rj = new RepositorioIgreja();

    List<Igreja> igrejaList = new ArrayList<Igreja>();

    @Override
    public void cadastrar() {
        Igreja igreja = new Igreja();
        igreja.setNomeIgreja(JOptionPane.showInputDialog("Nome da igreja: "));
        igreja.setIdIgreja(Integer.parseInt(JOptionPane.showInputDialog("ID da igreja: ")));

        rj.salvar(igreja);
    }

    @Override
    public void excluirIgreja() {
        rj.excluirPorId(Integer.parseInt(JOptionPane.showInputDialog("ID: ")));
    }

    @Override
    public void alterar() {
        Igreja igreja = new Igreja();
        igreja.setNomeIgreja(JOptionPane.showInputDialog("Nome da igreja: "));
        igreja.setIdIgreja(Integer.parseInt(JOptionPane.showInputDialog("Id da igreja: ")));

        rj.alterar(igreja);
    }

    @Override
    public List<Igreja> listarIgreja() {
        igrejaList = rj.listarIgrejas();

        for (Igreja igreja : igrejaList){
            JOptionPane.showMessageDialog(null, "\nNome da igreja: " + igreja.getNomeIgreja() +
                    "\nID da igreja: " + igreja.getIdIgreja());
        }
        return igrejaList;
    }
}
