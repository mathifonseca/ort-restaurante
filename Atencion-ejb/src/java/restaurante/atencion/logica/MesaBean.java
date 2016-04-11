package restaurante.atencion.logica;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import restaurante.atencion.dominio.Cliente;
import restaurante.atencion.dominio.Mesa;

@Singleton
@LocalBean
public class MesaBean {
    
    private List<Mesa> mesas;
    
    public Mesa crearMesa(int numero) {
        if (mesas == null) {
            mesas = new ArrayList<>();
        }
        Mesa m = new Mesa(numero);
        mesas.add(m);
        return m;
    }
    
    public Mesa getMesa(int numero) {
        return null;
    }
    
    public boolean asociarCliente(Mesa mesa, Cliente cliente) {
        return true;
    }
    
    public boolean liberarMesa(Mesa mesa) {
        return true;
    }
    
    public List<Mesa> getMesasLibres() {
        List<Mesa> libres = new ArrayList<>();
        for (Mesa m : mesas) {
            if (m.getCliente() == null) {
                libres.add(m);
            }
        }
        return libres;
    }

}
