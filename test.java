package chapter10_6;
import java.io.*;
public class test {

	public static void main(String[] args) {
		File f1=new File("a.txt");
		File f2=new File("b.txt");
		char c[] =new char[19];
		try {
			Writer out=new FileWriter(f2,true);
			Reader in =new FileReader(f1);
			int n=-1;
			while ((n=in.read(c))!=-1) {
				out.write(c,0,n);
			}
			out.flush();
			out.close();
			in.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
