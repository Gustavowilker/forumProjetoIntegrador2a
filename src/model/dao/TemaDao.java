
package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metodos.Tema;
import metodos.Usuario;


public class TemaDao {
   
    public void create(Tema a){
        
        
        Usuario b = new Usuario();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO theme_topics (id_user,id_form,comments_id_comments)VALUES(?,?,?)");
            stmt.setInt(1, b.getId_user());
            stmt.setString(2, a.getId_form());
            stmt.setString(3, a.getComentario());
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" +ex);
        }finally{
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
        
    }
    
    public  boolean checkTema(int id_form){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        boolean check = false;
       
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM theme_topics WHERE id_form = ?");
            stmt.setInt(1, id_form);
           
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
    


