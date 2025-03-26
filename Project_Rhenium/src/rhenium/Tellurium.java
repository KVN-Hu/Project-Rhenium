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

public class Tellurium {
	
    public void tellurium() {
    	
		Font font=new Font("Defult",Font.PLAIN,13);
		Font fontM=new Font("Defult",Font.PLAIN,20);
		Font fontL=new Font("Defult",Font.PLAIN,25);
    	Frame fr=new Frame("Tellurium System: The Light Calculator");
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
		Menu m1=new Menu("About");
		mb.add(m1);
		MenuItem mi1=new MenuItem("Project Rhenium V4.30.2");
		MenuItem mi2=new MenuItem("By Keven Hu");
		m1.addSeparator();
		m1.add(mi1);
		m1.addSeparator();
		m1.add(mi2);
		m1.addSeparator();
		
		fr.setVisible(true);
		//初始化菜单
        
        Panel pb = new Panel();
        pb.setLayout(new GridLayout(4,3,1,2));
        
        TextField pi1=(new TextField(10));
        pi1.setFont(fontL);
        TextField pi2=(new TextField(10));
        pi2.setFont(fontL);
        TextField pi3=(new TextField(10));
        pi3.setFont(fontL);
        pb.add(pi1);
        pb.add(pi2);
        pb.add(pi3);
        
        Button na=new Button("+  Plus");
        Button ns=new Button("-  Minus");
        Button nm=new Button("*  Times");
        Button no=new Button("/  Divide");
        Button np=new Button("^  Power");
        Button nme=new Button("x̄  Mean");
        Button nr=new Button("%  Mod");
        Button nc=new Button("Δ  Rate");
        Button ne=new Button("=  Enter");
        pb.add(na);
        pb.add(ns);
        pb.add(nm);
        pb.add(no);
        pb.add(np);
        pb.add(nme);
        pb.add(nr);
        pb.add(nc);
        pb.add(ne);
        pb.setFont(fontM);
        fr.add(pb);
        //Keyboard
        
        na.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ne.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						float in1=Long.parseLong(pi1.getText());
						float in2=Long.parseLong(pi2.getText());
						float out=in1+in2;
						pi3.setText(String.valueOf(out));
					}
				});
			}
		});
        
        ns.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ne.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						double in1=Long.parseLong(pi1.getText());
						double in2=Long.parseLong(pi2.getText());
						double out=in1-in2;
						pi3.setText(String.valueOf(out));
					}
				});
			}
		});
        
        nm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ne.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						double in1=Long.parseLong(pi1.getText());
						double in2=Long.parseLong(pi2.getText());
						double out=in1*in2;
						pi3.setText(String.valueOf(out));
					}
				});
			}
		});
        
        no.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ne.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						double in1=Long.parseLong(pi1.getText());
						double in2=Long.parseLong(pi2.getText());
						double out=in1/in2;
						pi3.setText(String.valueOf(out));
					}
				});
			}
		});
        
        np.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ne.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						double in1=Long.parseLong(pi1.getText());
						double in2=Long.parseLong(pi2.getText());
						double out=Math.pow(in1,in2);
						pi3.setText(String.valueOf(out));
					}
				});
			}
		});
        
        nme.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ne.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						double in1=Long.parseLong(pi1.getText());
						double in2=Long.parseLong(pi2.getText());
						double out=(in1+in2)/2;
						pi3.setText(String.valueOf(out));
					}
				});
			}
		});
        
        nr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ne.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int in1=Integer.valueOf(pi1.getText());
						int in2=Integer.valueOf(pi2.getText());
						int out=in1%in2;
						pi3.setText(String.valueOf(out));
					}
				});
			}
		});
        
        nc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ne.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						double in1=Long.parseLong(pi1.getText());
						double in2=Long.parseLong(pi2.getText());
						double out=((in2-in1)/in2)*100;
						pi3.setText(String.valueOf(out)+" %");
					}
				});
			}
		});
        //Math
        
		Button bt1=new Button("Iridium");
		bt1.setBackground(Color.DARK_GRAY);
		bt1.setForeground(Color.WHITE);
		fr.add(bt1,BorderLayout.WEST);
		fr.setVisible(true);
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Iridium i=new Iridium();
				i.iridium();
				fr.dispose();
			}
		});
		//Open Iridium
		
		Button bt2=new Button("Wolfram");
		bt2.setBackground(Color.DARK_GRAY);
		bt2.setForeground(Color.WHITE);
		fr.add(bt2,BorderLayout.EAST);
		fr.setVisible(true);
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Wolfram w=new Wolfram();
				w.wolfram();
				fr.dispose();
			}
		});
		//Open Wolfram
		
		Button bt3=new Button("Clear");
		bt3.setBackground(Color.GRAY);
		bt3.setForeground(Color.WHITE);
		fr.add(bt3,BorderLayout.SOUTH);
		fr.setVisible(true);
		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pi3.setText("");
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
