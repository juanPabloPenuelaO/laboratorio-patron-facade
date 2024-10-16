// CasaFacade.java
public class CasaFacade {
    private SistemaDeIluminacion iluminacion;
    private SistemaDeClimatizacion climatizacion;
    private SistemaDeSeguridad seguridad;
    private SistemaDeEntretenimiento entretenimiento; // Nuevo sistema de entretenimiento

    public CasaFacade() {
        this.iluminacion = new SistemaDeIluminacion();
        this.climatizacion = new SistemaDeClimatizacion();
        this.seguridad = new SistemaDeSeguridad();
        this.entretenimiento = new SistemaDeEntretenimiento(); // Inicializar nuevo sistema
    }

    public void modoNoche() {
        iluminacion.apagarLuces();
        climatizacion.encenderAireAcondicionado();
        seguridad.activarSistema();
        entretenimiento.apagarTelevisor(); // Apagar televisor en modo noche
        System.out.println("Modo noche activado.");
    }

    public void modoDia() {
        iluminacion.encenderLuces();
        climatizacion.apagarAireAcondicionado();
        seguridad.desactivarSistema();
        entretenimiento.encenderTelevisor(); // Encender televisor en modo día
        System.out.println("Modo día activado.");
    }

    public void modoCine() {
        iluminacion.apagarLuces();
        climatizacion.encenderAireAcondicionado();
        entretenimiento.encenderTelevisor();
        System.out.println("Modo cine activado.");
    }
}