//Given a route containing 4 directions (E,W,N,S) find the shortest path to reach destination.
//WNEENESENNN
//Formula for finding Shortest Path= Math.sqrt((x2-x1)^2  +  (y2-y2)^2)
//N=y+1
//S=y-1;
//W=x-1;
//E=X+1;


package String;

public class FindShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }

    private static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //North
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            }
        }

        int x_2 = x * x;   //x_2=(x-x2)^2 but here value of x2 =0 so, indirectly x_2 =x*x;
        int y_2 = y * y;    //y_2=(y-y2)^2 but here value of y2 =0 so, indirectly y_2 =y*y;

        return (float) Math.sqrt(x_2 + y_2);
    }
}
