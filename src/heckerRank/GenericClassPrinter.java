package heckerRank;

public class GenericClassPrinter<T> {

    public void printArray(T[] arr){
        for(T o : arr){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{3,1,2,3,2};
        String[] stringArray = new String[]{"Hello", "World"};
        GenericClassPrinter<Integer> intPrinter = new GenericClassPrinter<Integer>();
        GenericClassPrinter<String> stringPrinter = new GenericClassPrinter<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );

    }

}
