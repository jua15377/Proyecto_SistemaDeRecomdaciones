import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alejanddro on 21/11/2016.
 */
public class LoginGui extends JFrame{
    private JPanel Fondo;
    private JLabel lbl1;
    private JPanel panelLogin;
    private JTextField txtusuario;
    private JButton btnLogin;
    private JButton registrarseButton;
    private JLabel lbl2;
    private JLabel lbl3;
    private JPasswordField pssFld1;
    public LoginGui(){
        setContentPane(Fondo);
        setVisible(true);
        pack();
        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                FormularioRegistro formularioRegistro = new FormularioRegistro();
                formularioRegistro.setSize(640,750);
            }
        });
    }
}
