import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class ComboBox extends JFrame {
    
    private JComboBox imageBox;
    private JLabel label;
    private static final String [] names= { "android.png","like.png","saturno.png","bluetooth.png"

    };
    private Icon [] icon= {
        new ImageIcon(getClass().getResource(names [0])),
            new ImageIcon(getClass().getResource(names [1])),
            new ImageIcon(getClass().getResource(names [2])),
            new ImageIcon(getClass().getResource(names [3]))
    };
    public ComboBox(){
        super("Testando ComboBox");
        setLayout(new FlowLayout());
        imageBox= new JComboBox(names);
        imageBox.setMaximumRowCount(4);
        imageBox.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange()== ItemEvent.SELECTED){
                            label.setIcon(icon [imageBox.getSelectedIndex()]);
                        }
                    }
                }
        );
        add(imageBox);
        label = new JLabel(icon[0]);
        add(label);
    }
}
