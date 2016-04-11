public class AsciiPlotter {
	public static final int WIDTH = 48;
	public static final int HEIGHT = 48;

	private final char[][] grid = new char[HEIGHT][WIDTH];

	public AsciiPlotter() {
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < HEIGHT; j++) {
				grid[i][j] = '.';
			}
		}
	}

	public void set(int x, int y) {
		if (x < 0)
			return;
		if (y < 0)
			return;
		if (x >= WIDTH)
			return;
		if (y >= HEIGHT)
			return;

		grid[HEIGHT - y - 1][x] = 'X';
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < HEIGHT; j++) {
				sb.append(grid[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
