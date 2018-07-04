package willem.weiyu.designPattern.templateMethod;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 15:38
 * @since 1.0.0
 */
public abstract class AbstractSort {
    abstract void sort(int[] array);

    public void printResult(int[] array){
        this.sort(array);
        System.out.println("排序结果：");
        for (int i=0; i<array.length;i++){
            System.out.printf("%3s",array[i]);
        }
        System.out.println();
    }
}
