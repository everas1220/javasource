package api.object;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Value v = (Value) obj;

        return this.value == v.value;
    }

    // toString() 멤버변수값 출력용도
    // @Override
    // public String toString() {
    // return value + "";
    // }

}
