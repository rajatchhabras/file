package file;
import java.util.*;
import java.io.*;

public class file {
	static ArrayList<File> fil;
	
	static void  recursion(File[] filed,ArrayList<File> fil)
	 {
		 
	 if(filed.length==0)
		System.out.println("the list is empty "); 
	 else
		
		 for(File afile :filed)
		 {
			 if(afile.isFile())
			 {
			 System.out.println(afile.getName()+" "+afile.getPath());//for printing in console
			 fil.add(afile);
			 }
			 else if(afile.isDirectory()) 
				 recursion(afile.listFiles(), fil);//as afile.listFiles access
			// is a array of files containing inside directory it will be received by file
			// type array,a and a array list is there for storing// 
					 

	}
	 }

	public static void main(String[] args) throws IOException{
		FileWriter f=new FileWriter("C:\\Users\\DELL\\eclipse-workspace\\file\\src\\file\\abc.txt",true);
	 BufferedWriter bf=new BufferedWriter(f);
	 Scanner sc=new Scanner(System.in);
	 String filename=sc.nextLine();
	 bf.write(filename);
	 FileReader r=new FileReader("C:\\Users\\DELL\\eclipse-workspace\\file\\src\\file\\abc.txt");
	 BufferedReader br=new BufferedReader(r);
	 bf.close();
	 br.close();
	 File dir=new File(filename);//casting the string link into file type/
	 File []files=dir.listFiles();//array to save all the files and folders
	 fil=new ArrayList<>();
	 recursion(files,fil);
	 FileWriter fe=new FileWriter("C:\\Users\\DELL\\eclipse-workspace\\file\\src\\file\\def.txt",true);
	 BufferedWriter bfe=new BufferedWriter(fe);
	 for(File x :fil)
	 {
		 bfe.write(x.getName()+","+x.getPath()+"\n");
	 
	 }
	 bfe.close();
	}
	
	
	
}
