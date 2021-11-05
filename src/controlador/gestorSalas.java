 package controlador;
import vista.*;
import controlador.*;
import modelo.*;

public class gestorSalas {

	public static void main(String[]args) {
	  loginForm vista=new LoginForm();
	  Usuario usuario= new Usuario();
	  
	  ControladorUsuario controladorUsuario=new ControladorUsuario(vista, usuario);
	  controladorUsuario.vista.setVisible(true);
	  controladorUsuario.vista.setLocationRelativeTo(null);
	}
}
