import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.sun.source.tree.WhileLoopTree;

public class PyramidsCSVImp  implements PyramidCSVDAO{
	private List<Pyramid> pyramids;
public PyramidsCSVImp() {
	pyramids = new ArrayList<Pyramid>();
}
	@Override
	public List<Pyramid> readCsv(String csvpath) throws IOException {
		File file = new File(csvpath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        line = bufferedReader.readLine();
        System.out.println(line);
        do {
	        	try {
					line = bufferedReader.readLine();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
	        	if(line!= null)
	        	{
	        		String cols[] = line.split(",",-1);
	        		System.out.println(line);
	        		try {
						pyramids.add(createPyramid(cols));
					} catch (NumberFormatException | ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	}
        	
        }while(line != null);
     
        fileReader.close();
        bufferedReader.close();
        return pyramids;
        
        
	}

	
	
	@Override
	public Pyramid createPyramid(String[] meta) throws NumberFormatException, ParseException {
		Pyramid pyramid =  new Pyramid(meta[0],
			meta[1], 
			meta[2],
			Double.valueOf(meta[3]),
			meta[4],
			NumberFormat.getInstance(Locale.GERMAN).parse(meta[5] != "" ? meta[5] : "-1").doubleValue(), 
			NumberFormat.getInstance(Locale.GERMAN).parse(meta[6] != "" ? meta[6] : "-1").doubleValue(),
			NumberFormat.getInstance(Locale.GERMAN).parse(meta[7] != "" ? meta[7] : "-1").doubleValue(), 
			NumberFormat.getInstance(Locale.GERMAN).parse(meta[8] != "" ? meta[8] : "-1").doubleValue(),
			NumberFormat.getInstance(Locale.GERMAN).parse(meta[9] != "" ? meta[9] : "-1").doubleValue(), 
			NumberFormat.getInstance(Locale.GERMAN).parse(meta[10] != "" ? meta[10] : "-1").doubleValue(),
			NumberFormat.getInstance(Locale.GERMAN).parse(meta[11] != "" ? meta[11] : "-1").doubleValue(), 
			meta[12], 
			meta[13],
			meta[14], 
			meta[15]);
		return pyramid;
	}

}
