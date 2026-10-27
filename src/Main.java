public class Main {
    public static void main(String[] args) {
        Gabinete gabinete = new Gabinete();
        TecladoUSBC teclado = new TecladoUSBC();

        EntradaUSB adaptador = new AdaptadorCParaUSB(teclado);
        gabinete.conectarDispositivo(adaptador);
    }
}