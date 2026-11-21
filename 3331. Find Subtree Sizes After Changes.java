import java.util.Arrays;

class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;

        // Build the original tree: head[u] points to u's first child.
        int[] head = new int[n];
        int[] next = new int[n];
        Arrays.fill(head, -1);

        for (int node = 1; node < n; node++) {
            int p = parent[node];
            next[node] = head[p];
            head[p] = node;
        }

        int[] newParent = parent.clone();
        int[] latest = new int[26];
        int[] previous = new int[n];
        Arrays.fill(latest, -1);

        int[] order = new int[n];
        int orderSize = 0;

        // An exit marker is ~node, allowing iterative DFS.
        int[] stack = new int[2 * n];
        int top = 0;
        stack[top++] = 0;

        while (top > 0) {
            int entry = stack[--top];

            if (entry < 0) {
                int node = ~entry;
                int letter = s.charAt(node) - 'a';
                latest[letter] = previous[node];
                continue;
            }

            int node = entry;
            int letter = s.charAt(node) - 'a';

            // latest[letter] is the nearest matching ancestor.
            if (node != 0 && latest[letter] != -1) {
                newParent[node] = latest[letter];
            }

            order[orderSize++] = node;
            previous[node] = latest[letter];
            latest[letter] = node;

            stack[top++] = ~node; // Restore latest after visiting children.
            for (int child = head[node]; child != -1; child = next[child]) {
                stack[top++] = child;
            }
        }

        int[] answer = new int[n];
        Arrays.fill(answer, 1); // Each subtree contains its own root.

        // Children appear after their original ancestors in order.
        // A new parent is also an original ancestor, so reverse order
        // processes every child before its new parent.
        for (int i = orderSize - 1; i > 0; i--) {
            int node = order[i];
            answer[newParent[node]] += answer[node];
        }

        return answer;
    }
}
