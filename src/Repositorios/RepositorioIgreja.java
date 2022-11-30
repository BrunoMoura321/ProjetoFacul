package Repositorios;

import Entidades.Igreja;
import Entidades.Membro;
import InterfacesRepositorios.IntRepositorioIgreja;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioIgreja implements IntRepositorioIgreja {

    List<Igreja> listIgreja = new ArrayList<Igreja>();

    @Override
    public boolean salvar(Igreja igreja) {
        try {
            listIgreja.add(igreja);
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,"Igreja não cadastrada");
            return false;
        }
        JOptionPane.showMessageDialog(null, "Igreja cadastrada com sucesso ");
        return true;
    }

    @Override
    public boolean alterar(Igreja igreja) {
        for (Igreja igreja1 : listIgreja){
            if (igreja1.getIdIgreja() == igreja.getIdIgreja()){
                listIgreja.remove(igreja1);
                listIgreja.add(igreja);
                JOptionPane.showMessageDialog(null,"Igreja alterada com sucesso");
                break;
            }
        }

        return false;
    }

    @Override
    public boolean excluirPorId(int id) {
        for (Igreja igreja : listIgreja){
            if (igreja.getIdIgreja() == id){
                listIgreja.remove(igreja);
                JOptionPane.showMessageDialog(null,"Igreja removida com sucesso");
            }
        }

        return false;
    }

    @Override
    public List<Igreja> listarIgrejas() {
        return this.listIgreja;
    }
}
