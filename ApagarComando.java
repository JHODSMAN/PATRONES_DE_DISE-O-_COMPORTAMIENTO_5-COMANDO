public class ApagarComando implements Comando {
    private Dispositivo dispositivo;

    public ApagarComando(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ejecutar() {
        dispositivo.apagar();
    }
}
