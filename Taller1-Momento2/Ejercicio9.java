abstract class CasoDePrueba 
{
    protected String nombre;

    public CasoDePrueba(String nombre)
     {
        this.nombre = nombre;
    }

    public abstract void ejecutarPrueba();
}

class PruebaManual extends CasoDePrueba 
{
    public PruebaManual(String nombre) 
    {
        super(nombre);
    }

    @Override
    public void ejecutarPrueba() 
    {
        System.out.println("Prueba manual: " + nombre);
    }
}

class PruebaAutomatizada extends CasoDePrueba
 {
    public PruebaAutomatizada(String nombre) 
    {
        super(nombre);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Ejecutando prueba automatizada con Selenium: " + nombre);
    }
}

public class Ejercicio9 {
    public static void main(String[] args) 
    {
       
        CasoDePrueba prueba1 = new PruebaManual("Prueba de Login");
        CasoDePrueba prueba2 = new PruebaAutomatizada("Prueba de Checkout");
        prueba1.ejecutarPrueba();
        prueba2.ejecutarPrueba();
    }
}
