package String;

public class ShortestPathFinder {
    public static void main(String[] args) {
        String route = "WNEENESENNN";
        System.out.println(shortestPath(route));
    }
    public static float shortestPath(String str){
        int x = 0 , y = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == 'E')
                x++;
            else if (c == 'W')
                x--;
            else if(c == 'N')
                y++;
            else 
                y--;
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
}
