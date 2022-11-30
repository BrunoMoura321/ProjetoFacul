package Repositorios;

import Entidades.Membro;
import InterfacesRepositorios.IntRepositorioMembro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioMembro implements IntRepositorioMembro {

    List<Membro> listaMembros = new ArrayList<Membro>();

    @Override
    public boolean salvar(Membro membro) {
        try{
            listaMembros.add(membro);
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,"Não foi possivel realizar o cadastro ");
            return false;
        }
        JOptionPane.showMessageDialog(null,"Membro cadastrado com sucesso ");
        return true;
    }

    @Override
    public boolean alterar(Membro membro) {
        for(Membro membro1 : listaMembros){
            if (membro1.getIdMembro() == membro.getIdMembro()){
                listaMembros.remove(membro1);
                listaMembros.add(membro);
                JOptionPane.showMessageDialog(null,"Membro alterado com sucesso");
                break;
            }
        }

        return false;
    }

    @Override
    public boolean excluirPorId(int id) {
        for (Membro membro : listaMembros) {
            if (membro.getIdMembro() == id) {
                listaMembros.remove(membro);
                break;
            }
        }
        return false;
    }

    @Override
    public List<Membro> listarMembros() {
        return this.listaMembros;
    }
}
