public class javaMaxSubArr_KadaneAlgo {

    public static void kadans(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subarray sum is : "+ms);
    }
    
    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        kadans(numbers);
    } 
}
