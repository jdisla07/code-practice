package medium;

public class EuclideanDistance {
    public static double findMinDistance(int[][] p) {
        double mintDist = Double.MAX_VALUE;
        for (int i=0;i<p.length;i++) {
            double x = p[i][0];
            double y = p[i][1];
            for(int j=i+1;j< p.length;j++){
                double a = p[j][0];
                double b = p[j][1];
                double dist = findEuclideanDistance(x,y,a,b);
                if(dist < mintDist)
                    mintDist = dist;
            }

        }
        return mintDist;
    }

    public static double findEuclideanDistance(double x, double y, double a, double b){
        return Math.sqrt(((x - a) * (x - a)) + ((y - b) * (y - b)));
    }

    public static void main(String[] args) {
        int[][] vec = {{0, 11}, {-7, 1}, {-5, -3}};
        System.out.println(findMinDistance(vec));
    }
}
