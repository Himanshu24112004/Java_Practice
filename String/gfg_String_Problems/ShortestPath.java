import java.util.Scanner;

class ShortestPath {
    String shortestPath(String S) {
        int[] dir = new int[4]; // N, S, E, W counts
        for (char c : S.toCharArray()) {
            if (c == 'N') dir[0]++;
            else if (c == 'S') dir[1]++;
            else if (c == 'E') dir[2]++;
            else if (c == 'W') dir[3]++;
        }

        int ns = dir[0] - dir[1];
        int ew = dir[2] - dir[3];

        StringBuilder sb = new StringBuilder();

        if (ew > 0) for (int i = 0; i < ew; i++) sb.append('E');
        if (ns > 0) for (int i = 0; i < ns; i++) sb.append('N');
        if (ns < 0) for (int i = 0; i < -ns; i++) sb.append('S');
        if (ew < 0) for (int i = 0; i < -ew; i++) sb.append('W');

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter direction string (e.g., NNSEW): ");
        String S = sc.nextLine();
          ShortestPath sol = new ShortestPath();
        String result = sol.shortestPath(S);
        System.out.println("Shortest path string: " + (result.isEmpty() ? "(empty - back at origin)" : result));
        sc.close();
    }
}
