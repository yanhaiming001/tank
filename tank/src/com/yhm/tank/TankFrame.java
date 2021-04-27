package com.yhm.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Create by YHM on  2021/3/21   7:34
 * Descreption:
 */
public class TankFrame extends Frame {
    //定义坐标值
    int x = 200;
    int y = 100;

    /**
     * 构造方法
     */
    public TankFrame() {
        //设置窗口的大小
        this.setSize(800, 600);
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
        //  添加键盘监听
        this.addKeyListener(new MyKeyListner() {
        });

    }


    /**
     * 重写paint方法  绘制自己的Tank窗口，系统会自动调用
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        //g是只画笔，可以在窗口中绘制图像
        //绘制一个正方形
        g.fillRect(x, y, 50, 50);
//        x+=10;
//        y+=80;
        //paint被调用的时候，位置就会改变

    }

    /**
     * 键盘监听处理类  内部类  只有这个类自己使用
     * 只处理键盘的监听
     */
    class MyKeyListner extends KeyAdapter {
        public MyKeyListner() {
            super();
        }

        @Override
        public void keyTyped(KeyEvent e) {
            super.keyTyped(e);
        }

        /**
         * 监听按键 按下时调用
         *
         * @param e
         */
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            x += 100;//按下任意一个按钮  x新增50

            System.out.println("Key pressed");
            int key = e.getKeyCode();//获得按键

            switch (key) {
                case KeyEvent.VK_LEFT:
                    boolean bL = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    boolean bR = true;
                    break;
                case KeyEvent.VK_UP:
                    boolean bU = true;
                    break;
                case KeyEvent.VK_DOWN:
                    boolean bD = true;
                    break;
                default:
                    break;
            }


        }

        /*
         * 按键被释放的时候调用
         * */
        @Override
        public void keyReleased(KeyEvent e) {
            super.keyReleased(e);
            System.out.println("Key released");
        }
    }
}
