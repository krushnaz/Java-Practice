import java.util.ArrayList;
import java.util.Arrays;

public class KMeansClustering {

    // Function to calculate the mean of a cluster
    private static double mean(ArrayList<Double> cluster) {
        double sum = 0;
        for (double value : cluster) {
            sum += value;
        }
        return sum / cluster.size();
    }

    // Function to perform K-means clustering
    private static void kMeansClustering(double[] data, double[] centroids) {
        int k = centroids.length;
        ArrayList<Double>[] clusters = new ArrayList[k];
        for (int i = 0; i < k; i++) {
            clusters[i] = new ArrayList<>();
        }

        boolean converged = false;

        while (!converged) {
            // Assign data points to the nearest centroid
            for (int i = 0; i < k; i++) {
                clusters[i].clear();
            }

            for (double value : data) {
                double minDistance = Double.MAX_VALUE;
                int closestCluster = -1;

                for (int i = 0; i < k; i++) {
                    double distance = Math.abs(value - centroids[i]);
                    if (distance < minDistance) {
                        minDistance = distance;
                        closestCluster = i;
                    }
                }

                clusters[closestCluster].add(value);
            }

            // Calculate new centroids
            double[] newCentroids = new double[k];
            for (int i = 0; i < k; i++) {
                newCentroids[i] = mean(clusters[i]);
            }

            // Check for convergence
            converged = Arrays.equals(centroids, newCentroids);

            centroids = newCentroids;
        }

        // Print the clusters
        for (int i = 0; i < k; i++) {
            System.out.println("Cluster " + (i + 1) + ": " + clusters[i] + " with centroid " + centroids[i]);
        }
    }

    public static void main(String[] args) {
        double[] data = {0.1, 0.18, 0.2, 0.2, 0.21, 0.23, 0.3, 0.4, 0.5, 0.54, 0.7, 0.9, 1.1, 1.4, 1.5};
        double[] centroids = {0.21, 0.50, 0.90};
        
        kMeansClustering(data, centroids);
    }
}
