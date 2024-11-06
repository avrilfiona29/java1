package pkg1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class Tools1{
	String s1="";
	int len1=0;
	public String reverse(String s1){
                String s2="";
		len1=s1.length();
		for(int i=0;i<len1;i++){
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
		return s2;
	}
}
public class M12{
        public static void reverse2(String fname1, String fname2)throws IOException {
                File f1=new File(fname1);
                FileWriter fw1=new FileWriter(fname2);
                Scanner sc1=new Scanner(f1);
                String name="";
                String name_rev="";
                Tools1 t1=new Tools1();
                while(sc1.hasNext()){
                        name=sc1.nextLine();
                        name_rev=t1.reverse(name);
                        fw1.write(name_rev+"\n");
                        System.out.println(name_rev);
                }
                sc1.close();
                fw1.close();        
        }

        public static void main(String[] args) throws IOException {
                        reverse2("names.txt","names_out.txt");
                        reverse2("family.txt","family_out.txt");
        }

}
