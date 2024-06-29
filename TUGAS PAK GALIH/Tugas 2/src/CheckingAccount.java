public class CheckingAccount extends AccountTest {
    String name;
    double tarikSaldo;
    double balance;

    public void tarikSaldo(double amount) {
        if (amount < 0) {
            System.out.println("Peringatan: Jumlah penarikan saldo tidak boleh negatif.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Saldo berhasil ditarik. Sisa saldo: " + balance);
        } else {
            System.out.println("Saldo anda tidak mencukupi.");
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(int newBalance){
        this.balance = newBalance;
    }

    public double getTarikSaldo(){
        return tarikSaldo;
    }
    public void setTarikSaldo(int newTarikSaldo){
        this.tarikSaldo = newTarikSaldo;
    }
}
