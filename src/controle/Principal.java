
package controle;

/**
 * 
 * @author GustavoWilker
 */

import metodos.Comentario;
import metodos.Tema;
import metodos.Usuario;
import view.ViewLogin;

import java.util.ArrayList; 
import java.util.Scanner;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;
import model.dao.UserDao;
import view.TelaCadastra;
import view.TelaLogin;

public class Principal {
   public static int verificacao=1;
   static int input;
    
    public static void main(String[] args) {

        ArrayList<Usuario> usuario = new ArrayList<Usuario>();
        ArrayList<Tema> tema = new ArrayList<Tema>();
        ArrayList<Comentario> comentario = new ArrayList<Comentario>();
        Scanner sc = new Scanner(System.in);
        UserDao dao = new UserDao();
             
        

        JOptionPane.showMessageDialog(null, "Bem vindo ao forum PUC Goias. Selecione uma das opções desejadas");
        
                        
                new TelaLogin().setVisible(true);
           
        if(verificacao == 2){
            
          do {

             JOptionPane.showMessageDialog(null,"Selecione uma das opções a seguir");;

            int input = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Pesquisar tema\n" +
                    "2 - Criar tema\n" +
                    "3 - Alterar tema\n" +
                    "4 - Criar comentario\n" +
                    "5 - Alterar comentario\n"+
                    "0 - Para encerrar o Programa"));

            switch (input){
                case 1:{
                    
                }
                case 2:{
                    
                }
                case 3:{
                    
                }
                case 4:{
                    
                }
                case 5:{
                    
                }
                case 0:{
                    JOptionPane.showMessageDialog(null, "Encerrando o programa");
                }
                break;
                default:{
                    JOptionPane.showMessageDialog(null, "Opção não existente");
                    
                }
                  
            



        }


    }while(input !=0);
        }
}

}
