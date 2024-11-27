
package ECOM;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainPage extends JFrame{
    
    private JLabel titletxt, appletxt, samsungtxt, microsofttxt, sonytxt, delltxt, aplnum, samnum, micnum, snynum, dellnum, techCat, cnaCat;
    private JPanel navPan;
    private JButton homebtn, searchbtn, cartbtn, logoutbtn, applebtnp, applebtnm, samsungbtnp, samsungbtnm, microsoftbtnp, microsoftbtnm, sonybtnp, sonybtnm, dellbtnm, dellbtnp, addCartBtn, checkOut;
    private JComboBox othrscb;
    private JTextField searchbox;
    private JTextArea cart;
    private int aplCount = 0; 
    private int samCount = 0;
    private int micCount = 0;
    private int snyCount = 0;
    private int dellCount = 0;
    
    MainPage(){
               
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        Font font = new Font("Arial" , Font.BOLD, 25); 
        titletxt = new JLabel("ByteMart");
        titletxt.setBounds(20, 22, 150, 40);
        titletxt.setFont(font);
        add(titletxt);
        
        searchbtn = new JButton("Search");
        searchbtn.setBounds(450, 30, 80, 30);
        searchbtn.setBackground(Color.LIGHT_GRAY);
        searchbtn.setBorderPainted(false);
        add(searchbtn);
        
//        Icon out = new Icon("file:/C:/Users/My%20PC/Documents/NetBeansProjects/DSA/src/main/java/ECOM/img/out.png"); //not working
        logoutbtn = new JButton("Logout");
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
        techCat = new JLabel("Technology");
        techCat.setBounds(20, 100, 150, 40);
        techCat.setFont(cat);
        add(techCat);
        
        appletxt = new JLabel("iPhone 15 Pro");
        appletxt.setBounds(100, 150, 100, 40);
        add(appletxt);
        
        applebtnm = new JButton("-");
        applebtnm.setBounds(210, 155, 45, 30);
        add(applebtnm);
        applebtnm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (aplCount > 0){
                    aplCount--;
                    aplnum.setText(String.valueOf(aplCount));
                }
            }
        });
        
        applebtnp = new JButton("+");
        applebtnp.setBounds(295, 155, 45, 30);
        add(applebtnp);
        applebtnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    aplCount++;
                    aplnum.setText(String.valueOf(aplCount));
            }
        });
        
        aplnum = new JLabel("0");
        aplnum.setBounds(273, 155, 45, 30);
        add(aplnum);
        
        samsungtxt = new JLabel("Galaxy Z Fold5");
        samsungtxt.setBounds(100, 200, 120, 30);
        add(samsungtxt);
        
        samsungbtnm = new JButton("-");
        samsungbtnm.setBounds(210, 200, 45, 30);
        add(samsungbtnm);
        samsungbtnm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (samCount > 0){
                samCount--;
                samnum.setText(String.valueOf(samCount));
                }
            }
        });
        
        samsungbtnp = new JButton("+");
        samsungbtnp.setBounds(295, 200, 45, 30);
        add(samsungbtnp);
        samsungbtnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                samCount++;
                samnum.setText(String.valueOf(samCount));
            }
        });
        
        samnum = new JLabel("0");
        samnum.setBounds(273, 200, 45, 30);
        add(samnum);
        
        microsofttxt = new JLabel("Surface Laptop Studio");
        microsofttxt.setBounds(60, 250, 170, 30);
        add(microsofttxt);
        
        microsoftbtnm = new JButton("-");
        microsoftbtnm.setBounds(210, 250, 45, 30);
        add(microsoftbtnm);
        microsoftbtnm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (micCount > 0) {
                    micCount--;
                    micnum.setText(String.valueOf(micCount));
                }
            }
        });
        
        microsoftbtnp = new JButton("+");
        microsoftbtnp.setBounds(295, 250, 45, 30);
        add(microsoftbtnp);
        microsoftbtnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                micCount++;
                micnum.setText(String.valueOf(micCount));
                
            }
        });
        
        micnum = new JLabel("0");
        micnum.setBounds(273, 250, 45, 30);
        add(micnum);
        
        sonytxt = new JLabel("PlayStation 5");
        sonytxt.setBounds(100, 300, 120, 30);
        add(sonytxt);
        
        sonybtnm = new JButton("-");
        sonybtnm.setBounds(210, 300, 45, 30);
        add(sonybtnm);
        sonybtnm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (snyCount > 0) {
                    snyCount--;
                    snynum.setText(String.valueOf(snyCount));
                }
            }
        });
        
        sonybtnp = new JButton("+");
        sonybtnp.setBounds(295,300, 45, 30);
        add(sonybtnp);
        sonybtnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snyCount++;
                snynum.setText(String.valueOf(snyCount));
                
            }
        });
        
        snynum = new JLabel("0");
        snynum.setBounds(273, 300, 45, 30);
        add(snynum);
        
        delltxt = new JLabel("XPS 13 Plus");
        delltxt.setBounds(100, 350, 100, 30);
        add(delltxt);
        
        dellbtnm = new JButton("-");
        dellbtnm.setBounds(210, 350, 45, 30);
        add(dellbtnm);
        dellbtnm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dellCount > 0) {
                    dellCount--;
                    dellnum.setText(String.valueOf(dellCount));
                }
            }
        });
        
        dellbtnp = new JButton("+");
        dellbtnp.setBounds(295,350, 45, 30);
        add(dellbtnp);
        dellbtnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dellCount++;
                dellnum.setText(String.valueOf(dellCount));
                
            }
        });
        
        dellnum = new JLabel("0");
        dellnum.setBounds(273, 350, 45, 30);
        add(dellnum);
       
        cnaCat = new JLabel("Clothing and Apparel");
        cnaCat.setBounds(20, 400, 300, 40);
        cnaCat.setFont(cat);
        add(cnaCat);
        
        cart = new JTextArea("Your Cart: " );
        cart.setBounds(450, 100, 225, 400);
        cart.setEditable(false);
        add(cart);
        
        addCartBtn = new JButton("Add to Cart");
        addCartBtn.setBounds(450, 510, 110, 30);
        add(addCartBtn);
        addCartBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder cartContent = new StringBuilder("Your Cart:\n");

                if (aplCount > 0) {
                    cartContent.append("iPhone 15 Pro: ").append(aplCount).append("\n");
                }
                if (samCount > 0) {
                    cartContent.append("Galaxy Z Fold5: ").append(samCount).append("\n");
                }
                if (micCount > 0) {
                    cartContent.append("Surface Laptop Studio: ").append(micCount).append("\n");
                }
                if (snyCount > 0) {
                    cartContent.append("PlayStation 5: ").append(snyCount).append("\n");
                }
                if (dellCount > 0) {
                    cartContent.append("XPS 13 Plus: ").append(dellCount).append("\n");
                }

                if (aplCount == 0 && samCount == 0 && micCount == 0 && snyCount == 0 && dellCount == 0) {
                    cartContent.append("Your cart is empty.");
                }

                cart.setText(cartContent.toString());
            }
        });
        
        checkOut = new JButton("Check Out");
        checkOut.setBounds(565, 510, 110, 30);
        add(checkOut);
        
        searchbox = new JTextField ();
        searchbox.setBounds(300, 30, 150, 30);
        add(searchbox);
        
        navPan = new JPanel();
        navPan.setBounds(0, 0, 680, 80);
        navPan.setBackground(Color.LIGHT_GRAY);
        add(navPan);
        
        
        
    }
        
}
