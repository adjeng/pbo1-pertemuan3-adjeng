package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000; // di file .ppt slide 30 ini sebenarnya 53000
        double uangDiDompet = 50000; // dan ini 25000 karena disini disuruh Condition2 bernilai True sehingga Statment2 jalan

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, cukup jajan anda");
        }else if (uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang cukup, angsul : "+angsul);
        }else{
            System.out.println("Uang pas.. Uwuuu...");
        }
    }
}
