import java.util.*;
public class TwoSum50{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int comp=k-arr[i];
            if(hm.containsKey(comp)){
                System.out.println(i + " " +hm.get(comp));
                break;
            }
            hm.put(arr[i],i);
        }
    }
}