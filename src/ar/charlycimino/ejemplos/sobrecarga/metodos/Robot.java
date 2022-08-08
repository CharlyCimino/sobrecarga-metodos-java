package ar.charlycimino.ejemplos.sobrecarga.metodos;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Robot {

    private String nombre;

    public Robot(String nombre) {
        setNombre(nombre);
    }

    private void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public void saludar(String nombrePersona) {
        System.out.println("Hola " + nombrePersona + ", soy " + nombre);
    }

    public void saludar() {
        saludar("extraño");
    }

}
