package Abstract.Abstracts.Observation9;

class SecondChild extends FirstChild {
    public void m2() {
        System.out.println("Inside m2");
    }

    public void m3() {
        System.out.println("Inside m3");
    }

    public static void main(String[] args) {
        // if we remove the abstract keyword from FirstChild Class and uncommented below obj creation for
        // FirstChild then it will throw compile time error as didn't override all the abstract methods

        // FirstChild f=new FirstChild();
        //f.m1();

        SecondChild s = new SecondChild();
        s.m1();
        s.m2();
        s.m3();

        //outPut:
        // Inside m1
        // Inside m2
        // Inside m3
    }
}
