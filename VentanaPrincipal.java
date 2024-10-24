import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private ControlRemoto controlRemoto;
    private Dispositivo luz;
    private Dispositivo ventilador;

    public VentanaPrincipal() {
        controlRemoto = new ControlRemoto();
        luz = new Luz();
        ventilador = new Ventilador();
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setTitle("Control Remoto - Patrón Command");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton botonEncenderLuz = new JButton("Encender Luz");
        botonEncenderLuz.setBounds(50, 30, 150, 30);
        botonEncenderLuz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlRemoto.setComando(new EncenderComando(luz));
                controlRemoto.presionarBoton();
            }
        });

        JButton botonApagarLuz = new JButton("Apagar Luz");
        botonApagarLuz.setBounds(200, 30, 150, 30);
        botonApagarLuz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlRemoto.setComando(new ApagarComando(luz));
                controlRemoto.presionarBoton();
            }
        });

        JButton botonEncenderVentilador = new JButton("Encender Ventilador");
        botonEncenderVentilador.setBounds(50, 80, 150, 30);
        botonEncenderVentilador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlRemoto.setComando(new EncenderComando(ventilador));
                controlRemoto.presionarBoton();
            }
        });

        JButton botonApagarVentilador = new JButton("Apagar Ventilador");
        botonApagarVentilador.setBounds(200, 80, 150, 30);
        botonApagarVentilador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlRemoto.setComando(new ApagarComando(ventilador));
                controlRemoto.presionarBoton();
            }
        });

        add(botonEncenderLuz);
        add(botonApagarLuz);
        add(botonEncenderVentilador);
        add(botonApagarVentilador);
    }
}
