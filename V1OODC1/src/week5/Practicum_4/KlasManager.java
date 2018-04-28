package week5.Practicum_4;
import java.util.*;
import java.io.*;

public class KlasManager {

	public void klasOpslaan(Klas deKlas) throws IOException {
		FileOutputStream fos = new FileOutputStream("klas.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(deKlas);
		oos.close();
	}

	public Klas klasInladen() throws IOException, ClassNotFoundException {
		Klas deKlas = null;

		FileInputStream fis = new FileInputStream("klas.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();
		deKlas = (Klas) obj;
		ois.close();
		return deKlas;
	}

}
