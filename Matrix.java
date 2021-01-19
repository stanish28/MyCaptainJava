class Matrix{
    public static void main(){
        int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
        int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
        System.out.println("Addition of the two matrices :");
        for (int i = 0; i<a.length; i++){
            for(int j =0; j<a.length;j++){
                System.out.print(a[i][j] + b[i][j] + " ");
            }
           System.out.println();
       }
       System.out.println();
       System.out.println("Multi[lication of the two matrices :");
        for (int i = 0; i<a.length; i++){
            for(int j =0; j<a.length;j++){
                System.out.print(a[i][j] * b[i][j] + " ");
            }
           System.out.println();
       }
     }
  }