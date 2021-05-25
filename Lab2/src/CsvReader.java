import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class CsvReader {
public static void main(String[] args) {
	
	    List<Pyramid> pyramids = pyramidsManpulation.readCsv();
	    
		int i =0;
		pyramidsManpulation.Sort(pyramids);
		for(Pyramid pyramid: pyramids) {
			System.out.println("#   "+(++i)+" "+pyramid);
		}
		
		Map<String, Integer> sites = pyramidsManpulation.buildPyramidsMap(pyramids);
		for(String numsofsites : sites.keySet()) {
			System.out.println("site: " +numsofsites+" "+sites.get(numsofsites));
		}
	
	
}

}
