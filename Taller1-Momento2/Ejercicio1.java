class TestCase 
{
    private int id;
    private String nombre;
    private String estado; 

    public TestCase(int id, String nombre, String estado) 
    {
        this.id = id;
        this.nombre = nombre;
        setEstado(estado); 
    }

    public int getId() 
    {
        return id;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getEstado() 
    {
        return estado;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setEstado(String estado) 
    {
        if (estado.equals("PASSED") || estado.equals("FAILED") || estado.equals("BLOCKED")) 
        {
            this.estado = estado;
        } 
        else 
        {
            System.out.println("Estado imcorrecto. Debe ser PASSED, FAILED o BLOCKED.");
        }
    }

    public void mostrarDetalles() 
    {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Estado: " + estado);
    }
}


public class Ejercicio1 
{
    public static void main(String[] args) 
    {
    
        TestCase caso1 = new TestCase(1, "Login", "PASSED");
        TestCase caso2 = new TestCase(2, "Checkout", "FAILED");

        caso1.mostrarDetalles();
        caso2.mostrarDetalles();
    }
}
