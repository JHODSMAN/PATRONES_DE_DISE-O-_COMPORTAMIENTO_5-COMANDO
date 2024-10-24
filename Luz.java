public class Luz implements Dispositivo {
    @Override
    public void encender() {
        System.out.println("Luz encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Luz apagada");
    }
}
