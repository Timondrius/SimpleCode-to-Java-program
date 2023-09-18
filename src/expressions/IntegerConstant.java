package expressions;

import mini_splat.RunException;

import java.util.Map;

public class IntegerConstant extends Expression{
    public int value;
    public IntegerConstant(int val){
        this.value = val;
    }
    @Override
    public int computeValue(Map<String, Integer> varMap) throws RunException {
        return this. value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
