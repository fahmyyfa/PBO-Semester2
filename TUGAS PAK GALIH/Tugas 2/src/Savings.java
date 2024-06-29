public class Savings {
    private int termBulan;
    private double tingkatBunga;

    public Savings(int termBulan) {
        if (termBulan < 1 || termBulan > 60) {
            System.out.println("Masa harus antara 1 dan 60 bulan.");
        }
        this.termBulan = termBulan;
        setTingkatBunga();
    }

    private void setTingkatBunga() {
        if (termBulan >= 0 && termBulan <= 11) {
            tingkatBunga = 0.5;
        } else if (termBulan >= 12 && termBulan <= 23) {
            tingkatBunga = 1.0;
        } else if (termBulan >= 24 && termBulan <= 35) {
            tingkatBunga = 1.5;
        } else if (termBulan >= 36 && termBulan <= 47) {
            tingkatBunga = 2.0;
        } else {
            tingkatBunga = 2.5;
        }
    }

    public void tampilkanTingkatBunga() {
        System.out.println("Tingkat bunga untuk obligasi dengan masa " + termBulan + " bulan: " + tingkatBunga + "%");
    }

    public void perolehBunga() {
        if (termBulan == 0) {
            System.out.println("Obligasi ini telah jatuh tempo. Tidak akan ada bunga lagi yang diperoleh.");
        } else {
            double bungaDiperoleh = (tingkatBunga / 100) * termBulan;
            System.out.println("Bunga yang diperoleh bulan ini: $" + bungaDiperoleh);
            termBulan--;
        }
    }

    public int getTermBulan() {
        return termBulan;
    }

    public double getTingkatBunga() {
        return tingkatBunga;
    }
}
