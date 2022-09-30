public class Outer {
    private int out;
    private static int sout = 99;

    public Outer(int out) {
        this.out = out;
    }

    public void display() {
        System.out.println("out = " + out);
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public static class Inner {
        private int in;

        public Inner(int in) {
            this.in = in;
        }

        public void display() {
            System.out.println("in = " + in );
            System.out.println("sout = " + sout );
            //System.out.println("out = " + out); //will not work
            //static inner class can not access not static members of outer class
            //as they are not connected to object of outer class
        }

        public int getIn() {
            return in;
        }

        public void setIn(int in) {
            this.in = in;
        }
    }
}
