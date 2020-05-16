public class Metloc {
   public void umur(){
      int num = 23;
      class Inner{
         public void print() {
            System.out.println("Ini adalah Tanggal Lahir Saya = "+num);
         }
      }
      Inner obj = new Inner();
      obj.print();
   }
   public static void main(String args[]){
      Metloc otr = new Metloc();
      otr.umur();
   }
}
