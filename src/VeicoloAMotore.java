public class VeicoloAMotore {
    
    protected String stato;

    public VeicoloAMotore() {
        this.stato = "spento";
    }

    public void avviaMotore() {
        this.stato = "acceso";
        
    }

    public void mostraStato() {
        System.out.println(stato);
    }
}
