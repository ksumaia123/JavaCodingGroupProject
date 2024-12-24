package Programs;

//50.	Program to return previous max value of given elememnt in an array
//        -----------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Previous_Max
{
    static int getPreviousMax(int[] arr)
    {
//        int key=arr[0];
//        int prevmax=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]+" > "+ prevmax +"   "+arr[i]+" < "+ key);
//            if(arr[i]>prevmax && arr[i]<key && arr[i]>key )
//                prevmax=arr[i];
//        }
//        return prevmax;

        for(int a=0;a<arr.length;a++){
            for(int b=a+1;b<arr.length;b++){
                if(arr[a]>arr[b]){
                    int temp=arr[a];
                    arr[a]=arr[b];
                    arr[b]=temp;
                }
            }
        }
        return arr[arr.length-2];
    }
    public static void main(String[] args)
    {
        int[] arr={14,47,98,57,52,74,84};
        System.out.println(getPreviousMax(arr));
    }
}
