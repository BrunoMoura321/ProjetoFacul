package InterfacesServiços;

import Entidades.Igreja;
import Entidades.Membro;

import java.util.List;

public interface IntServiçoIgreja {
    public void cadastrar();

    public void excluirIgreja();

    public void alterar();

    public List<Igreja> listarIgreja();
}
