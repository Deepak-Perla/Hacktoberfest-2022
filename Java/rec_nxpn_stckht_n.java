package recursion;

public class rec_nxpn_stckht_n {

    public static int stck_ht(int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpwrn1 = stck_ht(x, n-1);
        int xpwrn = x * xpwrn1;
        return xpwrn;

    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = stck_ht(x,n);
        System.out.println(ans);
    }
}
