class Solution {

    static void hanoi(int n, char from, char to, char aux) {

        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // Step 1: Move n-1 disks from source to helper
        hanoi(n - 1, from, aux, to);

        // Step 2: Move the biggest disk to destination
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // Step 3: Move n-1 disks from helper to destination
        hanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        hanoi(3, 'A', 'C', 'B');
    }
}