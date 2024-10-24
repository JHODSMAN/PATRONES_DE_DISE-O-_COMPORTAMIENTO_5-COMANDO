
public class Ventilador implements Dispositivo {
    @Override
    public void encender() {
        System.out.println("Ventilador encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Ventilador apagado");
    }
}
