package json;

public class Test {
	public static boolean check(int game[], int index, int leap, int n) {
		if (index > n - 1) {
			return true;
		}
		if (game[index] == 1) {
			return false;
		}
		boolean notake = false;
		boolean take = false;
		if (game[index] == 0) {
			notake = check(game, index + 1, leap, n);
			take = check(game, index + leap, leap, n);
		}
		return notake || take;
	}
	/*
	 1
9 4
0 1 1 0 0 1 1 0 
	 * */
	public static void main(String[] args) {
		int game[] = {0, 1, 1, 0, 0, 1, 1, 0};
		System.out.println(check(game, 0, 4, game.length));
	}
}
