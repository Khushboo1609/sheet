package greedy;

public class MinimumPlatforms {

    static int findPlatform(int arr[], int dep[], int n) {
        int needed = 1, result = 1;

        // Run a nested for-loop to find the overlap
        for (int i = 0; i < n; i++) {

            // Initially one platform is needed
            needed = 1;
            for (int j = 0; j < n; j++) {
                if (i != j)
                    // Increment plat_needed when there is an
                    // overlap
                    if (arr[i] >= arr[j] && dep[j] >= arr[i])
                        needed++;
            }

            // Update the result
            result = Math.max(needed, result);
        }
        return result;
    }
}
