
package controllers;

import java.awt.event.ActionListener;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.proveedor;
import modelo.ProveedorGestion;
import vistas.proveedores;

public class proveedorcontrollers implements ActionListener
{
//instancias
    modelo.proveedor prov = new modelo.proveedor();
    vistas.proveedores vprov = new vistas.proveedores();
    modelo.ProveedorGestion provg = new modelo.ProveedorGestion();
    DefaultTableModel model = new DefaultTableModel();
    
    public proveedorcontrollers(proveedores p)
    {
     this.vprov = p;
     this.vprov.btnlist.addActionListener(this); //me tira error en el btnlist (dice que no esta public, y esta definido public
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public void listprov (JTable table)
    {
        model =(DefaultTableModel)table.getModel();
        List<proveedor> listar = prov.listprov();//me tira error en listprov
    }
}
