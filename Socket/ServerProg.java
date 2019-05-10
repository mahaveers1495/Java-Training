import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

public class ServerProg
{
	private Socket socket = null;
	private ServerSocket server = null;
	private DataInputStream in = null;
	
	public ServerProg(int port)
	{
		try
		{
			server = new ServerSocket(port);
			System.out.println("Server Started");
			
			System.out.println("waiting for client");
			
			socket = server.accept();
			System.out.println("client acceted");
			
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			
			String line ="";
					
			while(!line.equals("over"))
			{
				try
				{
					line = in.readUTF();
					System.out.println(line);
				}
				catch(IOException i)
				{
					System.out.println(i);
				}
			}
			System.out.println("closing connection");
			socket.close();
			in.close();
		}
			catch(IOException i)
				{
					System.out.println(i);
				}
		}	
		public static void main(String args[])
		{
			ServerProg sp = new ServerProg(2000);
		}
}

					