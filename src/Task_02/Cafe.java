package Task_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    public ArrayList<String> coffeeMenu;

    public Cafe(){
        coffeeMenu = new ArrayList<>();
    }


    public void loadMenuData() {
        File file = new File("coffees.txt");

        try {
            Scanner readFile = new Scanner(file);
            while (readFile.hasNextLine()) {
                String input = readFile.nextLine();
                coffeeMenu.add(input);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }


    }
}
