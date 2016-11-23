
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alejanddro on 22/11/2016.
 */
public class FormularioRegistro extends JFrame{
    private JPanel rootRegistro;
    private JTextField txtUsuario;
    private JTextField txtSalarioInteres;
    private JTextField txtPassword;
    private JTextField txtTelefono;
    private JTextField txtNombre;
    private JTextField txtDireccion;
    private JTextField txtMMail;
    private JTextField txtEdad;
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
    public  Conexion conexion = new Conexion();
    public  Usuario usuario = new Usuario("a","b","");
    public  FormularioRegistro(){
        setContentPane(rootRegistro);
        setVisible(true);
        btnSubmmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // agregando datos al usuario
                usuario.setusuario(txtNombre.getText());
                usuario.setContrasena(txtPassword.getText());
                usuario.setNombre(txtNombre.getText());
                usuario.setCorreo(txtMMail.getText());
                usuario.setDireccion(txtDireccion.getText());
                usuario.setHorarioInicio(txtHora1.getText());
                usuario.setHorarioFinal(txtHora2.getText());
                usuario.setEdad(Integer.parseInt(txtEdad.getText()));
                usuario.setTelefono(Integer.parseInt(txtTelefono.getText()));
                usuario.setSalario(Integer.parseInt(txtSalarioInteres.getText()));
                conexion.crearUsuario(usuario);
                dispose();
                JOptionPane.showMessageDialog(null, "Debes de contestar la encuesta para que podamos recomendarte un trabajo.");
                Cuestionario cuestionario = new Cuestionario(usuario);
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
