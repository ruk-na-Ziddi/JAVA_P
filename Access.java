import java.util.*;
public class Access {
	static Map<String,List<String>> rastas=FileSpike.routes;
	public static void main(String[] args) {
		Set<String> keys = rastas.keySet();
		for (String src: keys) {
			System.out.print(src +" >");
		}
	}
}