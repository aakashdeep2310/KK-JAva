public class A01_time_and_spaceComp {
    
    public static void main(String[] args) {

        // for(int i = 0; i< 11; i++){
        //     System.out.println(fiboFormula(i));
        // }
        
        System.out.println(fiboFormula(50));
    }

    static long fiboFormula(int n){
        return (long )(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}
