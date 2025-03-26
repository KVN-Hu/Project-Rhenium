package rhenium;

public class Unity {
	//Unity V1.2.20
	//定义Unity库

	//预定义变量模块
	String temp;
	String cache;
	String message;
	String system;
	String str1;
	String str2;
	String str3;
	String str4;
	String str5;
	String str6;
	String str7;
	String str8;
	String str9;
	String str10;
	//预定义字符串
	
	int n1;
	int n2;
	int n3;
	int n4;
	int n5;
	int n6;
	int n7;
	int n8;
	int n9;
	int n10;
	//预定义整数
	
	float f1;
	float f2;
	float f3;
	float f4;
	float f5;
	float f6;
	float f7;
	float f8;
	float f9;
	float f10;
	//预定浮点数
	
	
	//方法库模块
	public static void print(String out){
		System.out.print(out);
	}	
	public static void println(String out){
		System.out.println(out);	
	}
	//打印模块
	
	public static float add(float a,float b){
		return a+b;
	}
	public static float min(float a,float b){
		return a-b;
	}
	public static float plus(float a,float b){
		return a*b;
	}
	public static float divi(float a,float b){
		return a/b;
	}
	public static float aver(float a,float b){
		return (a+b)/2;
	}
	//数学模块
	
	public static void idx(String a,String b){
		int idxt;
		int idxc=0;
		idxt=a.indexOf(b,idxc);
		while(idxc<a.length()-1) {
			if(idxt!=-1) {
				idxt=a.indexOf(b,idxc);
				int idx;
				idx=idxt;
				System.out.println(idx);
				idxc=idxt+1;
			}else {
				idxc=idxc+1;
			}
		}
	}
	public static void ridx(String a,String b){
		int ridxt;
		int ridxc=0;
		ridxt=a.indexOf(b,ridxc);
		while(ridxc<a.length()-1) {
			if(ridxt!=-1) {
				ridxt=a.indexOf(b,ridxc);
				int ridx;
				ridx=ridxt;
				System.out.println(a.substring(ridxc, ridx));
				ridxc=ridxt+1;
			}else {
				ridxc=ridxc+1;
			}
		}
	}
	//文字搜索/替换模块
	
	public static void tstprime(int s){
		int n=0;
		int c=1;
		while (n==0&&c<=s) {
			if ((s%c)==0){
				if (s==2){
					System.out.println("T");
					n=1;
				}else if (c==s) {
					System.out.println("T");
					n=1;
				}else if (c==1) {
					c=c+1;
				}else {
					System.out.println("F");
					n=1;
				}	
			}else {
				c=c+1;
			}
		}
	}
	//质数判断模块
	
}
