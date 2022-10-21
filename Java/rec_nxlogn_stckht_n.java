package recursion;

public class rec_nxlogn_stckht_n {

    public static int stck_ht(int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        if(n%2 == 0){
            return stck_ht(x, n/2)* stck_ht(x, n/2);
        }
        else{
            return stck_ht(x, n/2)* stck_ht(x, n/2)*x;
        }

    }
    public static void main(String[] args) {
        int x = 2, n = 4;
        int ans = stck_ht(x,n);
        System.out.println(ans);
    }
}
