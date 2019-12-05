
package modelo;
import java.sql.*;
public class Conexion
{
    Connection con;
    public Connection getConnection()
    {
        String url ="jdbc.mysql://localhost:3306/sventas";
        String user ="root";
        String pass ="foTiH8";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        }catch(Exception e)
        {
            
        }
        return con;
    }
}
