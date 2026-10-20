public class Tableaux2D {

    // Classe utilitaire : on empêche l'instanciation
    private Tableaux2D() {}

    /** Affiche t, une ligne d'écran par ligne du tableau. */
    public static void affiche(double t[][]) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    /** Teste si toutes les lignes de t ont la même taille. */
    public static boolean regulier(double t[][]) {
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != t[0].length) {
                return false;
            }
        }
        return true;
    }

    /** Renvoie le tableau des sommes de chaque ligne de t. */
    public static double[] sommeLignes(double t[][]) {
        double[] res = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                res[i] += t[i][j];
            }
        }
        return res;
    }

    /**
     * Renvoie t1 + t2 si les deux tableaux sont réguliers et de mêmes
     * dimensions, null sinon.
     */
    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2) || t1.length != t2.length) {
            return null;
        }
        // Si les tableaux sont vides, ils sont de mêmes dimensions
        if (t1.length > 0 && t1[0].length != t2[0].length) {
            return null;
        }

        double[][] res = new double[t1.length][];
        for (int i = 0; i < t1.length; i++) {
            res[i] = new double[t1[i].length];
            for (int j = 0; j < t1[i].length; j++) {
                res[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return res;
    }
}
