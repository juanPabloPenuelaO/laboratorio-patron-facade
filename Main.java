// Main.java
public class Main {
    public static void main(String[] args) {
        CasaFacade casa = new CasaFacade();

        // Activar modo noche
        casa.modoNoche();

        System.out.println();

        // Activar modo día
        casa.modoDia();

        System.out.println();

        // Activar modo cine
        casa.modoCine();
    }
}