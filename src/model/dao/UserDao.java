
package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metodos.Usuario;


public class UserDao {
   
    public void create(Usuario a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO user (id_user,username,email,password)VALUES(?,?,?,?)");
            stmt.setInt(1, a.getId_user());
            stmt.setString(2, a.getUsu_nome());
            stmt.setString(3, a.getUsu_email());
            stmt.setString(4, a.getUsu_senha());
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" +ex);
        }finally{
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
        
    }
    
    public  boolean checkLogin(int id_user,String usu_senha){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        boolean check = false;
       
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM user WHERE id_user = ? and password = ?");
            stmt.setInt(1, id_user);
            stmt.setString(2, usu_senha);
            rs = stmt.executeQuery();
            
            
            if(rs.next()){
               
               check = true;
                
            }
         
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt, rs);
        }
        
       return check; 
    }
       
        
    }
    

