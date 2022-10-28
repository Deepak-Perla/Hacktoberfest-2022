package backtracking;

    public class Maze_path {
        public static void main(String[] args) {
            int[][] maze = {{0, 1, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}};
            Maze(0, 0, maze.length - 1, maze[0].length - 1, maze, "", new boolean[maze.length][maze[0].length]);
        }

        //	T-1 => only 2 directions !! Right and down!
        public static void Maze(int r, int c, int dest_r, int dest_c, int[][] maze, String path, boolean[][] booleans) {
//
            if (r == dest_r && c == dest_c) {
                System.out.println(path);
                return;
            }

            if (r == maze.length || c == maze[0].length || maze[r][c] == 1) {
                return;
            }

            Maze(r, c + 1, dest_r, dest_c, maze, path + "R", new boolean[maze.length][maze[0].length]);
            Maze(r + 1, c, dest_r, dest_c, maze, path + "D", new boolean[maze.length][maze[0].length]);
        }
    }
