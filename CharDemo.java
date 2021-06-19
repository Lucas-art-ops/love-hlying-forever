import java.util.Arrays;

public class CharDemo {
    public static void main(String[] args) {
        char[] chars=new char[]{'a','c','u','b','e','p','f','z'};
        System.out.print("字符序列：");
        for (char oldChar:chars){
            System.out.print(oldChar +" ");
        }
        Arrays.sort(chars);
        System.out.print("\n排序后的字符序列：");
        for(char oldChar:chars){
            System.out.print(oldChar +" ");
        }
        int index=Arrays.binarySearch(chars,'b');
        System.out.println("字符b在数组中的位置是"+index);
    }
}
