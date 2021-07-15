package HW3;

import java.util.*;
public class ArrayDelete{
    public static void main(String args[]){
        
        int [] array = {1,23,0,7,9};

        //遍历数组

        for(int a:array){
            System.out.print(a + " ");
        }

        System.out.println();
        delete(array, 1);//调用delete方法

        for(int i=0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] removeElementByLoop(int[] array, int position) {
        if (position < 0 || position > array.length) {
            throw new IndexOutOfBoundsException("the position is out of the array indices");
        }

        int[] newArray = new int[array.length - 1];
        int index = position - 1;
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i > index) {
                newArray[i - 1] = array[i];
            }
        }
        return newArray;
    }
    
    /**
     * remove element at the specified position from the given array by copy
     * 
     * @param array
     * @param position
     * @return
     */


    public static int[] removeElementByCopy(int[] array, int position) {
        int length = array.length;
        if (position < 0 || position > length) {
            throw new IndexOutOfBoundsException("the position is out of the array indices");
        }
        
        int[] newArray = new int[array.length - 1];
        int index = position - 1;
        
        System.arraycopy(array, 0, newArray, 0, index);
        
        if (index < length - 1) {
            System.arraycopy(array, index + 1, newArray, index, length - index - 1);
        }
        
        return newArray;
    }
    
	public static void delete(int[] array, int index) {
		for (int i = index; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = 0;
	}

}
