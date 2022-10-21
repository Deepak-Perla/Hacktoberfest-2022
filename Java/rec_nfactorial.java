package recursion;

public class rec_nfactorial {

    public static int nfac(int n) {
        if(n==1 || n==0){
            return 1;
        }
        int fac_n = nfac(n-1);
        int fac_nn = n * fac_n;
        return fac_nn;
    }
    public static void main(String[] args) {
        int n=5;
        int ans = nfac(n);
        System.out.println(ans);

    }
}
