package recursion;

public class rec_TOH {
    public static void ToH(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer Disk "+n+ " from "+src +" to "+dest);
            return;
        }
        ToH(n-1, src, dest, helper);
        System.out.println("Transfer Disk "+n+ " from "+src +" to "+dest);
        ToH(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 2;
        ToH(n, "S", "H", "D");
    }
}

//
//_______ _______ _______
//    S      H       D
