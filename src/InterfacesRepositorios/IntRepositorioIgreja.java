package InterfacesRepositorios;

import Entidades.Igreja;
import Entidades.Membro;

import java.util.List;

public interface IntRepositorioIgreja {
    public boolean salvar(Igreja igreja);
    public boolean alterar(Igreja igreja);
    public boolean excluirPorId(int id);
    public List<Igreja> listarIgrejas();

}
