
public class EmbaralhadorService {
	
	public String embaralhar(String line) {
		line = line.replace("a", "4");
		line = line.replace("e", "3");
		line = line.replace("i", "1");
		line = line.replace("o", "0");
		line = line.replace("u", "2");
		
		line = line.replace("A", "4");
		line = line.replace("E", "3");
		line = line.replace("I", "1");
		line = line.replace("O", "0");
		line = line.replace("U", "2");
		return line;
	}
	
}
