package expressions;

import mini_splat.RunException;

import java.util.Map;

public class VariableExpr extends Expression{

    String name;
    public VariableExpr(String n){
        this. name = n;
    }

    @Override
    public int computeValue(Map<String, Integer> varMap) throws RunException {
        return varMap.get(this. name);
    }

    @Override
    public String toString() {
        return name;
    }
}
