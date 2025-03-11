package inter;

interface I {
    void methodB();
}

class AA {
    public void methodA(B b) {
        b.methodB();
    }
}

class BB implements I {

    @Override
    public void methodB() {

        throw new UnsupportedOperationException("Unimplemented method 'methodB'");
    }

}

class IterfaceTest2 {
    public static void main(String[] args) {
     AA obj1 =new AA(); /;
    }
}
