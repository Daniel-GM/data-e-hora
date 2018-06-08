package formularioexibedatahora;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class FormularioExibeDataHora extends JFrame implements ActionListener{
    
    private JButton botao1;
    private JPanel jp1 = new JPanel();
    private JLabel lbl1;
    private boolean opcao=false;
    
    public FormularioExibeDataHora() {
        setTitle("Exibe data e hota");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 100);
        setLocationRelativeTo(null);
        
        jp1.setLayout(new BorderLayout());
        add(jp1);
        
        botao1 = new JButton("Atualizar");
        jp1.add(botao1);
        botao1.addActionListener(this);
        jp1.add(BorderLayout.NORTH,botao1);
        
        lbl1 = new JLabel("clique para visualizar a data e hora");
        lbl1.setHorizontalAlignment(JLabel.CENTER);
        jp1.add(lbl1);
        jp1.add(BorderLayout.CENTER,lbl1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(opcao)
            lbl1.setText("clique para visualizar a data e hora");
        else
            lbl1.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm")));
        opcao=!opcao; 
    }   
}