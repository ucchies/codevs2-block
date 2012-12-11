
import java.util.Scanner;

/**
 * CodeVS 2012 Java sample
 */
public class CVMain {
	
	private static CVResolver resolver;
	
	private static final String END = "END";
	
	public static void main(String[] arg){
		Scanner scan = new Scanner(System.in);
		resolver = new CVResolver(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
				
		String endstr = null;
		
		for (int pcs = resolver.getPackPcs(); pcs > 0; pcs--) {
			CVPack pack = new CVPack(resolver.getPackSize());
			for (int i = 0; i < pack.getSize(); i++) {
				for (int j = 0; j < pack.getSize(); j++) {
					pack.setValue(i, j, scan.nextInt());
				}
			}
			endstr = scan.next();
			resolver.setPack(pack);
		}
		
		resolver.resolve();
		
	}
}
