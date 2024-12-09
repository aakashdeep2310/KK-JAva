public class LearnGenerics {
    public static void main(String[] args) {
        LearnGenerics lg = new LearnGenerics();
        // Dog d = lg.new Dog("Pitbull");
        // d.show();

        // Dog<String, String> d1 = lg.new Dog<>("pitbull");
        Dog<Integer, Integer> d1 = new Dog<>(14, 16);

    }
    // class Dog{
    //     String id;
    //     public Dog(String id){
    //         this.id = id;
    //     }
        
    //     public void show(){
    //         System.out.println(id);
    //     }
    // }
    static class Dog<T, V>{
        T id;
        V name;
        public Dog(T id, V name){
            this.id = id;
            this.name = name;
        }
        
        public void show(){
            System.out.println(id);
        }
    }
    
}
