public class TestTableaux2D {
    public static void main(String[] args) {
        double[][] a = { {1, 2, 3}, {4, 5, 6} };
        double[][] b = { {10, 20, 30}, {40, 50, 60} };
        double[][] irregulier = { {1, 2}, {3}, {4, 5, 6} };
        double[][] autreTaille = { {1, 2}, {3, 4} };

        System.out.println("--- affiche(a) ---");
        Tableaux2D.affiche(a);

        System.out.println("\n--- regulier ---");
        System.out.println("a regulier ? " + Tableaux2D.regulier(a));
        System.out.println("irregulier regulier ? " + Tableaux2D.regulier(irregulier));

        System.out.println("\n--- sommeLignes(a) ---");
        double[] s = Tableaux2D.sommeLignes(a);
        for (double v : s) {
            System.out.print(v + " ");
        }
        System.out.println();

        System.out.println("\n--- somme(a, b) ---");
        double[][] r = Tableaux2D.somme(a, b);
        if (r != null) Tableaux2D.affiche(r);

        System.out.println("\n--- cas invalides ---");
        System.out.println("somme(a, irregulier) = " + Tableaux2D.somme(a, irregulier));
        System.out.println("somme(a, autreTaille) = " + Tableaux2D.somme(a, autreTaille));
    }
}
