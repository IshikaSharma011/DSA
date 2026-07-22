public class hollowSquare{
    public static void main(String[] args){
        //         (1,1)(1,2)(1,3)(1,4)
        //  (1,1)    *    *    *   *      
        //  (2,1)    *             *      
        //  (3,1)    *             *      
        //  (4,1)    *             *      
        //  (5,1)    *    *    *   *      
        //            basically i=1 or j=1
        int n=4;    //row
        int m=5;    //col

        for(int i=1;i<=n;i++){

            for(int j=1;j<=m;j++){   

            if(i==1 || i==n || j==1 ||j==m){

                System.out.print("* ");}

                else{
                System.out.print("  ");
            }
            }System.out.println();
        }
        }
        
    }
