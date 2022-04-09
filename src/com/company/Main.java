package com.company;

class Main {
    public static void main(String[] args) {
        System.out.println("Logic Gates test");

        AndGate gate1 = new AndGate();
        gate1.setInputs(false ,true );
        System.out.println(gate1.output());
        gate1.displayTruthTable();
    }
}
