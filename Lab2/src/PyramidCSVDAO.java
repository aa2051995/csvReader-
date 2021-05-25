import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public interface PyramidCSVDAO {
	public List<Pyramid> readCsv(List<Pyramid> pyramids,String csv)throws IOException;
    public  Pyramid createPyramid( String[] pyramd)throws NumberFormatException, ParseException;
    
}
