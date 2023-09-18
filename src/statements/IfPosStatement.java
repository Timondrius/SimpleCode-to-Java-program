package statements;

import expressions.Expression;
import expressions.IntegerConstant;
import mini_splat.RunException;

import java.util.List;
import java.util.Map;

public class IfPosStatement extends Statement{
    List<Statement> statements;
    Expression condition;
    public IfPosStatement(Expression exp, List<Statement> ifbody){
        this. condition = exp;
        this. statements = ifbody;
    }
    @Override
    public void execute(Map<String, Integer> varMap, List<Integer> output) throws RunException {
        if(this. condition. computeValue(varMap) > 0){
            for( Statement state : this. statements){
                state.execute(varMap, output);
            }
        }
    }

    @Override
    public String toString() {
        return "if_pos " + this.condition.toString() + '\n';
    }
}
