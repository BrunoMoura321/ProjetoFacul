package InterfacesServiÃ§os;

import Entidades.ContaMembro;
import Entidades.Membro;

import java.util.List;

public interface IntServiÃ§oContaMembro {
    public void cadastrar();
    public void excluirContaMembro();
    public void alterarContaMembro();
    public List<ContaMembro> listarMembros();
    public void depositar();
    public void sacar();
    public void transferir();
}
