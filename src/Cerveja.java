public class Cerveja {
    private String nome;
    private String estilo;
    private int ibu;
    
    public Cerveja(String nome, String estilo, int ibu) throws Exception {
        if (!estilo.equals("IPA") || ibu < 50) {
            throw new Exception("Muito fraca!");
        }
        this.nome = nome;
    }
}