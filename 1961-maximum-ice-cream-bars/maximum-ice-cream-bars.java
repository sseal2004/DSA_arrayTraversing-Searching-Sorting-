class Solution {
    public int maxIceCream(int[] costs, int coins) {
       
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int cost : costs)
            pq.offer(cost);

        int count = 0;

        while (!pq.isEmpty() && coins >= pq.peek()) {
            coins -= pq.poll();
            count++;
        }

        return count;
    }
}