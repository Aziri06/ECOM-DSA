
package ECOM;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainPage extends JFrame{
    private JLabel titletxt, appletxt, samsungtxt, microsofttxt, sonytxt, delltxt, aplnum, samnum, micnum, snynum, dellnum, techCat, cnaCat;
    private JPanel navPan;
    private JButton homebtn, searchbtn, cartbtn, logoutbtn, applebtnp, applebtnm, samsungbtnp, samsungbtnm, microsoftbtnp, microsoftbtnm, sonybtnp, sonybtnm, dellbtnm, dellbtnp;
    private JComboBox othrscb;
    private JTextField searchbox;
    
    MainPage(){
               
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        Font font = new Font("Arial" , Font.BOLD, 25); 
        JLabel titletxt = new JLabel("ByteMart");
        titletxt.setBounds(20, 22, 150, 40);
        titletxt.setFont(font);
        add(titletxt);
        
        JButton searchbtn = new JButton("Search");
        searchbtn.setBounds(450, 30, 80, 30);
        searchbtn.setBackground(Color.LIGHT_GRAY);
        searchbtn.setBorderPainted(false);
        add(searchbtn);
        
//        Icon out = new Icon("file:/C:/Users/My%20PC/Documents/NetBeansProjects/DSA/src/main/java/ECOM/img/out.png"); //not working
        JButton logoutbtn = new JButton("Logout");
        logoutbtn.setBounds(590, 30, 80, 30);
        add(logoutbtn);
//        logoutbtn.setIcon(out);
        logoutbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            LogIn in = new LogIn();
            in.setVisible(true);
            dispose();
            }
        });
        Font cat = new Font ("Arial", Font.BOLD, 25);
        JLabel techCat = new JLabel("Technology");
        techCat.setBounds(20, 100, 150, 40);
        techCat.setFont(cat);
        add(techCat);
        
        JLabel appletxt = new JLabel("iPhone 15 Pro");
        appletxt.setBounds(100, 150, 100, 40);
        add(appletxt);
        
        JButton applebtnm = new JButton("-");
        applebtnm.setBounds(210, 155, 45, 30);
        add(applebtnm);
        
        JButton applebtnp = new JButton("+");
        applebtnp.setBounds(295, 155, 45, 30);
        add(applebtnp);
        
        JLabel aplnum = new JLabel("0");
        aplnum.setBounds(273, 155, 45, 30);
        add(aplnum);
        
        JLabel samsungtxt = new JLabel("Galaxy Z Fold5");
        samsungtxt.setBounds(100, 200, 120, 30);
        add(samsungtxt);
        
        JButton samsungbtnm = new JButton("-");
        samsungbtnm.setBounds(210, 200, 45, 30);
        add(samsungbtnm);
        
        JButton samsungbtnp = new JButton("+");
        samsungbtnp.setBounds(295, 200, 45, 30);
        add(samsungbtnp);
        
        JLabel samnum = new JLabel("0");
        samnum.setBounds(273, 200, 45, 30);
        add(samnum);
        
        JLabel microsofttxt = new JLabel("Surface Laptop Studio");
        microsofttxt.setBounds(60, 250, 170, 30);
        add(microsofttxt);
        
        JButton microsoftbtnm = new JButton("-");
        microsoftbtnm.setBounds(210, 250, 45, 30);
        add(microsoftbtnm);
        
        JButton microsoftbtnp = new JButton("+");
        microsoftbtnp.setBounds(295, 250, 45, 30);
        add(microsoftbtnp);
        
        JLabel micnum = new JLabel("0");
        micnum.setBounds(273, 250, 45, 30);
        add(micnum);
        
        JLabel sonytxt = new JLabel("PlayStation 5");
        sonytxt.setBounds(100, 300, 120, 30);
        add(sonytxt);
        
        JButton sonybtnm = new JButton("-");
        sonybtnm.setBounds(210, 300, 45, 30);
        add(sonybtnm);
        
        JButton sonybtnp = new JButton("+");
        sonybtnp.setBounds(295,300, 45, 30);
        add(sonybtnp);
        
        JLabel snynum = new JLabel("0");
        snynum.setBounds(273, 300, 45, 30);
        add(snynum);
        
        JLabel delltxt = new JLabel("XPS 13 Plus");
        delltxt.setBounds(100, 350, 100, 30);
        add(delltxt);
        
        JButton dellbtnm = new JButton("-");
        dellbtnm.setBounds(210, 350, 45, 30);
        add(dellbtnm);
        
        JButton dellbtnp = new JButton("+");
        dellbtnp.setBounds(295,350, 45, 30);
        add(dellbtnp);
        
        JLabel dellnum = new JLabel("0");
        dellnum.setBounds(273, 350, 45, 30);
        add(dellnum);
       
        JLabel cnaCat = new JLabel("Clothing and Apparel");
        cnaCat.setBounds(20, 400, 300, 40);
        cnaCat.setFont(cat);
        add(cnaCat);
        
        
        JTextField searchbox = new JTextField ();
        searchbox.setBounds(300, 30, 150, 30);
        add(searchbox);
        
        JPanel navPan = new JPanel();
        navPan.setBounds(0, 0, 680, 80);
        navPan.setBackground(Color.LIGHT_GRAY);
        add(navPan);
        
        
        
    }
    
}
