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

public class Rhenium{

	public static void main(String[]args) {
		
		Font font=new Font("Defult",Font.PLAIN,13);
		Font fontM=new Font("Defult",Font.PLAIN,15);
		
		Frame fr=new Frame("Rhenium System: The Light Multitool");
		fr.setBounds(100, 100, 600, 400);
		fr.setVisible(true);
		fr.setFont(font);
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
		
		
		List ls=new List();
		ls.add(""); 
		ls.add("Thank you for using Rhenium Multitool Software!"); 
		ls.add(""); 
		ls.add(""); 
		ls.add("Installed Functions Included:");
		ls.add(""); 
		ls.add(""); 
		ls.add("1. Iridium Disk Monitor");
		ls.add(""); 
		ls.add("2. Tellurium Calculator");
		ls.add("");
		ls.add("3. Wolfram Cypher");
		ls.add("");
		ls.add("4. Tantalum Password Generator");
		ls.add("");
		ls.add("Click Buttons to Continue"); 
		ls.setFont(fontM);
		fr.add(ls);
		ls.setVisible(true);
		//Welcome Screen
		
		Button bt1=new Button("Tantalum");
		bt1.setBackground(Color.DARK_GRAY);
		bt1.setForeground(Color.WHITE);
		fr.add(bt1,BorderLayout.WEST);
		fr.setVisible(true);
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Tantalum t=new Tantalum();
				t.tantalum();
				fr.dispose();
				fr.add(ls);
				ls.setVisible(true);
			}
		});
		//Open Tantalum
		
		Button bt2=new Button("Iridium");
		bt2.setBackground(Color.DARK_GRAY);
		bt2.setForeground(Color.WHITE);
		fr.add(bt2,BorderLayout.EAST);
		fr.setVisible(true);
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Iridium i=new Iridium();
				i.iridium();
				fr.dispose();
			}
		});
		//Open Iridium
		
		Button bt3=new Button("Don't click me!");
		bt3.setBackground(Color.GRAY);
		bt3.setForeground(Color.BLACK);
		fr.add(bt3,BorderLayout.SOUTH);
		fr.setVisible(true);
		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ls.removeAll();
				ls.add("");
				ls.add("Well, I told you not to do so.");
				ls.add("");
				ls.add("As a punishment, find out what I want to say:");
				ls.add("");
				ls.add("");
				ls.add("Rovvy Gybvn.");
				ls.add("");
				ls.add("Rovvy yxo gry sc boknsxq drsc wocckqo.");
				ls.add("");
				ls.add("Kvv S gkxd dy cki sc:");
				ls.add("");
				ls.add("");
				ls.add("Vk cmsoxmy ocdkc cmsvoqomy ocdkc zydoxmy.");
				ls.add("");
				ls.add("Vk csqxspy no fsfy ocdkc fsfs ukt kwy msyx.");
				ls.add("");
				ls.add("Mskw ocde nkxuk.");
				ls.add("");
				ls.add("Mskw pkbe wsvyx.");
				ls.add("");
				ls.add("Mskw ocde wkvrewsvk.");
				ls.add("");
				ls.add("");
				ls.add("Hint 1: Give me 10 Caesar Salads please.");
				ls.add("");
				ls.add("Hint 2: A Language Made In the Name of Hope.");
			}
		});
		//Switch
		
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
