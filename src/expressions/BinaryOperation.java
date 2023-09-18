package expressions;

import mini_splat.RunException;

import java.util.Map;

public class BinaryOperation extends Expression{

    Expression one;
    Character c;
    Expression two;

    public BinaryOperation(Expression o, Character ch, Expression t){
            this. one = o;
            this. c = ch;
            this. two = t;
    }

    @Override
    public int computeValue(Map<String, Integer> varMap) throws RunException {
        if(c == '+')  return (this. one.computeValue(varMap) +this. two.computeValue(varMap));
        else if(c == '-')  return (this. one.computeValue(varMap) - this. two.computeValue(varMap));
        else if(c == '/') {
            if(two.computeValue(varMap) == 0)
                throw new RunException("You cannot divide by zero!");
            else return this. one.computeValue(varMap) / this. two.computeValue(varMap);
        }
        else return (this. one.computeValue(varMap) * this. two.computeValue(varMap));
    }

    @Override
    public String toString() {
        return this. one.toString() +' ' + this. c + ' ' + this. two.toString() ;
    }
}
