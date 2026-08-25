class Solution {
    public long elevatorRequests(int n, int start, int[][] requests) {
        int m = requests.length;
        int total = 1 << m;

        long[][] dp = new long[total][m];

        for (int i = 0; i < total; i++) {
            java.util.Arrays.fill(dp[i], Long.MAX_VALUE);
        }

        // First request
        for (int i = 0; i < m; i++) {
            long time = Math.max(
                (long) requests[i][0],
                Math.abs(start - requests[i][1])
            );

            dp[1 << i][i] = time;
        }

        // DP
        for (int mask = 1; mask < total; mask++) {
            for (int last = 0; last < m; last++) {

                if (dp[mask][last] == Long.MAX_VALUE)
                    continue;

                for (int next = 0; next < m; next++) {

                    if ((mask & (1 << next)) != 0)
                        continue;

                    long move = Math.abs(
                        requests[last][1] - requests[next][1]
                    );

                    long reach = dp[mask][last] + move;

                    long time = Math.max(
                        reach,
                        (long) requests[next][0]
                    );

                    int newMask = mask | (1 << next);

                    dp[newMask][next] =
                        Math.min(dp[newMask][next], time);
                }
            }
        }

        long ans = Long.MAX_VALUE;
        int full = total - 1;

        for (int last = 0; last < m; last++) {
            ans = Math.min(ans, dp[full][last]);
        }

        return ans;
    }
}
