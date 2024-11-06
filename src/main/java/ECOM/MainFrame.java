package ECOM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    
    private JLabel titletxt;
    private JPanel navPan;
    private JButton homebtn, searchbtn, cartbtn;
    private JComboBox othrscb;
    private JTextField searchbox;
    
    
    MainFrame() {
               
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        JLabel titletxt = new JLabel("DCpET");
        titletxt.setBounds(20, 30, 100, 40);
        add(titletxt);
        
        JButton searchbtn = new JButton("Search");
        searchbtn.setBounds(470, 30, 80, 30);
        searchbtn.setBackground(Color.LIGHT_GRAY);
        searchbtn.setBorderPainted(false);
        add(searchbtn);
        
        JTextField searchbox = new JTextField ();
        searchbox.setBounds(300, 30, 150, 30);
        add(searchbox);
        
        
        JPanel navPan = new JPanel();
        navPan.setBounds(0, 0, 700, 80);
        navPan.setBackground(Color.LIGHT_GRAY);
        add(navPan);
        
        setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        new MainFrame();
    }
}