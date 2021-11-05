package controlador;

import java.awt.event;
import modelo.*;
import vista.*;
import dao.*;


public class ControladorUsuario implements ActionListener {
  public LoginForm vista;
  public UsuarioDAO daoUsuario;
  public Usuario usuario;
  
  public ControladorUsuario(LoginForm pVista, Usuario pUsuario) {
	vista=pVista;
	usuario=pUsuario;
	UsuarioDAO daoUsuario=new UsuarioDAOXML();
	
	this.vista.btIniciarLogin.addActionListener(this);
	this.vista.btCancelarLogin.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
	switch(e.getActionCommand()) {
	case "Iniciar logIn":
		logIn();
		break;
	case "Cancelar logIn":
		cerrarVentanaLogin();
		break;
	default:
		break;
	}
  }

  public void logIn() {
	if (vista.logInDatosCorrectos()==true) {
	  String nombreUsuario=vista.txtNombreUsuario.getText();
	  String contrasenna=vista.txtContrasena.getText();
	  
	  usuario=new Usuario(nombreUsuario,contrasenna);
	  Usuario usuarioActual=daoUsuario.iniciarSesion(usuario);
	  
	    if (usuarioActual!=null) {
	      vista.setVisible(false);
	      JOptionPane.showMessageDialog(vista, "Bienvenido: "+
	      usuario.getNombre());
	      vista.setVisible(true);
	    }
	    else {
	      JOptionPane.showMessageDialog(vista, "El usuario indicado no existe");
	    }
	else {
		JOptionPane.showMessageDialog(vista, "Todos los datos son requeridos");
		
	}
	}
	
	public void cerrarVentanaLogin() {
	  vista.cancelarInicioSesion();
	}
		  
  
 }
	
