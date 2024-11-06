package weekOne;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class McDavid extends JFrame{

    private JLabel hdrMcDavid, lblKiss, lblKissCount; 
    private JButton addKiss, minusKiss;
    
        McDavid(){
        setSize(550,700);
        setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //ADDING COMPONENTS
            hdrMcDavid = new JLabel("Welcome to McDavid!", SwingConstants.CENTER);
            hdrMcDavid.setBounds(0, 5, 525, 30);
            
            lblKiss = new JLabel("Kiss:");
            lblKiss.setBounds(50, 50, 100, 30);
            
            lblKissCount = new JLabel("0");
            lblKissCount.setBounds(160, 50, 100, 30);
            
            addKiss = new JButton("+");
            addKiss.setBounds(220, 50, 50, 30);
            
            minusKiss = new JButton("-");
            minusKiss.setBounds(270, 50, 50, 30);
            
            
            //ADDING COMPS TO FRAME
            add(hdrMcDavid);
            add(lblKiss);
            add(lblKissCount);
            add(addKiss);
            add(minusKiss);
            }
        }
            
            
    
