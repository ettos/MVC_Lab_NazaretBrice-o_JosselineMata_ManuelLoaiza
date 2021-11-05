package modelo;

/**
 * Clase que simula un usuario
 * @author Josseline, Nazaret
 *
 */
public class Usuario {
  private String nombre;
  private String contrasenna;
 
  /**
   * M�todo constructor de la clase
   * @param pNombre que es el nombre del usuario
   * @param pContrasenna que es la contrase�a del usuario
   */
  public Usuario(String pNombre, String pContrasenna) {
	nombre=pNombre;
	contrasenna=pContrasenna;
  }
  
  /**
   * M�todo para indicar el nombre del usuario
   * @param pNombre que es el nombre del usuario
   */
  public void setNombre(String pNombre) {
	nombre=pNombre;
  }
  
  /**
   * M�todo para obtener el valor del nombre del usuario
   * @return el nombre del usuario
   */
  public String getNombre() {
	return nombre;
  }
  
  /**
   * M�todo para indicar el valor de la contrase�a del usuario  
   * @param pContrasenna que es la contrase�a del usuario
   */
  public void setContrasenna(String pContrasenna) {
	contrasenna=pContrasenna;
  }
  
  /**
   * M�todo para obtener el valor de la contrase�a del usuario
   * @return la contrase�a del usuario
   */
  public String getContrasenna() {
	return contrasenna;
  }
}
