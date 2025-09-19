import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MatrixSymmetry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter matrix size n (for n x n): ");
        String line = br.readLine();
        if (line == null) {
            System.out.println("Invalid size.");
            return;
        }
        int n;
        try {
            n = Integer.parseInt(line.trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid size.");
            return;
        }

        int[][] a = new int[n][n];
        System.out.println("Enter matrix rows (each row on a line, elements separated by space):");
        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            if (row == null) { System.out.println("Insufficient rows."); return; }
            String[] parts = row.trim().split("\\s+");
            if (parts.length != n) { System.out.println("Each row must have " + n + " elements."); return; }
            for (int j = 0; j < n; j++) {
                try {
                    a[i][j] = Integer.parseInt(parts[j]);
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid number: " + parts[j]);
                    return;
                }
            }
        }

        boolean symmetric = true;
        for (int i = 0; i < n && symmetric; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i][j] != a[j][i]) { symmetric = false; break; }
            }
        }

        System.out.println("Matrix is " + (symmetric ? "symmetric." : "not symmetric."));
    }
}
