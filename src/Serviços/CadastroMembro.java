package Serviços;

import Entidades.Membro;
import Enums.SexoEnum;
import InterfacesServiços.IntServiçoMembro;
import Repositorios.RepositorioMembro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CadastroMembro implements IntServiçoMembro {
    static RepositorioMembro rp = new RepositorioMembro();
    List<Membro> list = new ArrayList<Membro>();
    @Override
    public void cadastrar() {
        Membro membro = new Membro();
        membro.setNome(JOptionPane.showInputDialog("Nome: "));
        membro.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
        membro.setCpf(JOptionPane.showInputDialog("CPF: "));
        membro.setSexo(SexoEnum.valueOf(JOptionPane.showInputDialog("SEXO: ")));
        membro.setIdMembro(Integer.parseInt(JOptionPane.showInputDialog("ID: ")));

        rp.salvar(membro);

    }
    @Override
    public List<Membro> listarMembros() {
        list = rp.listarMembros();

        for (Membro membro : list){
            JOptionPane.showMessageDialog(null,"\nNome: " + membro.getNome() +
                    "\nIdade: " + membro.getIdade() +
                    "\nCPF: " + membro.getCpf() +
                    "\nSexo: " + membro.getSexo() +
                    "\nID: " + membro.getIdMembro());
        }
        return list ;
    }

    @Override
    public void excluirMembro() {
        rp.excluirPorId(Integer.parseInt(JOptionPane.showInputDialog("ID: ")));
    }

    @Override
    public void alterar() {
        Membro membro = new Membro();
        membro.setNome(JOptionPane.showInputDialog("Nome: "));
        membro.setIdade(Integer.parseInt(JOptionPane.showInputDialog("IDade: ")));
        membro.setCpf(JOptionPane.showInputDialog("CPF: "));
        membro.setSexo(SexoEnum.valueOf(JOptionPane.showInputDialog("SEXO: ")));
        membro.setIdMembro(Integer.parseInt(JOptionPane.showInputDialog("ID: ")));

        rp.alterar(membro);
    }
}

