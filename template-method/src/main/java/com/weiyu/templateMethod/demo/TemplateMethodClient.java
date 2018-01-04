package com.weiyu.templateMethod.demo;

/**
 * @author weiyu
 * 定义一个操作中算法的框架，而将一些步骤延迟到子类中，
 * 使得子类可以不改变算法的结构即可重定义该算法中的某些特定步骤
 * @description 模板方法模式
 * @create 2018/01/04
 */
abstract class AbstractSort{
    /**
     * 将数组array由小到大排序
     * @param array
     */
    protected abstract void sort(int[] array);

    public void showSortResult(int[] array){
        this.sort(array);
        System.out.println("排序结果：");
        for (int i=0; i<array.length;i++){
            System.out.printf("%3s",array[i]);
        }
    }
}

class ConcreteSort extends AbstractSort {

    @Override
    protected void sort(int[] array) {
        for (int i=0; i<array.length-1;i++){
            selectSort(array,i);
        }
    }

    private void selectSort(int[] array, int index){
     int minValue = 32767;
     int indexMin = 0;
     int temp = 0;
     for (int i=index; i<array.length;i++){
         if (array[i] < minValue){
             minValue = array[i];
             indexMin = i;
         }
     }
     temp = array[index];
     array[index] = array[indexMin];
     array[indexMin] = temp;
    }
}

public class TemplateMethodClient {
    public static void main(String[] args) {
        int[] a = {10, 32, 1, 9, 5, 7, 12, 0, 4, 3};
        AbstractSort sort = new ConcreteSort();
        sort.showSortResult(a);
    }
}
