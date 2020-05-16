public class KelasLuar {
    //Class dalam/Inner Class Static
    private static class Mamalia{
        private String hewan;
        private void sethewan(String hewan){
            this.hewan= hewan;
        }
        private String gethewan(){
            return hewan;
        }
    }
    
    public static void main(String[] args){
        KelasLuar.Mamalia mml = new KelasLuar.Mamalia();
        mml.sethewan("Aeong");
        System.out.println("Hewan Peliharaan saya adalah "+mml.gethewan());
    }
}