public class hasilcoba {
    //Membuat Instance Hewan (Static)
    static Hewan data = new Hewan() {
        //Contoh Penggunaan Anonymous Class
        @Override
        public void Jenis() {
            System.out.println("Kucing");
        }

        @Override
        public void Makanan() {
            System.out.println("Ikan");
        }

        @Override
        public void Suara() {
            System.out.println("Aeong");
        }
    }; //Block Anonymous Class Harus Di Akhiri Titik Koma
    
    public static void main(String[] args){
        //Memanggil dan Menjalankan Method Anonymous
        System.out.print("Nama Hewan = ");
        data.Jenis();
        System.out.print("Makanan Hewan = ");
        data.Makanan();
        System.out.print("Suara Hewan = ");
        data.Suara();
    }
}
