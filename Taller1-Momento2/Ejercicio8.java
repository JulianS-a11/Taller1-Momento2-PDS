abstract class ReporteTest 
{
    public abstract void generarReporte();
}

class ReporteHTML extends ReporteTest 
{
    @Override
    public void generarReporte() {
        System.out.println("Generando reporte en formato HTML...");
    }
}

class ReportePDF extends ReporteTest 
{
    @Override
    public void generarReporte() {
        System.out.println("Generando reporte en formato PDF...");
    }
}

public class Ejercicio8 
{
    public static void main(String[] args) 
    {
        
        ReporteTest reporteHtml = new ReporteHTML();
        ReporteTest reportePdf = new ReportePDF();

        System.out.println("Ejecutando generación de reportes:");
        reporteHtml.generarReporte();
        reportePdf.generarReporte();
    }
}
