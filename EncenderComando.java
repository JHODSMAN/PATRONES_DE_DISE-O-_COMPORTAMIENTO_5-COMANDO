public class EncenderComando implements Comando {
    private Dispositivo dispositivo;

    public EncenderComando(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ejecutar() {
        dispositivo.encender();
    }
}
