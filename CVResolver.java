import java.util.ArrayList;


public class CVResolver {

	private int packsize;
	private int reqSum;
	private int packpcs;
	
	private CVBoard board;
	private ArrayList<CVPack> packs;
	
	public CVResolver(int w, int h, int size, int sum, int pcs) {
		this.packsize = size;
		this.reqSum = sum;
		this.packpcs = pcs;
		
		this.board = new CVBoard(w, h);
		this.packs = new ArrayList<CVPack>(pcs);
	}
	
	public int getPackSize() {
		return this.packsize;
	}
	
	public int getPackPcs() {
		return this.packpcs;
	}
	
	public int getReqSum() {
		return this.reqSum;
	}
	
	public void setPack(CVPack pack) {
		this.packs.add(pack);
	}
	
	public void flushPacks() {
		this.packs.clear();
	}
	
	public void resolve() {
		for (CVPack pack : this.packs) {
			this.output(this.board.getWidth() - pack.getSize(), 2);
		}
		this.flushPacks();
	}
	
	private void output(int x, int rot) {
		System.out.printf("%d %d\n", x, rot);
		System.out.flush();
	}
	
}
