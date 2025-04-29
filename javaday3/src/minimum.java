public class minimum {
    
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{2,3,4,5},{3,4,5,6}};
        int min=0;
        for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[i].length;j++){
             while(arr[i][j]<min){
                 min=arr[i][j];
                 
             }
         }
        } System.out.println(min);
     }
    
    
    
}
