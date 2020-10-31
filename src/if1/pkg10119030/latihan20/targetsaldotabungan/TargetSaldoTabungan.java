package if1.pkg10119030.latihan20.targetsaldotabungan;
import java.util.Locale;
import java.util.Scanner;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :
 */
public class TargetSaldoTabungan {
    static Scanner scan = new Scanner(System.in);
    Locale locale = Locale.forLanguageTag("id");
    Double saldo, bunga, target;
        private void masukkanSaldo(){
        System.out.print("Saldo Awal : Rp. ");
        saldo = Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
        System.out.print("Bunga/Bulan(%) : ");
        bunga = scan.nextDouble();
        System.out.print("Saldo Target : Rp. ");
        target = Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
    }
    private void hitungBunga(){
        bunga /= 100;
    }
    private void tampilSaldo(){
        int num = 1;
                
        while(saldo<= target){
            saldo = saldo + (saldo * bunga);
            System.out.print("Saldo di bulan ke-"+(num++)+" Rp. ");
            System.out.printf(locale, "%,0f%n", saldo);
        }
    }
    public static void main(String[] args){
        TargetSaldoTabungan data = new TargetSaldoTabungan();
        data.masukkanSaldo();
        data.hitungBunga();
        data.tampilSaldo();
        System.out.println("(Developed by : Rendy Dermawan)");
    }
}
