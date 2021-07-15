package HW6;


//大家好，数据结构第6次正课 已由Andy老师反馈：
//
//上课时间：2021-06-24 10:10-12:10
//
//1.本节课内容：
//1. recursion的定义以及recursion函数的写法 
//2. Recursion 写法简单复习 
//3. Backtracking Algorithm 
//4. Brute Force Algorithm 
//5. Sudoku backtracking 算法
//6. Time Complexity： Big-Oh 介绍与定义
//
//2.下节课预告：
//完成Time Complexity讲解，介绍P与NP问题，图灵机器
//
//3.作业：
//【第二次大作业】：https://classroom.github.com/a/lg6C950R
//如果有同学还未接受第一次大作业，尽快完成并提交 
//【第一次大作业】： https://classroom.github.com/a/pmDdI3Fn
//
//【打卡作业】Prove T(n)=n^3+20n+1 is NOT O(n^2)
//
//4.附件：
//《Sudoku.java》https://tdfile.testdaily.cn/group1/M00/31/EE/rBHuyWDUB1OEX2mlAAAAAO3zbeA32.java
//《SudokuDriver.java》https://tdfile.testdaily.cn/group1/M00/31/EE/rBHuyWDUB1aEfduGAAAAAHzkklI61.java

class sorting {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 235, 2, 67, 1, 23, 2, 2, 3, 4, 1763, 22, 2, 1};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void insertion(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int current = i;
            int temp = arr[current];
            while(current > 0 && temp < arr[current - 1]){
                arr[current] = arr[current - 1];
                current--;
            }
            arr[current] = temp;
        }
    }
    
    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; ++i) {
            int min = arr[i];
            int temp = min;
            int minindex = i;
            for(int j = i + 1; j < arr.length; j++) {
            	if(arr[j] < min) {
            		min = arr[j];
            		minindex= j;
            	}
            }
            arr[i] = min;
            arr[minindex] = temp;
        }
    }
}
