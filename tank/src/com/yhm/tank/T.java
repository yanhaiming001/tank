package com.yhm.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Create by YHM on  2021/3/21   7:10
 * Descreption:
 */
public class T {
    public static void main(String[] args) {
        //创建一个窗口对象
        Frame f=new Frame();
        //设置窗口的大小
        f.setSize(800,600);
        //设置窗口不可更改窗口
        f.setResizable(false);
        //设置标题栏
        f.setTitle("Tank war");
        //设置窗口对象可显示
        f.setVisible(true);

        //添加Windows监听器  关闭窗口  监听windowClosing(e)这件事 主要关比窗口用
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);//系统退出
            }
        });
    }

}
