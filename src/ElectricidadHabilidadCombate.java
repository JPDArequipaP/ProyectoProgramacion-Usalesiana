public class ElectricidadHabilidadCombate  implements HabilidadCombate{

    @Override
    public void combatePrincipal() {
        System.out.println("Explosiva masa semi-sólida de flamas electricas.");
        
    }

    @Override
    public void combateSecundario() {
        System.out.println("rayos pequeños");
    }
}
