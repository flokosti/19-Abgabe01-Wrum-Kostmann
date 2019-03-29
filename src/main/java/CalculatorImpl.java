import java.util.ArrayList;

public class CalculatorImpl implements Calculator {

    //Arraylist to save values
    ArrayList<Integer> values=new ArrayList<Integer>();

    //Method to get sum from all values from arrayList
    public int sum() {
        int sum=0;
        for (int i=0; i<values.size();i++){
            sum+=values.get(i);
        }
        return sum;
    }

    //Method to get max value from arrayList
    public int getMaximum() {
        int max=values.get(0);
        for(int i=0;i<values.size();i++){
            if(max<values.get(i)){
                max=values.get(i);
            }
        }
        return max;
    }

    //Method to get min value from arrayList
    public int getMinimum() {

        int min = values.get(0);
        for (int i = 0; i < values.size(); i++){
            if (min > values.get(i)){
                min = values.get(i);
            }
        }
        return min;
    }

    //Method to add int values to arraylist
    public void addValue(int value) {
        values.add(value);

    }
}
