import javafx.embed.swing.JFXPanel;
import javafx.scene.control.CustomMenuItem;
import oracle.jrockit.jfr.JFR;
import sun.rmi.runtime.Log;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alejanddro on 22/11/2016.
 */
public class FormularioRegistro extends JFrame{
    private JPanel rootRegistro;
    private JTextField txtUsuario;
    private JTextField textField3;
    private JTextField txtPassword;
    private JTextField textField5;
    private JTextField txtNombre;
    private JTextField txtDireccion;
    private JTextField txtMMail;
    private JTextField textField9;
    private JTextField txtHora2;
    private JTextField txtHora1;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lbl7;
    private JLabel lbl8;
    private JButton btnCancelar;
    private JButton btnSubmmit;
    private JLabel lbl110;
    private JLabel lbl9;
    private JLabel lbl11;
    public  FormularioRegistro(){
        setContentPane(rootRegistro);
        setVisible(true);
        btnSubmmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JOptionPane.showMessageDialog(null, "Debes de contestar la encuesta para que podamos recomendarte un trabajo.");
                Cuestionario cuestionario = new Cuestionario("a");
                cuestionario.setSize(900,420);
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginGui loginGui = new LoginGui();
            }
        });
    }
}
