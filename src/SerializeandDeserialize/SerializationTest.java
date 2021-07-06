

package SerializeandDeserialize;

	import java.io.*;
	public class SerializationTest implements Serializable {
	   int a = 1;
	   transient int b = 2;
	   transient float c = 3.5f;
	   public static void main(String[] args) throws Exception {
	      SerializationTest obj = new SerializationTest();
	      // serialization
	      FileOutputStream fos = new FileOutputStream("serialization.txt");
	      ObjectOutputStream oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj);
	      // de-serialization
	      FileInputStream fis = new FileInputStream("serialization.txt");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      SerializationTest test = (SerializationTest)ois.readObject();
	      System.out.println("a = " + test.a);
	      System.out.println("b = " + test.b);
	      System.out.println("c = " + test.c);
	   }
	}

