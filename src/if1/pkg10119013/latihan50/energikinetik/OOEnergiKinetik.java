/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan50.energikinetik;

/**
 *
 * @author Fiona Avila
 */


public class OOEnergiKinetik {
    
    private double massaBolaGr = 145;
    private double grKeKg = 0.001;
    private double kecepatan = 25;
    
    public double getMassaBolaGr(){
        return massaBolaGr;
    }
    
    public void setMassaBolaGr(double massaBolaGr){
        this.massaBolaGr = massaBolaGr;
    }
    
    public double getGrKeKg(){
        return grKeKg;
    }
    
    public void setGrKeKg(double grKeKg){
        this.grKeKg = grKeKg;
    }
    
    public double getKecepatan(){
        return kecepatan;
    }
    
    public void setKecepatan(double kecepatan){
        this.kecepatan = kecepatan;
    }
    
    public double tukarMassaBolaKg(){
        double massaBolaKg = massaBolaGr * grKeKg;
        return massaBolaKg; 
    }
    
    public double hitungEnergiKinetik(double massaBolaKg){
        double kecepatanKuadrat = kecepatan * kecepatan;
        double energiKinetik = 0.5 * massaBolaKg * kecepatanKuadrat;
        return energiKinetik;
    }
    
    public double hitungUsahaPadaBola(double massaBolaKg){
        double kecepatanAwal = 0;
        double kecepatanAkhir = kecepatan - kecepatanAwal;
        double kecepatanAwalAkhir = (kecepatanAkhir*kecepatanAkhir) - (kecepatanAwal*kecepatanAwal);
        double usaha = 0.5 * massaBolaKg * kecepatanAwalAkhir;
        return usaha;
    }
    
    public static void main(String[] args) {
        OOEnergiKinetik oo = new OOEnergiKinetik();
        double massaBolaGr = oo.getMassaBolaGr();
        double massaBolaKg = oo.tukarMassaBolaKg();
        double kecepatan = oo.getKecepatan();
        double energiKinetik = oo.hitungEnergiKinetik(massaBolaKg);
        double usaha = oo.hitungUsahaPadaBola(massaBolaKg);
        System.out.println("DIKETAHUI : ");
        System.out.println("Massa bola = " + massaBolaGr + " gr" + " = " + massaBolaKg + " kg");
        System.out.println("Kecepatan lempar = " + kecepatan + " m/s");
        System.out.println();
        System.out.println("PERTANYAAN : ");
        System.out.println("a. Energi kinetik?");
        System.out.println("b. Usaha pada bola jika dimulai dengan keadaan diam?");
        System.out.println();
        System.out.println("JAWABAN : ");
        System.out.println("a. Ek\t= 1/2 * massa bola * kecepatan kuadrat");
        System.out.println("\t= " + energiKinetik + " Joule");
        System.out.println("b. W\t= 1/2 * massa bola * (kecepatan akhir kuadrat - kecepatan akhir kuadrat");
        System.out.println("\t= " + + usaha + " Joule");
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
