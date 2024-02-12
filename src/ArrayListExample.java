import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<Integer> array=new ArrayList<>();
        array.add(30);
        array.add(50);
        array.add(40);
        System.out.println(array);

        int index=2;

        int SeachIndexElement=array.get(index);
        System.out.println("Search index" +index + " is:"+ SeachIndexElement);

        // set method of array list
        array.set(2,100);
        for(int arr:array){
            System.out.println(arr);
        }

       array.removeAll(array);

        
        if(isEmpty(array)){
            System.out.println("Array is empty");
        }else{
            System.out.println("Array list is not empty");
        }
    }
    public static boolean isEmpty(ArrayList<?> element){
        return element.isEmpty();
    }
}
