package com.company;

public class AndGate {
    private boolean inputA;
    private boolean inputB;

    //constructor
    public AndGate() {
        inputA = false;
        inputB = false;
    }

    public void setA(boolean value) {
        inputA = value;
    }
    public void setB(boolean value) {
        inputB = value;
    }

    public void setInputs(boolean a, boolean b) {
        setA(a);
        setB(b);
    }
    public boolean output() {
        // And inputs
        if(inputA == true && inputB == true) {
            return true;
        } else {
            return false;
        }
    }

    public int getAsInt(boolean value) {
        return 0;
    }



    public void displayTruthTable() {
        //this displays the output for all of the inputs instead of having it hardcoded
        boolean[] possible = {false, true};
        System.out.println("A  B  OUT");
        for(int i=0; i<possible.length; i++) {
            for(int j=0; j<possible.length; j++) {
                setA(possible[i]);
                setB(possible[j]);
                System.out.print(getAsInt(inputA)+ " ");
                System.out.print(getAsInt(inputB)+ " ");
                System.out.println(getAsInt(output()));
            }
        }
    }

}

