class TestCase 
{
    protected int id;
    protected String nombre;
    protected String estado; 

    public TestCase(int id, String nombre, String estado) 
    {
        this.id = id;
        this.nombre = nombre;
        setEstado(estado);
    }

    public void setEstado(String estado) 
    {
        if (estado.equals("PASSED") || estado.equals("FAILED") || estado.equals("BLOCKED")) 
        {
            this.estado = estado;
        } 
        else 
        {
            System.out.println("Estado incorrecto. Debe ser PASSED, FAILED o BLOCKED.");
        }
    }

    public void mostrarDetalles() 
    {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Estado: " + estado);
    }
}

class PruebaAutomatizada extends TestCase 
{
    private String framework; 

    public PruebaAutomatizada(int id, String nombre, String estado, String framework) 
    {
        super(id, nombre, estado);
        this.framework = framework;
    }

    public void mostrarDetalles() 
    {
        super.mostrarDetalles();
        System.out.println("Framework: " + framework);
    }
}

public class Ejercicio7 
{
    public static void main(String[] args) 
    {
        
        TestCase pruebaManual = new TestCase(1, "Prueba de login", "PASSED");

        
        PruebaAutomatizada pruebaAuto = new PruebaAutomatizada(2, "Prueba de checkout", "FAILED", "Selenium");

     
        System.out.println("Detalles de la prueba manual:");
        pruebaManual.mostrarDetalles();

        System.out.println("\nDetalles de la prueba automatizada:");
        pruebaAuto.mostrarDetalles();
    }
}
