package restaurante.atencion.logica;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import restaurante.atencion.dominio.Cliente;
import restaurante.atencion.dominio.Mesa;

@Stateless
@LocalBean
public class ClienteBean {
    
    @EJB
    MesaBean mesaBean;
    
    @EJB
    MozoBean mozoBean;
    
    public Mesa buscarMesa() {
        List<Mesa> libres = mesaBean.getMesasLibres();
        Mesa elegida = libres.get(0);
        mesaBean.asociarCliente(elegida, new Cliente("Cliente1"));
        return elegida;
    }
    
}
