public class FuegoHabilidadCombate implements HabilidadCombate{

    @Override
    public void combatePrincipal() {
        System.out.println("Explosiva masa de flamas de fuego");
    }

    @Override
    public void combateSecundario() {
        System.out.println("flamas pequeñas");
    }
}
