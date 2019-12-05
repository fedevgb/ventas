package modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProveedorGestion {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List provlist()
    {
        List<proveedor> datos = new ArrayList<>();
        String sql = "Select * from proveedor";
        try{
            con = conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while (rs.next())
            {
                proveedor prov = new proveedor();
                prov.setID(rs.getLong(0));
                prov.setNombre(rs.getString(1));
                prov.setTelefono(rs.getString(2));
                prov.setDireccion(rs.getString(3));
                prov.setEmail(rs.getString(4));
                
                datos.add(prov);
            
            }
        }catch(Exception e)
        {
            
        }
        return datos;
    }
}
