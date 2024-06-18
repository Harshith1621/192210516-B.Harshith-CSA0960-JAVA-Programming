package vscode.Easy_Level;

public class _19_mean_mode_meduian {
    public static void main(String[] args) {
       int arr[] = {16, 18, 27, 16, 23, 21, 19};
       //MEDIAN
       for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
       }
       for(int i=0; i<arr.length; i++){
        int n=arr.length;
        int mid =n/2;
        if(n%2==0){
            System.out.println("Median:"+(arr[mid]+arr[mid-1])/2);
            break;
        }else{
            System.out.println("Median:"+arr[mid]);
            break;
        }
       }

       //MEAN
       double sum =0;
       for(int i=0; i<arr.length; i++){
        sum+=arr[i];
       }
       System.out.println("Mean:"+(sum/arr.length));


       //MODE
       int max_count=0, value=0;
       for(int i=0; i<arr.length; i++){
        int count =0;
        for(int j=0; j<arr.length; j++){
            if(arr[i]==arr[j]){
                count+=1;
            }
            if(count>max_count){
                max_count=count;
                value=arr[i];
            }
        }
       }
       System.out.println("Mode:"+value);

    }
    
}
