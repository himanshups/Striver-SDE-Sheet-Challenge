public class Solution

{

    public static int[][] floodFill(int[][] image, int x, int y, int newColor)

    {

        if (newColor == image[x][y])

        {

            return image;

        }

        int rows = image.length;

        int cols = image[0].length;

        int source = image[x][y];

        dfs(image, x, y, newColor, rows, cols, source);

        return image;

    }

    private static void dfs(int[][] image, int x, int y, int newColor, int rows, int cols, int source)

    {

        if (x < 0 || x >= rows || y < 0 || y >= cols)

        {

            return;

        } else if (image[x][y] != source)

        {

            return;

        }

        image[x][y] = newColor;

        dfs(image, x - 1, y, newColor, rows, cols, source); // TOP

        dfs(image, x + 1, y, newColor, rows, cols, source); // DOWN

        dfs(image, x, y - 1, newColor, rows, cols, source); // LEFT

        dfs(image, x, y + 1, newColor, rows, cols, source); // RIGHT

    }

}