import java.util.*;

public class meanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] heights = new double[11];
        double sum =0;


        for(int i=0;i<heights.length;i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        double mean = sum /11;
        System.out.println(mean);
        
    }
}