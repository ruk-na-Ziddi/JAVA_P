import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Set;



 
public class FileSpike {
	static Map<String,List<String>> routes=new Hashtable<String,List<String>>();
    public static void main(String[] args) throws Exception {
    	String string=new String(readAllBytes(get("city.txt")));
		System.out.println(string);
		String[] array=string.split("\n");
		System.out.println(array[0]);
		for(String line:array){
			String[] lineArray = line.split(",");
			List<String> cont = routes.get(lineArray[0]);
			if(cont == null){
				cont = new ArrayList<String>();
				for (int i=1;i<lineArray.length ;++i){
					cont.add(lineArray[i]);
				}
				routes.put(lineArray[0], cont);
			}
			else{
				for (int i=1;i<lineArray.length ;++i){
					if(!cont.contains(lineArray[i]))
						cont.add(lineArray[i]);
				}
			}
		}
		Set<String> keys = routes.keySet();
		for (String src: keys) {
			System.out.print(src +" >");
		}
    }
}