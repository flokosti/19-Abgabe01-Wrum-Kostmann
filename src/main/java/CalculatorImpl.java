import java.util.ArrayList;

public class CalculatorImpl implements Calculator {

    //Arraylist to save values
    ArrayList<Integer> values=new ArrayList<Integer>();

    public int sum() {
        return 0;
    }

    public int getMaximum() {
        return 0;
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
