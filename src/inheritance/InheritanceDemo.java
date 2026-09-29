class A {
    void methodA1() {
        System.out.println("A specific method 1");
    }

    void methodA2() {
        System.out.println("A specific method 2");
    }

    void overrideMethod() {
        System.out.println("Override method in A");
    }
}

class B extends A {
    void methodB1() {
        System.out.println("B specific method 1");
    }

    void methodB2() {
        System.out.println("B specific method 2");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override method in B");
    }
}

class C extends B {
    void methodC1() {
        System.out.println("C specific method 1");
    }

    void methodC2() {
        System.out.println("C specific method 2");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override method in C");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.methodA1();
        a.methodA2();
        a.overrideMethod();
        b.methodB1();
        b.methodB2();
        b.overrideMethod();
        c.methodC1();
        c.methodC2();
        c.overrideMethod();

        A ref;
        ref = b;
        ref.overrideMethod();
        ref = c;
        ref.overrideMethod();
    }
}
