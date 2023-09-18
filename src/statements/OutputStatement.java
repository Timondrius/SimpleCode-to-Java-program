package statements;

import expressions.*;
import mini_splat.RunException;
import statements.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OutputStatement extends Statement{
    Expression out;
    public OutputStatement(Expression exp){
        this. out = exp;
    }
    @Override
    public void execute(Map<String, Integer> varMap, List<Integer> output) throws RunException {
        output. add(this. out. computeValue(varMap));
    }

    @Override
    public String toString() {
        return "Output " + this.out.toString() + '\n';
    }
}
