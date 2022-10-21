package recursion;

public class rec_firstlast_occur {
    public static int first =-1;
    public static int last = -1;

    public static void findoccur(String str, int idx, char element) {
        if (idx==str.length()){
            System.out.println(first);
            System.err.println(last);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }

        findoccur(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abbabcbdbaddh";
        findoccur(str, 0, 'a');
    }
}
