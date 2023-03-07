public class Box {
    public String nama, ukuran;
    public int jumlah;

    public Box(String Nama, String Ukuran, int Jumlah){
        this.nama = Nama;
        this.ukuran = Ukuran;
        this.jumlah = Jumlah;
    }

    public void isDisplay(){
        System.out.println("==========================================================");
        System.out.println("Nama BOX:"+ this.nama +"Box");
        System.out.println("Ukuran BOX:"+ this.ukuran);
        System.out.println("Jumlah BOX:"+ this.jumlah +"Pack");
        System.out.println("==========================================================");
    }

    public void metNama(String Nama){
        this.nama = Nama;
    }

    public void metUkuran(String Ukuran){
        this.ukuran = Ukuran;
    }

    public void metJumlah(int Jumlah){
        this.jumlah = Jumlah;
    }
}
