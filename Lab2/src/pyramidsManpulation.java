import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pyramidsManpulation {
    public static void Sort(List<Pyramid> pyramids) {
    	pyramids.sort(new Comparator<Pyramid>() {

			@Override
			public int compare(Pyramid o1, Pyramid o2) {
				
				return o1.getHeight() > o2.getHeight()?1:-1;
			}
		});
    }
   public static Map<String, Integer>  buildPyramidsMap(List<Pyramid> pyramids){
	   Map<String, Integer> pyrmids_map = new HashMap<>();
	   for (Pyramid pyramid : pyramids) {
		   Integer sitesNumofPyramids = pyrmids_map.containsKey(pyramid.getSite()) ? pyrmids_map.get(pyramid.getSite())+1:1; 
		   pyrmids_map.put(pyramid.getSite(), sitesNumofPyramids);
	   }
	   return pyrmids_map;
		
   }
   public static List<Pyramid> readCsv() {
	   PyramidsCSVImp pyramidsCSVImp = new PyramidsCSVImp();
	   List<Pyramid> pyramids = new ArrayList<Pyramid>();
	   try {
		Thread myThread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						pyramidsCSVImp.readCsv(pyramids,"C:\\Users\\Ahmed mansour\\Downloads\\pyramids.csv");
					    System.out.println("list length"+pyramids.size());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					
				}
			});
		myThread.start();
		myThread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return pyramids;
   }
	

}
