import java.io.*;
import java.net.*;
public class ClientChat
{
public static void main(String[] args) throws Exception
{
Socket sock = new Socket("localhost",3000);
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

OutputStream ostream = sock.getOutputStream();
PrintWriter pwrite = new PrintWriter(ostream, true);

InputStream istream = sock.getInputStream();
BufferedReader receiveRead = new BufferedReader(new

InputStreamReader(istream));
System.out.println("Start The Chat, Type and Press Enter Key");

String receiveMessage, sendMessage;
while(true)
{
sendMessage = keyRead.readLine();
pwrite.println(sendMessage);
pwrite.flush();
if((receiveMessage = receiveRead.readLine())!=null)
{
System.out.println(receiveMessage);
 }
}
}
}
