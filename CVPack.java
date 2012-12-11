import java.util.ArrayList;


public class CVPack {
	
	private ArrayList<ArrayList<Integer>> pack;
	private int size;
	
	CVPack(int size) {
		pack = new ArrayList<ArrayList<Integer>>(size);
		for (int i = 0; i < size; i++) {
			pack.add(new ArrayList<Integer>(size));
		}
	}
	
	public int getSize() {
		return this.size;
	}
	
	/*
	public boolean setValue(int[] args) {
		for(int num : args) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; i++) {
					pack.get(i).set(j, Integer.valueOf(num));
				}
			}
		}
		return true;
	}
	*/
	public void setValue(int a, int b, int val) {
		this.pack.get(a).set(b, val);
	}
	
	public int getValue(int a, int b) {
		return this.pack.get(a).get(b).intValue();
	}
}
