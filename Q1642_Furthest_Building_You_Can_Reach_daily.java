import java.util.PriorityQueue;

public class Q1642_Furthest_Building_You_Can_Reach_daily {
    public static void main(String[] args) {
        int[] heights = { 4, 12, 2, 7, 3, 18, 20, 3, 19 };
        int bricks = 10;
        int ladders = 2;
        System.out.println(furthestBuilding(heights, bricks, ladders));
    }

    static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> usedLadder = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff <= 0) {
                continue;
            }
            if (ladders > 0) {
                usedLadder.add(diff);
                ladders--;
            } else if (!usedLadder.isEmpty() && diff > usedLadder.peek()) {
                bricks -= usedLadder.remove();
                usedLadder.add(diff);
            } else {
                bricks -= diff;
            }

            if (bricks < 0) {
                return i;
            }
        }

        return heights.length - 1;
    }
}
