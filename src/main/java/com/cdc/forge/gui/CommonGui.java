package com.cdc.forge.gui;

import javax.swing.*;
import java.awt.*;

public class CommonGui extends JFrame {

    // 主内容区域，可以动态切换界面
    private JPanel contentPanel;

    public CommonGui() {

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

        contentPanel = new JPanel(new CardLayout());
        add(contentPanel);

        showWelcomeGui();

        setVisible(true);
    }

    /**
     * 显示欢迎界面GUI
     * 该方法用于切换当前内容面板为欢迎界面，会清空现有内容并添加新的欢迎界面组件
     */
    public void showWelcomeGui() {

//        if (contentPanel == null) {
//            contentPanel = new JPanel(new CardLayout());
//            add(contentPanel);
//        }

        // 清除内容面板中的所有组件
        contentPanel.removeAll();

        // 添加欢迎界面到内容面板
        contentPanel.add(new WelcomeGui(), null);

        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public static void main(String[] args) {
        new CommonGui();
    }
}
