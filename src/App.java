


public class App {
    public static void main(String[] args) throws Exception {
    /**
        * Algorithms
        Array
        Stack
        Queue
        LinkedList
        Singly/doubly/circular
        Trees
        Search
        Sort
        Graph
        */

        // insertion sort
        int[] arr={5,2,4,6,1,3};
        System.out.println("Unsorted Array");
        printArray(arr);

        insertionSort(arr);
        System.out.println("\nSorted array :");
        printArray(arr);

        // repeating char
        // repeatString('*', 40);

        System.out.println(repeatString('*', 40));

        // using StringBulder
        System.out.println();


        System.out.println(repeat2('&', 30)); 

    
    
    }

    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;++i){
            int key=arr[i];
            int j=i-1;

            while(j>=0&& arr[j]>key){
                arr[j+1]=arr[j];

                j=j-1;
            }
            arr[j+1]=key;

        }

    }
    public static void printArray(int[] arr){
        for(int n:arr){
            System.out.println(n +" ");
        }

        System.out.println();
    }

    public static String repeatString(char c,int n){
        String answer="";
        for(int i=0;i<n;i++){
            answer +=c;

        }
        return answer;

    }

    // using stringBuilder
    // more efficient to use can grnetaye a million character
    public static String repeat2(char c,int n){
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<n;j++){
            sb.append(c);
        }
        return sb.toString();
    }


}
