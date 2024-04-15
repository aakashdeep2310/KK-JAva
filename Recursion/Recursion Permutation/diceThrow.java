import java.util.ArrayList;

public class diceThrow {
    public static void main(String[] args) {
        // dice("", 4);
        ArrayList<String> ans = diceRec("",2);
        System.out.println(ans);
    }
    
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<= 6 && i<=target; i++){
            dice(p+i, target-i);
        }
    }

    static ArrayList<String> diceRec(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i<= 6 && i<=target; i++){
            ans.addAll(diceRec(p+i, target-i));
        }
        return ans;
    }


}
