package com.cdc.forge.gui;

import com.cdc.forge.gui.controller.NavigationController;

import javax.swing.*;
import java.awt.*;

public class WelcomeGui extends JPanel {
    private NavigationController navigationController;

    public WelcomeGui(NavigationController navigationController) {
        this.navigationController = navigationController;
        initializeComponents();
    }

    private void initializeComponents() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // 标题
        JLabel titleLabel = new JLabel("Welcome To Forge-Remastered", JLabel.CENTER);
        titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 24));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // 添加垂直间距
        add(Box.createVerticalStrut(100));
        add(titleLabel);

        JRadioButton soloButton = new JRadioButton();
        soloButton.setText("Solo - Play Against The Computer");
        soloButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // 添加垂直间距
        add(Box.createVerticalStrut(100));
        add(soloButton);

        JButton nextButton = new JButton("Next");
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // 添加按钮点击事件监听器
        nextButton.addActionListener(e -> {
            if (navigationController != null) {
                navigationController.navigateToNewGame();
            }
        });

        // 添加垂直间距
        add(Box.createVerticalStrut(100));
        add(nextButton);
    }
}
