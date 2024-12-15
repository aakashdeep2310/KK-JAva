public class R04FirstUpperCaseInString {


    // iterative way

    // public static char first(String str){
    //     for(int i = 0; i< str.length(); i++){
    //         if(Character.isUpperCase(str.charAt(i))){
    //             return str.charAt(i);
    //         }
    //     }
    //     return 0;
    // }


    // recursive way

    public static char first(String str, int i){
        if(str.charAt(i) == '\0'){
            return 0;
        }
        if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }
        try{
            return first(str, i+1);
        }catch (Exception e){
            System.out.println("Exception occurs");
        }
        
        return 0;
    }



    public static void main(String[] args) {
        String str = "geeksforGeeks";
        // char res = first(str); => iterative
        char res = first(str, 0); // =>recursive approach
        if(res == 0){
            System.out.println("No upperCase letter found");
        }
        else{
            System.out.println(res);
        }
        
        
    }
    
}
