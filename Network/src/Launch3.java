import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Launch3 {
	public static void main(String[] args) throws Exception{
		String Path = "C:\\IOProgrmas\\Cricketer.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricketer c1 = (Cricketer)ois.readObject();
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCountry());
		System.out.println(c1.getRuns());
		System.out.println(c1.getWickets());

	}
}
