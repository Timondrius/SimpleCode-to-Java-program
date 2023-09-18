package statements;

import expressions.*;
import mini_splat.RunException;

import java.util.List;
import java.util.Map;

public class WhilePosLoop extends Statement{
    Expression condition;
    List<Statement> statements;
    public WhilePosLoop(Expression exp, List<Statement> st){
        this. condition = exp;
        this. statements = st;
    }
    @Override
    public void execute(Map<String, Integer> varMap, List<Integer> output) throws RunException {
        while(this. condition. computeValue(varMap) > 0) {
            for(Statement i : this. statements){
                i. execute(varMap, output);
            }
        }
    }

    @Override
    public String toString() {
        String s = "while_pos " + this. condition. toString() + '\n';
        for(Statement i : this. statements){
            s += i. toString();
        }
        s += "end \n";
        return s;
    }
}
