package lambdaExpression;
import java.io.FileOutputStream; 
public class FileOutStream 
{	
    public static void main(String args[])
    {  
    	// TODO Auto-generated method stub
           try
           {    
        	   FileOutputStream fout=new FileOutputStream("E:\\testout.txt");    
        	   fout.write(97);    
        	   fout.close();    
        	   System.out.println("successfully stored");    
            }
           catch(Exception e)
            {
            	System.out.println(e);
            }    
      }    
}  