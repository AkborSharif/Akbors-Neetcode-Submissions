class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.compute(num, (c, v) -> v == null ? 1 : v + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int key : map.keySet()) {
            pq.add(key);
            if (pq.size()> k) {
                pq.poll();
            }
        }
        int[] sol = new int[k];
        for (int i = 0; i < k; i++) {
            sol[i] = pq.poll();
        }

        return sol;
    }
}
