package com.cdc.forge.gui;

import javax.swing.*;
import java.awt.*;

public class NewGameGui extends JFrame {

    public NewGameGui() {

        // 获取屏幕尺寸和窗口边界
        Dimension screen = getToolkit().getScreenSize();
        Rectangle bounds = getBounds();

        // 设置窗口大小为1280x720
        bounds.width = 1280;
        bounds.height = 720;

        // 计算窗口居中位置
        bounds.x = (screen.width - bounds.width) / 2;
        bounds.y = (screen.height - bounds.height) / 2;

        // 应用新的窗口边界设置
        setBounds(bounds);

        // 固定窗口尺寸，禁止调整大小
        setResizable(false);

        // 设置关闭窗口时退出程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口标题
        setTitle("forge-remastered");

        setVisible(true);
    }

    public static void main(String[] args) {
        new NewGameGui();
    }
}
