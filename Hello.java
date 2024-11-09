
class Hello {

    public static void main(String[] args) {
        hello ji = new hello();
        ji.start();
    }
}

class hello extends Thread {

    public void run() {
        while (true) {
            System.out.println("hello");
        }
    }

    public void go() {
        while (true) {
            System.out.println("hi meow");
        }
    }
}
