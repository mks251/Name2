
public class Xname2 {
	public static void main(String args[]){
		Rreader r = new Rreader();
		r.Scan();
		r.i = count(r.i);
		r.k = count(r.k);
		r.Scan(r.i, r.k);
	}
	private static int count(int x){
	x = x + 1;
	x = x * 10;
	return x;
	
	}
}
