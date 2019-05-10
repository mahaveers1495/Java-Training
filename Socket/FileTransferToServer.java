import java.io.*;
import java.net.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStream;

public class FileTransferToServer
{
	public static void main(String args[])throws Exception
	{
		ServerSocket ss = new ServerSocket(5000);
		System.out.println("Server ready for connection");
		
		Socket s = ss.accept();
		
		System.out.println("Connection is successful and waiting for file");
		
		InputStream is = s.getInputStream();
		BufferedReader read = new BufferedReader(new InputStreamReader(is));
		String fname = read.readLine();
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os,true);
		
		String str;
		
		while((str = br.readLine()) != null)
		{
			pw.println(str);
		}
			s.close();
			ss.close();
			pw.close();
			read.close();
			br.close();
	}
}
		