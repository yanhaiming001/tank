package com.yhm.tank;

/**
 * Create by YHM on  2021/3/21   7:36
 * Descreption:
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //测试我们编写的类
        TankFrame tankFrame=new TankFrame();

        //隔一段时间执行下，repaint操作
        while(true){
            Thread.sleep(50);
            System.out.println("窗口重绘制");
            tankFrame.repaint();
        }



    }
}
