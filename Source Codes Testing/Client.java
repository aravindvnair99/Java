import java.io.*;
import java.net.*;
class Client { 
public static void main(String args[])  throws Exception  {
int x,y;
BufferedReader fromuser = new BufferedReader(new InputStreamReader(System.in()));

Socket socket = new Socket("localhost",5040);
BufferedReader fromserver = new BufferedReader(new InputStreamReader(socket.getInputStream()));
System.out.println("enter a 5 digit number:");
x=fromuser.read();
DataOutputReader outtoserver = new DataOutputReader(socket.getOutputStream());
y=outtoserver.writeBytes(x);
System.out.println("the 3rd digit of the given number is:" + y);
socket.close();
}
}

