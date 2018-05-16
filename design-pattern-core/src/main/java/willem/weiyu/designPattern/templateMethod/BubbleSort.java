package willem.weiyu.designPattern.templateMethod;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 15:41
 * @since 1.0.0
 */
public class BubbleSort extends AbstractSort {
    @Override
    void sort(int[] array) {
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length-i-1; j++){
                int temp;
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
