import java.io.InputStream;
import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		String result = null;
		try (InputStream inputStream = Runtime.getRuntime().exec("id -u").getInputStream();
				Scanner s = new Scanner(inputStream).useDelimiter("\\A")) {
			result = s.hasNext() ? s.next() : null;
		} catch (IOException e) {
			e.printStackTrace();
		}

		int uid = Integer.parseInt(result.trim());
		if (uid != 0) {
			System.out.println("Please run this program as root");
			System.exit(1);
		}

		System.out.println("I am elevated");
	}
}