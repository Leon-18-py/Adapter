public class AdaptadorCParaUSB implements EntradaUSB {
    private final TecladoUSBC teclado;

    public AdaptadorCParaUSB(TecladoUSBC teclado) {
        this.teclado = teclado;
    }

    @Override
    public void conectarUSB() {
        System.out.println("[Adaptador] Convertendo USB -> USB-C");
        teclado.conectarTipoC();
    }

    @Override
    public String enviarDadosUSB() {
        String sinalC = teclado.enviarSinalTipoC();
        return sinalC.replace("USB-C", "USB");
    }
}