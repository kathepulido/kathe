/*
CONSTRUCTORES:

A partir de los atributos (Variables), se definen cuales deben ser solicitados en el momento
de crear el objeto. Se pueden definir varios constructores (Sobrecarga de constructores)
que permitan crear el objeto de diferentes maneras.


Un constructor en pocas palabras es un método de la clase con el mismo nombre de esta,
con las variables que se van a solicitar en la creación del objeto.  Es decir que
cuando se crea el objeto se instancia al mismo tiempo este método.


VISIBILIDAD ENTRE OBJETOS:

EN JAVA se usan las palabras reservadas public, private y protected, con el fin de permitir 
la visibilidad de los atributos y métodos entre objetos:

public -> Define una visibilidad pública entre objetos desde cualquier clase dentro de la aplicación.

private -> Es contrario a public el cual solo permite ser visible desde la propia clase que la
contiene.

protected -> Define una visibilidad pública entre objetos desde cualquier clase dentro del mismo.
paquete.

Ejemplo:

Para el caso de la clase Estudiante vamos a definirle dos constructores:
 */
package Semana2;

/**
 *
 * @author miguelangelperezvillamizar
 */

public class Estudiante {
    
    public String nombre;
    private float nota1, nota2, definitiva=0; // solo es visible dentro de esta clase
    
    public Estudiante(String nom)  // Constructor 1: Se le asigna un valor al atributo nombre cuando se cree el objeto.
    {
        this.nombre = nom;
    }
    
    public Estudiante(String nom, float n1, float n2) // Constructor 2 (Sobrecarga de Constructores)
    {
        this.nombre = nom;
        this.nota1 = n1;
        this.nota2 = n2;
    }  

/*    
    En la sesión anterior no teniamos un constructor por lo que creamos el método datosEstudiante
    para asignarle valores al atributo nombre.
 */ 
    
    protected void datosEstudiante(String nom)  
    {
        this.nombre = nom;
    }
   
    public void notasParciales(float n1, float n2)
    {
        nota1 = n1;
        nota2 = n2;
    }
    
    public float calcularDefinitva()
    {
        definitiva = (nota1+nota2)/2;
        return definitiva;
    }
    
    public String imprimirMensaje()
    {
        if(definitiva >= 3)
        {
            return "APROBADO";
        }
        else
        {
            return "REPROBADO";
        }
        
    }
    
}
