  public int[][] kClosest(int[][] points, int k) {
     
        Arrays.sort(points, (a,b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]));
        return Arrays.copyOf(points, k);
}
