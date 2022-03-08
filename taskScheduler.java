class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> waitingQueue = new LinkedList<>();
        Queue<Integer> queueTime = new LinkedList<>();
        int time = 0;

        int[] charCount = new int[26];
        for (char ch:tasks)
            charCount[ch-'A']++;

        for (int num:charCount)
            if (num != 0)
                pq.add(num);

        while (!pq.isEmpty() || !waitingQueue.isEmpty()){
            time++;

            if (!pq.isEmpty()){
                int cnt = pq.poll() - 1;
                if (cnt != 0){
                    waitingQueue.add(cnt);
                    queueTime.add(time + n);
                }
            }

            if (!waitingQueue.isEmpty()){
                if (queueTime.peek() == time){
                    queueTime.remove();
                    int popped = waitingQueue.remove();
                    pq.add(popped);
                }
            }
        }

        return time;
    }
}
