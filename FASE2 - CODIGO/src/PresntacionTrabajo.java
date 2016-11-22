import javax.swing.*;

/**
 * Created by Alejanddro on 22/11/2016.
 */
public class PresntacionTrabajo extends JFrame{
    private JLabel lblnombre;
    private JTextArea txtArea1;
    private JTextArea txtArea2;
    private JPanel rootTrabajos;

    public PresntacionTrabajo(){
        setContentPane(rootTrabajos);
        setVisible(true);
        pack();
    }
}
