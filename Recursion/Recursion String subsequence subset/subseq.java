import java.lang.reflect.Array;
import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        // subSequence("", "abc");
        
        // System.out.println(subSeqRet("", "abc"));
        // subSequenceAscii("", "abc");
        System.out.println(subSeqAsciiRet("", "abc"));
    }

    static void subSequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSequence(p+ch, up.substring(1));
        subSequence(p, up.substring(1));
    }


    static ArrayList<String> subSeqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
    

    
    static void subSequenceAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSequenceAscii(p+ch, up.substring(1));
        subSequenceAscii(p, up.substring(1));
        subSequenceAscii(p+(ch+0), up.substring(1));
    }

    static ArrayList<String> subSeqAsciiRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subSeqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subSeqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subSeqAsciiRet(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
