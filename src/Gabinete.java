public class Gabinete {
    public void conectarDispositivo(EntradaUSB dispositivo) {
        dispositivo.conectarUSB();
        String dados = dispositivo.enviarDadosUSB();
        System.out.println("[Gabinete] Recebeu: " + dados);
    }
}
