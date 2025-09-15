package com.cdc.forge.gui.controller;

import com.cdc.forge.gui.CommonGui;

public class CommonNavigationController implements NavigationController {

    private CommonGui commonGui;

    public CommonNavigationController(CommonGui commonGui) {
        this.commonGui = commonGui;
    }

    @Override
    public void navigateToWelcome() {
        commonGui.showWelcomeGui();
    }

    @Override
    public void navigateToNewGame() {
        commonGui.showNewGameGui();
    }
}
