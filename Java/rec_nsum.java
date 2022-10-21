package recursion;

public class rec_nsum {

    public static void nsum(int i, int n, int sum) {
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        nsum(i+1, n, sum);
//        System.out.println(i);
    }
    public static void main(String[] args) {
        nsum(1,5,0);
    }
}
