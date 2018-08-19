import java.io.*;
import java.net.*;
class Server { 
public static void main(String args[]) throws Exception  {
int s,p;
String m;
ServerSocket ssocket = new ServerSocket();
while(true)
{
BufferedReader fromclient = new Bufferedreader(ssocket.accept(5040));
DataOutputReader outtoclient = new DataOutputReader(ssocket.getOutputStream());
 s=fromclient.readLine();
int i=3;
while(i!=0)
{
r=s%10;
s=s/10;
i--;
}
m=r.toString();
outtoclient.writeBytes(m);
}
}
}


