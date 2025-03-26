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
import java.io.File;

public class Iridium{

	public void iridium() {
		
		Font font=new Font("Defult",Font.PLAIN,13);
		
		Frame fr=new Frame("Iridium System: The Light Disk Monitor");
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
		Menu m1=new Menu("Disk");
		mb.add(m1);
		Menu m2=new Menu("About");
		mb.add(m2);
		MenuItem mi1=new MenuItem("Project Rhenium V4.30.2");
		MenuItem mi2=new MenuItem("By Keven Hu");
		m2.addSeparator();
		m2.add(mi1);
		m2.addSeparator();
		m2.add(mi2);
		m2.addSeparator();
		
		File[] roots = File.listRoots();
		m1.addSeparator();
		for (int i = 0; i < roots.length; i++) {
		    m1.add(roots[i].getPath()+"  Total:"+roots[i].getTotalSpace()/1024/1024/1024+"GB"+"  Free:"+roots[i].getFreeSpace()/1024/1024/1024+"GB");
		    m1.addSeparator();
		}
		fr.setVisible(true);
		//初始化菜单
		
		List ls=new List();
		for (int i = 0; i < roots.length; i++) {
		    ls.add("Disk "+roots[i].getPath()+": Total Space "+roots[i].getTotalSpace()/1024/1024/1024+" GB; Usable Space "+roots[i].getUsableSpace()/1024/1024/1024+" GB; Free Space "+roots[i].getFreeSpace()/1024/1024/1024+" GB;");
		    File f = new File(roots[i].getPath());
		    ls.add(""); 
		    ls.add("File Contained in "+roots[i].getPath()+"    Name / Type / File Size");
		    ls.add(""); 
		    ls.add("===================================");
		    ls.add(""); 
	        String fileList[] = f.list();
	        for (int i1 = 0; i1 < fileList.length; i1++) {
	        	if ((new File(roots[i], fileList[i1])).isFile()==true) {
	        		ls.add(fileList[i1]+" / "+"File"+" / "+(new File(roots[i], fileList[i1])).length()+" Byte");
		        	ls.add("");
	        	}else {
	        		ls.add(fileList[i1]+" / "+"Folder");
	        		ls.add("");
	        	}	
	        }
		    ls.add(""); 
		    ls.add(""); 
		}
		fr.add(ls);
		ls.setVisible(true);
		//磁盘空间简报系统
		
		Button bt1=new Button("Refresh");
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
				for (int i = 0; i < roots.length; i++) {
				    ls.add("Disk "+roots[i].getPath()+" Total Space "+roots[i].getTotalSpace()+" Byte; Usable Space "+roots[i].getUsableSpace()+" Byte; Free Space "+roots[i].getFreeSpace()+" Byte;");
				    File f = new File(roots[i].getPath());
				    ls.add(""); 
				    ls.add("File Contained in "+roots[i].getPath()+"    Name / Type / Size");
				    ls.add(""); 
				    ls.add("===================================");
				    ls.add(""); 
			        String fileList[] = f.list();
			        for (int i1 = 0; i1 < fileList.length; i1++) {
			        	if ((new File(roots[i], fileList[i1])).isFile()==true) {
			        		ls.add(fileList[i1]+" / "+"File"+" / "+(new File(roots[i], fileList[i1])).length()+" Byte");
				        	ls.add("");
			        	}else {
			        		ls.add(fileList[i1]+" / "+"Folder");
			        		ls.add("");
			        	}	
			        }
				    ls.add(""); 
				    ls.add(""); 
				}
				fr.add(ls);
				ls.setVisible(true);
			}
		});
		//Refresh Button
		
		Button bt2=new Button("Clear");
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
			}
		});
		//Clear Button
		
		Button bt3=new Button("Switch To Tellurium");
		bt3.setBackground(Color.GRAY);
		bt3.setForeground(Color.BLACK);
		fr.add(bt3,BorderLayout.SOUTH);
		fr.setVisible(true);
		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Tellurium t=new Tellurium();
				t.tellurium();
				fr.dispose();
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
