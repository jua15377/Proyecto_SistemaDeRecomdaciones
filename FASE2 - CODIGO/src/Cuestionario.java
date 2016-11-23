
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alejanddro on 22/11/2016.
 */
public class Cuestionario extends JFrame{
    private JPanel rootEncuesta;
    private JLabel lbl1;
    private JButton btnSiguiente;
    private JLabel lblPregunta;
    private JButton btnCancelar;
    private JRadioButton rdbuttonSi;
    private JRadioButton rdnButtonNo;
    public final String pregutnas[] = {"<html>Te gustan los números, la lógica y los proceso que nos ayudan a modelar nuestra realidad?<html>","<html>Acostumbras a tomar parte en las acciones de tu país, en los voluntariados o cambiando aspectos que no te gustan de tu comunidad?<html>","<html>Te agradaría pertenecer a organizaciones como la ONU o ser un diplomático o embajador de tu país? <html>","<html>Sería de su agrado ser parte de películas, series de televisión o algún tipo de obra de teatro? <html>","<html>Te interesan la vida y exploración de nuevas especies y la preservación de la naturaleza? <html>","<html>Te gusta conocer más de nuestro universo, utilizar el método científico para analizar los fenómenos y aportar conocimiento científico a la comunidad? <html>","<html>Te gusta expresarte por medio de la música o la pintura, sabes apreciar las pinturas clásicas y de nuestra época y crees tener alguna habilidad artística? <html>","<html>Te gusta la inteligencia artificial, la realidad virtual, y todos los avances tecnológicos de esta índole?<html>","<html>Le llamaría la atención trabajar en una impresora escultural 3D que logre generar copias de esculturas griegas?<html>","<html>Participaría en un proyecto que ayude al Orangután de Sumatra cuidar a sus hijos mediante GPS que los identifique y ya no está en peligro de extinción?<html>","<html>Le gustaría trabajar en la búsqueda de familiares de personas perdidas en Siria mediante una interfaz de reconocimiento facial?<html>","<html>Utilizaría una aplicación móvil que le muestre todas sus series o novelas preferidas?<html>","<html>Le llamaría la atención trabajar en esculturas de todo tipo de figuras utilizando ramas secas de árboles?<html>","<html>Participaría en un congreso chino para aprender sus técnicas de pintura?<html>","<html>Le gustaría diseñar el guion para su artista de cine favorito?<html>","<html>Le gustaría ir a una fiesta de 3 días en yates ubicada en mar abierto con 1 amigo y personas que nunca ha conocido? <html>","<html>Le gustaría trabajar en un proyecto que ayude a las personas que han perdido una parte de su cuerpo recuperarla mediante células madre?<html>","<html>Participaría como matemático en la elaboración de un vehículo de exploración para Marte?<html>","<html>Le llamaría la atención trabajar en prótesis biónicas para animales?<html>","<html>Le agradaría participar en comunidades que descubran fenómenos como la aurora boreal y otros misterios de enorme belleza creadas por la naturaleza? <html>","<html>Le interesa encontrar nuevos especímenes y cuidar a las especies en peligro de extinción del Mar Mediterráneo?<html>","<html>Le gustaría promover la unión entre países para encontrar las mejores maneras de viajar a otros planetas?<html>","<html>Es de su agrado ver documentales de la vida salvaje de otras regiones y cómo se comportan en su hábitat natural? <html>","<html>Le llama la atención descubrir los patrones lógicos detrás de las acciones de un grupo de personas? <html>","<html>Le gustaría aportar dentro de programas que están prediciendo como se comportara la economía dentro de 20 años?<html>","<html>Cree que existe arte dentro de las ciencias políticas? <html>","<html>Le causa interés descubrir como la criminología nos podría ayudar a preservar la naturaleza del planeta?<html>","<html>Le gustaría demostrar que, por medio de la educación, podemos crear mejores relaciones con personas de diferentes culturas?<html>","<html>Le cusa curiosidad conocer de las obras teatrales de otras culturas? <html>","<html>Le gustaría conocer programas capaces de decirle en que piensa usando la lógica y la estadística? <html>","<html>Le interesaría conocer de la matemática detrás de la Mona Lisa?<html>","<html>Le gustaría saber más de como, por medio de estadística, podríamos predecir cuándo se formará una nueva mutación o albinismo dentro de una especie?<html>","<html>Le gustaría conocer de los convenios y reuniones de matemáticos alrededor del mundo? <html>","<html>Usted miraría un programa que ayudara a su pensamiento lógico a fortalecerse?<html>"};
    public int contadorDePreguntas = 0;
    public boolean respuestas[]= new boolean[34];
    public  Usuario user;

    public Cuestionario(Usuario usuario){
        user = usuario;
        setContentPane(rootEncuesta);
        lblPregunta.setText(pregutnas[contadorDePreguntas]);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbuttonSi);
        buttonGroup.add(rdnButtonNo);
        setVisible(true);
        pack();
        rdbuttonSi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSiguiente.setEnabled(true);
            }
        });
        rdnButtonNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSiguiente.setEnabled(true);
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdbuttonSi.isSelected()){
                    respuestas[contadorDePreguntas] = true;
                }
                else{
                    respuestas[contadorDePreguntas] = false;
                }
                contadorDePreguntas += 1;
                if(contadorDePreguntas == 34){
                    lblPregunta.setText("La encuesta finalizo");
                    JOptionPane.showMessageDialog(null, "Encuesta finalizada");
                    //cierra ventana
                    dispose();
                }
                else {
                    lblPregunta.setText(pregutnas[contadorDePreguntas]);
                    btnSiguiente.setEnabled(false);
                    buttonGroup.clearSelection();
                }
            }
        });
    }
}
