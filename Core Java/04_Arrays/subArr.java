public class subArr {
    public static void subArr(int arr[]){
        //loop for how many times it will be run
        int count=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            //loop for find index of sub arr
            for(int j=i;j<arr.length;j++){
                int end=j;
                //for print sub arr
                for(int k=start;k<end;k++){
                    System.out.print("["+arr[k]+"]");
                    count++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub arr is"+ count);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        subArr(arr);
    }
}
