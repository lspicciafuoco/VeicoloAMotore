public class Automobile extends VeicoloAMotore {

    private String colore;

    private String marca;

    public Automobile(String colore, String marca) {
        this.colore = colore;
        this.marca = marca;
        this.stato = "spento";
    }
    
    @Override
    public void mostraStato() {
        System.out.println(stato);
        System.out.println(colore);
        System.out.println(marca);
    }
}
