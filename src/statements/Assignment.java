package statements;

import mini_splat.RunException;
import expressions.*;
import java.util.List;
import java.util.Map;

public class Assignment extends Statement{
    String str;
    Expression expression;
    public Assignment(String s, Expression exp){
        this. str = s;
        this. expression = exp;
    }
    @Override
    public void execute(Map<String, Integer> varMap, List<Integer> output) throws RunException {
        varMap.put(this. str, this. expression.computeValue(varMap));
    }

    @Override
    public String toString() {
        return this. str + " := " + this. expression.toString() + '\n';
    }
}
