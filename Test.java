public class Test {

    public Integer indexMaxValue(Integer[] arr){

        int index = 0;
        int maxValue = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxValue){
                index = i;
                maxValue = arr[i];
            }
        }

        return index;
    }
}
