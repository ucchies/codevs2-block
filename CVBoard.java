import java.util.ArrayList;


public class CVBoard {
	
	private ArrayList<ArrayList<Integer>> board;
	private int width;
	private int height;
	
	CVBoard(int w, int h) {
		this.board = new ArrayList<ArrayList<Integer>>(w);
		this.width = w;
		this.height = h;
		for(int i = 0; i < w; i++) {
			board.add(new ArrayList<Integer>(h));
		}
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setValue(int x, int y, int num) {
		this.board.get(x).set(y, Integer.valueOf(num));
	}
	
	public int getValue(int x, int y) {
		return this.board.get(x).get(y).intValue();
	}
	
}
