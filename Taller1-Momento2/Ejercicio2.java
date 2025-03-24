import java.util.ArrayList;
import java.util.List;

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

class TestSuite 
{
    private List<TestCase> casosDePrueba;

    public TestSuite() 
    {
        this.casosDePrueba = new ArrayList<>();
    }

    public void agregarCaso(TestCase caso) 
    {
        casosDePrueba.add(caso);
    }

    public void eliminarCaso(int id) 
    {
        casosDePrueba.removeIf(caso -> caso.getId() == id);
    }

    public void mostrarCasos() 
    {
        System.out.println("Ejecutando.......");
        for (TestCase caso : casosDePrueba) 
        {
            caso.mostrarDetalles();
        }
    }
}

public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        TestSuite suite = new TestSuite();

        TestCase caso1 = new TestCase(1, "Login", "PASSED");
        TestCase caso2 = new TestCase(2, "Checkout", "FAILED");
        TestCase caso3 = new TestCase(3, "Payment", "BLOCKED");

        suite.agregarCaso(caso1);
        suite.agregarCaso(caso2);
        suite.agregarCaso(caso3);

        suite.mostrarCasos();

        System.out.println("\nEliminando el caso con ID 2...\n");
        suite.eliminarCaso(2);

        suite.mostrarCasos();
    }
}
