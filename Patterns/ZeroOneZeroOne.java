public class ZeroOneZeroOne {
    public static void main(String[] args){
        int n=5;
        //outer loop
        for(int i=0;i<=n;i++){

            //inner loop
            for(int j=0;j<=i;j++){
                int sum= i+j;
                if (sum % 2==0 ){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }System.out.println();
        }
    }
}

// 0                    use matric position sum
// 1 0                    even sum = 0 and odd sum =1
// 0 1 0 
// 1 0 1 0 
// 0 1 0 1 0 
// 1 0 1 0 1 0 
