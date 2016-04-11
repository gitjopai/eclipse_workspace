import java.util.Arrays;
import java.util.stream.*;

public class AsciiPlotter
{
    public static final int WIDTH = 48;
    public static final int HEIGHT = 48;
    
    private final char[][] grid = new char[HEIGHT][WIDTH];
    
    public AsciiPlotter() {
	Stream.of(grid).forEach(line -> Arrays.fill(line, '.'));
    }
    public void set(int x, int y){
	if (x < 0)
	    return;
	if(y < 0)
	    return;
	if (x >= WIDTH)
	    return;
	if (y >= HEIGHT)
	    return;
		    
	grid[HEIGHT- y -1][x] = 'X';
    }
    @Override
    public String toString()
    {
	return Stream.of(grid)
		.map(String::new)
		.collect(Collectors.joining("\n"));
    }
    
}
