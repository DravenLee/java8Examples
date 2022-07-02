package ex02.adapter.forinstance;

import ex02.adapter.forclass.Banner;

public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String string){
        this.banner = new Banner(string);
    }
    public void printWeak(){
        this.banner.showWithParen();
    }
    public void printStrong(){
        this.banner.showWithAster();
    }
}
