class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int carsNum = position.length;
        double[][] positionTimePair = new double[carsNum][2];
        double lastCarTime = Double.MIN_VALUE;
        int fleetNumber = 1;

        for (int i = 0; i < carsNum; i++){
            double[] pair = {position[i], (target - position[i])/(double)speed[i]};
           positionTimePair[i] = pair;
        }

        Arrays.sort(positionTimePair, (a, b) -> (int)a[0] - (int)b[0]);

        for (int i = carsNum - 1; i >= 0; i--){
            double currentTime = positionTimePair[i][1];
            if (lastCarTime == Double.MIN_VALUE)
                lastCarTime = (currentTime);
            if (currentTime > lastCarTime){
                lastCarTime = (currentTime);
                fleetNumber++;
            }
        }

        return fleetNumber;
    }

}
