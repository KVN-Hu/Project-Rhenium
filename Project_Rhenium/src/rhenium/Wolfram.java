package rhenium;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Wolfram {
	
    public void wolfram() {
    	
		Font font=new Font("Defult",Font.PLAIN,13);
		Font fontM=new Font("Defult",Font.PLAIN,20);
		Font fontL=new Font("Defult",Font.PLAIN,25);
    	Frame fr=new Frame("Wolfram System: The Light Cypher");
		fr.setBounds(100, 100, 600, 400);
		fr.setVisible(true);
		fr.setFont(font);
		fr.setBackground(Color.WHITE);
		fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//初始化GUI
		
		MenuBar mb=new MenuBar();
		fr.setMenuBar(mb);
		Menu m1=new Menu("Notice");
		mb.add(m1);
		MenuItem mi1=new MenuItem("The Wolfram Cypher works best under a specific input format.");
		MenuItem mi2=new MenuItem("For example, ‘Hello world 123!' should be write as 'HelloXworldXoneXtwoXthree'.");
		MenuItem mi3=new MenuItem("Numbers, space, punctuation marks and special charaters are NOT RECOMMENDED for data safety!");
		m1.addSeparator();
		m1.add(mi1);
		m1.addSeparator();
		m1.add(mi2);
		m1.addSeparator();
		m1.add(mi3);
		m1.addSeparator();
		
		Menu m2=new Menu("About");
		mb.add(m2);
		MenuItem mi5=new MenuItem("Project Rhenium V4.30.2");
		MenuItem mi6=new MenuItem("By Keven Hu");
		m2.addSeparator();
		m2.add(mi5);
		m2.addSeparator();
		m2.add(mi6);
		m2.addSeparator();
		
		fr.setVisible(true);
		//初始化菜单
        
		
        Panel pb = new Panel();
        pb.setLayout(new GridLayout(2,3,1,2));
        
        TextField pi1=(new TextField("In",10));
        pi1.setFont(fontL);
        TextField pi2=(new TextField("Out",10));
        pi2.setFont(fontL);
        TextField pi3=(new TextField("Key",10));
        pi3.setFont(fontL);
        pb.add(pi1);
        pb.add(pi2);
        pb.add(pi3);
        
        Button ne=new Button("Encrypt");
        Button nd=new Button("Decrypt");
        Button nc=new Button("Confirm");
        pb.add(ne);
        pb.add(nd);
        pb.add(nc);
        pb.setFont(fontM);
        fr.add(pb);
        //Keyboard
        
        ne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nc.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String in=String.valueOf(pi1.getText());
						int key=Integer.valueOf(pi3.getText());
						if (key>26) {
							key=key%26;
						}else {
							key=Math.abs(Integer.valueOf(pi3.getText()));
						}
						StringBuilder out=new StringBuilder();
						for (int i = 0; i < in.length(); i++) {
						char c = in.charAt(i);
						if (Character.isLowerCase(c)) {
							c = (char) ((c - 'a' + (26-((key+i)%26))) % 26 + 'a');
						} else if (Character.isUpperCase(c)) {
							c = (char) ((c - 'A' + (key+(i%26))) % 26 + 'A');
						}
						
						out.append(c);
						}
						pi2.setText(String.valueOf(out));
					}
				});
			}
		});
        
        nd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nc.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String in=String.valueOf(pi1.getText());
						int key=Integer.valueOf(pi3.getText());
						if (key>26) {
							key=key%26;
						}else {
							key=Math.abs(Integer.valueOf(pi3.getText()));
						}
						StringBuilder out=new StringBuilder();
						for (int i = 0; i < in.length(); i++) {
						char c = in.charAt(i);
						if (Character.isLowerCase(c)) {
							c = (char) ((c - 'a' + (key+(i%26))) % 26 + 'a');
						} else if (Character.isUpperCase(c)) {
							c = (char) ((c - 'A' + (26-((key+i)%26))) % 26 + 'A');
						}
						
						out.append(c);
						}
						pi2.setText(String.valueOf(out));
					}
				});
			}
		});
        //Cypher
        
		Button bt1=new Button("Tellurium");
		bt1.setBackground(Color.DARK_GRAY);
		bt1.setForeground(Color.WHITE);
		fr.add(bt1,BorderLayout.WEST);
		fr.setVisible(true);
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Tellurium t=new Tellurium();
				t.tellurium();
				fr.dispose();
			}
		});
		//Open Tantalum
		
		Button bt2=new Button("Tantalum");
		bt2.setBackground(Color.DARK_GRAY);
		bt2.setForeground(Color.WHITE);
		fr.add(bt2,BorderLayout.EAST);
		fr.setVisible(true);
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Tantalum t=new Tantalum();
				t.tantalum();
				fr.dispose();
			}
		});
		//Open Iridium
		
		Button bt3=new Button("Clear");
		bt3.setBackground(Color.GRAY);
		bt3.setForeground(Color.WHITE);
		fr.add(bt3,BorderLayout.SOUTH);
		fr.setVisible(true);
		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pi2.setText("");
			}
		});
		//Clear Button
		
		Button bt4=new Button("Change Theme");
		bt4.setBackground(Color.GRAY);
		fr.add(bt4,BorderLayout.NORTH);
		bt3.setForeground(Color.BLACK);
		fr.setVisible(true);
		bt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color Azure=new Color(0,155,155);
				Color Libro=new Color(0,50,100);
				bt1.setBackground(Libro);
				bt2.setBackground(Libro);
				bt3.setBackground(Azure);
				bt4.setBackground(Azure);
				bt1.setForeground(Color.WHITE);
				bt2.setForeground(Color.WHITE);
				bt3.setForeground(Color.BLACK);
				bt4.setForeground(Color.BLACK);
			}
		});
		//Theme
		
    }
}
