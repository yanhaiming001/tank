package com.yhm.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Create by YHM on  2021/3/21   7:34
 * Descreption:
 */
public class TankFrame extends Frame {
    int x=200;
    int y=100;
    /**
     * 构造方法
     */
    public TankFrame(){
        //设置窗口的大小
        this.setSize(800,600);
        //设置窗口不可更改窗口
        this.setResizable(false);
        //设置标题栏
        this.setTitle("Tank war");
        //设置窗口对象可显示
        this.setVisible(true);
        //添加Windows监听器  关闭窗口  监听windowClosing(e)这件事 主要关比窗口用
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);//系统退出
            }
        });
    }

    /**
     * 重写paint方法  绘制自己的Tank窗口
     * @param g
     */
    @Override
    public void paint(Graphics g){
        System.out.println("paint");
        //g是只画笔
        //绘制一个正方形
        g.fillRect(x,y,50,50);
        x+=10;
        y+=20;
    }
}
