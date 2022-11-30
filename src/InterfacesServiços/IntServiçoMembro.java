package InterfacesServiços;

import Entidades.Membro;

import java.util.List;

public interface IntServiçoMembro {
    public void cadastrar();
    public void excluirMembro();
    public void alterar();
    public List<Membro> listarMembros();
}
