import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerCode {
	public static void main(String[] args) throws IOException {
			ServerSocket listner = new ServerSocket(4000);
			System.out.println("Server is read ......");
			Socket ssoc = listner.accept();
			InputStream is = ssoc.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println(dis.readUTF());
			
			OutputStream os = ssoc.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			System.out.println("Enter message.....");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			dos.writeUTF(str);
		}
}
