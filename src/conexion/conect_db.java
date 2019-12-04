
package conexion;
import java.sql.*;
import javax.swing.JOptionPane;
public class conect_db {
    
    private static Connection cnx = null;
    
    String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/sventas?autoReconnect=true&useSSL=true";
	String ip = "127.0.0.1";
	String bd = "sventas";
	String user = "root";
	String password = "foTiH8";
        
       public conect_db()
       {
           	try {
			Class.forName(driver).newInstance();
			cnx = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage()+" \n Error en la Red.");
		}
       }
       
       public Connection getConexion() {
		return cnx;
	}
	
	public Connection cerrarConexion() throws SQLException{
		cnx.close();
		cnx = null;
		return cnx;
	}
}
