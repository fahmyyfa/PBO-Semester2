import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testing CheckingAccount
        CheckingAccount account = new CheckingAccount();
        account.setName("fahmi");
        account.setBalance(1000);

        System.out.println("Nama: " + account.getName());
        System.out.println("Saldo: " + account.getBalance());

        System.out.println("Tarik Saldo: ");
        double tarikSaldo = scanner.nextDouble();
        account.tarikSaldo(tarikSaldo);

        System.out.println("Masukkan Tabungan: ");
        int tabungan = scanner.nextInt();
        System.out.println("Masukkan masa obligasi (dalam bulan): ");
        int masa = scanner.nextInt();
        Savings obligasi = new Savings(masa);

        obligasi.tampilkanTingkatBunga();
        obligasi.perolehBunga();

        double hasilTabungan = tabungan + (tabungan * obligasi.getTingkatBunga());
        System.out.println("Total : " + hasilTabungan);
        System.out.println("Sisa masa: " + obligasi.getTermBulan() + " bulan");
    }
}
