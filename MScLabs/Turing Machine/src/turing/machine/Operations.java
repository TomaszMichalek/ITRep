package turing.machine;

// Tworzę pola: do okreslenia stanu, w którym się znajduje, do przypisania wartości oraz do okreslenia ruchu głowicy.

public class Operations {

    private int nextState;      // q0=0; q1=1; q2=2; q3=3
    private char value;         // '0'; '1'; '-'
    private int move;           // -2=2xleft; -1=left; 0=no move; 1=right

    public int getNextState() {
        return nextState;
    }

    public void setNextState(int nextState) {
        this.nextState = nextState;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    Operations(int nextState, char value, int move) {
        this.nextState = nextState;
        this.value = value;
        this.move = move;
    }
}