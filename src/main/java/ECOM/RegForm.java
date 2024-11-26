
package ECOM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class RegForm extends JFrame{
    
    private JLabel f, mi, s, em, ps, bd, add, num, g;
    private JTextField ftxt, mitxt, stxt, emtxt, pstxt, bdtxt, addtxt, numtxt, gtxt;
    private JButton backbtn, cancelbtn, createbtn;
    private JComboBox gender;
    
    RegForm (){
        setSize(550, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JButton backbtn = new JButton("Back");
        backbtn.setBounds(5, 5, 70, 30);
        add(backbtn);
        
        JLabel f = new JLabel("First Name");
        f.setBounds(110, 60, 90, 30);
        add(f);
        
        JTextField ftxt = new JTextField();
        ftxt.setBounds(110, 90, 150, 25);
        add(ftxt);
        
        JLabel mi = new JLabel("M.I.");
        mi.setBounds(275, 60, 20, 30);
        add(mi);
        
        JTextField mitxt = new JTextField();
        mitxt.setBounds(275, 90, 40, 25);
        add(mitxt);
        
        JLabel s = new JLabel("Surname");
        s.setBounds(330, 60, 70, 25);
        add(s);
        
         JTextField stxt = new JTextField();
        stxt.setBounds(330, 90, 120, 25);
        add(stxt);
        
        JLabel em = new JLabel("E-mail Address:");
        em.setBounds(10, 130, 100, 25);
        add(em);
        
        JTextField emtxt = new JTextField();
        emtxt.setBounds(110, 130, 170, 25);
        add(emtxt);
        
        JLabel ps = new JLabel("Set Password:");
        ps.setBounds(10, 170, 100, 25);
        add(ps);
        
        JTextField pstxt = new JTextField();
        pstxt.setBounds(110, 170, 170, 25);
        add(pstxt);
                
        JLabel bd = new JLabel("Birth Date:");
        bd.setBounds(10, 210, 100, 25);
        add(bd);
        
        JTextField bdtxt = new JTextField();
        bdtxt.setBounds(110, 210, 80, 25);
        add(bdtxt);
        
        JLabel add = new JLabel("Addres:");
        add.setBounds(10, 250, 100, 25);
        add(add);
        
        JTextField addtxt = new JTextField();
        addtxt.setBounds(110, 250, 170, 25);
        add(addtxt);
        
        JLabel num = new JLabel("Phone Number:");
        num.setBounds(10, 290, 100, 25);
        add(num);
        
        JTextField numtxt = new JTextField();
        numtxt.setBounds(110, 290, 170, 25);
        add(numtxt);
        
        JLabel g = new JLabel("Gender:");
        g.setBounds(10, 330, 100, 25);
        add(g);
        
        String[] gen = {"-SELECT-","Male", "Female"};
        JComboBox gender = new JComboBox(gen);
        gender.setBounds(110, 330, 170, 25);
        add(gender);
        
        JButton createbtn = new JButton("Create");
        createbtn.setBounds(430, 520, 90, 30);
        add(createbtn);
        
        JButton cancelbtn = new JButton("Cancel");
        cancelbtn.setBounds(330, 520, 90, 30);
        add(cancelbtn);
        
         //action for back to log in btn
        backbtn.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            LogIn back = new LogIn();
            back.setVisible(true);
            dispose();
            }
        });
        
                
        
        
        setVisible(true);
        
    }
    
}
