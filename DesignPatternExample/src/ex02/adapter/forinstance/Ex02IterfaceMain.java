package ex02.adapter.forinstance;

import ex02.adapter.forclass.Print;
import ex02.adapter.forclass.PrintBanner;

public class Ex02IterfaceMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
