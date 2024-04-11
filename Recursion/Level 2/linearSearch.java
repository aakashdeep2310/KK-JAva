import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 576, 7, 68, 68, 9, 19};
        int target = 68;

        // System.out.println(linearS(arr, target, 0));
        // System.out.println(lsFindIndex(arr, target, 0));
        // System.out.println(lsfromLast(arr, target, arr.length-1));
        // lsFindAll(arr, target, 0);
        // System.out.println(list);

        // ArrayList<Integer> list  = new ArrayList<>();
        // // System.out.println(lsFindAllArrayList(arr, target, 0, new ArrayList<>()));
        // System.out.println(lsFindAllArrayList(arr, target, 0, list));

        System.out.println(lsFindAllArrayList2(arr, target, 0));


        
    }

    public static boolean linearS(int[] arr, int target, int index){
        if(index == arr.length-1){
            return false;
        }


        return arr[index] == target ||linearS(arr, target, index+1);
    }


    public static int lsFindIndex(int[] arr, int target, int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{

            return lsFindIndex(arr, target, index+1);
        }

    }
    public static int lsfromLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{

            return lsfromLast(arr, target, index-1);
        }

    }
    static ArrayList<Integer> list = new ArrayList<>();

    public static void lsFindAll(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        lsFindAll(arr, target, index+1);

    }
  

    public static ArrayList<Integer> lsFindAllArrayList(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return lsFindAllArrayList(arr, target, index+1, list);

    }

    public static ArrayList<Integer> lsFindAllArrayList2(int[] arr, int target, int index){
        ArrayList<Integer> list  = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        // this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> answerFromBelowCalls =  lsFindAllArrayList2(arr, target, index+1);

        list.addAll(answerFromBelowCalls);
        return list;
    }


    
    
}
