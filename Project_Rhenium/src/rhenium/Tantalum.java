package rhenium;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.SecureRandom;

public class Tantalum{

	public void tantalum() {

		Font font=new Font("Defult",Font.PLAIN,13);
		
		Frame fr=new Frame("Tantalum System: The Light Password Generator");
		fr.setBounds(100, 100, 600, 400);
		fr.setVisible(true);
		fr.setFont(font);
		fr.setBackground(Color.DARK_GRAY);
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
		MenuItem mi1=new MenuItem("Too long and too short are both bad ideas, make sure you can remember it.");
		MenuItem mi2=new MenuItem("Always Remember: NEVER REUSE A PASSWORD!");
		m1.addSeparator();
		m1.add(mi1);
		m1.addSeparator();
		m1.add(mi2);
		m1.addSeparator();
		
		Menu m2=new Menu("About");
		mb.add(m2);
		MenuItem mi3=new MenuItem("Project Rhenium V4.30.2");
		MenuItem mi4=new MenuItem("By Keven Hu");
		m2.addSeparator();
		m2.add(mi3);
		m2.addSeparator();
		m2.add(mi4);
		m2.addSeparator();
		
		fr.setVisible(true);
		//初始化菜单
	
		List ls=new List();
		for (int i = 0; i < 10; i++) {
			SecureRandom random = new SecureRandom();
			String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String lowercase = "abcdefghijklmnopqrstuvwxyz";
			String number = "0123456789";
			String special = "!@#$%^&*=[]{}()<>?";
			String characterSet = uppercase + lowercase + number + special;
			StringBuilder password = new StringBuilder();
			for (int t = 0; t < 16; t++) {
				int randomIndex = random.nextInt(characterSet.length());
				char randomChar = characterSet.charAt(randomIndex);
				password.append(randomChar);	
			}
			String pw = password.toString();
			ls.add(pw);
			ls.add("");
		}
		fr.add(ls);
		ls.setVisible(true);
		//密码生成系统
		
		Button bt1=new Button("16 Characters");
		bt1.setBackground(Color.DARK_GRAY);
		bt1.setForeground(Color.WHITE);
		fr.add(bt1,BorderLayout.WEST);
		fr.setVisible(true);
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ls.removeAll();
				int fs=12;
				Font font=new Font("Defult",Font.PLAIN,fs);
				fr.setFont(font);
				for (int i = 0; i < 10; i++) {
					SecureRandom random = new SecureRandom();
					String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
					String lowercase = "abcdefghijklmnopqrstuvwxyz";
					String number = "0123456789";
					String special = "!@#$%^&*=[]{}()<>?";
					String characterSet = uppercase + lowercase + number + special;
					StringBuilder password = new StringBuilder();
					for (int t = 0; t < 16; t++) {
						int randomIndex = random.nextInt(characterSet.length());
						char randomChar = characterSet.charAt(randomIndex);
						password.append(randomChar);	
					}
					String pw = password.toString();
					ls.add(pw);
					ls.add("");
				}
				fr.add(ls);
				ls.setVisible(true);
			}
		});
		//16-B Pass
		
		Button bt2=new Button("32 Characters");
		bt2.setBackground(Color.DARK_GRAY);
		bt2.setForeground(Color.WHITE);
		fr.add(bt2,BorderLayout.EAST);
		fr.setVisible(true);
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ls.removeAll();
				fr.add(ls);
				ls.setVisible(true);
				for (int i = 0; i < 10; i++) {
					SecureRandom random = new SecureRandom();
					String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
					String lowercase = "abcdefghijklmnopqrstuvwxyz";
					String number = "0123456789";
					String special = "!@#$%^&*=[]{}()<>?";
					String characterSet = uppercase + lowercase + number + special;
					StringBuilder passwordMaker = new StringBuilder();
					for (int t = 0; t < 32; t++) {
						int randomIndex = random.nextInt(characterSet.length());
						char randomChar = characterSet.charAt(randomIndex);
						passwordMaker.append(randomChar);	
					}
					String pw = passwordMaker.toString();
					ls.add(pw);
					ls.add("");
				}
			}
		});
		//32-B Pass
		
		Button bt3=new Button("Switch To Wolfram");
		bt3.setBackground(Color.GRAY);
		bt3.setForeground(Color.BLACK);
		fr.add(bt3,BorderLayout.SOUTH);
		fr.setVisible(true);
		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Wolfram w=new Wolfram();
				w.wolfram();
				fr.dispose();
			}
		});
		//Open Wolfram
		
		
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
