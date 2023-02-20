package com.geniescode.share.menu;

import java.util.Scanner;

public abstract class CreateMenu {
    protected final Scanner userInput = new Scanner(System.in);

    protected abstract String getMenuSting();
}
