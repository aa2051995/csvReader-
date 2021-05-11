import java.io.IOException;
import java.util.List;

public class CsvReader {
public static void main(String[] args) {
	PyramidsCSVImp pyramidsCSVImp = new PyramidsCSVImp();
	List<Pyramid> pyramids;
	try {
		pyramids = pyramidsCSVImp.readCsv("C:\\Users\\Ahmed mansour\\Downloads\\pyramids.csv");
		int i =0;
		for(Pyramid pyramid: pyramids) {
			System.out.println("#   "+(++i)+" "+pyramid);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
