import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Launch2 {
	public static void main(String[] args) throws IOException{
		Cricketer c1 = new Cricketer("Sachin",41,"india",40000,1000);
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCountry());
		System.out.println(c1.getRuns());
		System.out.println(c1.getWickets());
		
		String path = "C:\\IOProgrmas";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);
		System.out.println("Data is written on the HDD");
	}

}
