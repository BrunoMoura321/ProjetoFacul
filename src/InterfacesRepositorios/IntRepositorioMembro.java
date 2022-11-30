package InterfacesRepositorios;

import Entidades.Membro;

import java.util.List;

public interface IntRepositorioMembro {
    public boolean salvar(Membro membro);
    public boolean alterar(Membro membro);
    public boolean excluirPorId(int id);
    public List<Membro> listarMembros();

}
