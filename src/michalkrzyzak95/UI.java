package michalkrzyzak95;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Michal Krzyżak, 14.11.2018
*/

class UI {

    private UIController uiController = new UIController();

    void run(){
        System.out.println("~~~~~~~~Welcome to~~~~~~~~" + "\n" + "~~~~DISTANCE CONVERTER~~~~");
        Scanner input1 = new Scanner(System.in);
        String userInput = "";

        do {
            try {
                System.out.println("\n" + "Enter distance amount and unit you want to convert (i.e. 1000 meters)");
                userInput = input1.nextLine();
                String[] inputArray = userInput.split("[-,. ]");
                List<String> inputList = Arrays.asList(inputArray);
                uiController.getUserInput(inputList);
            } catch (Exception e){
                if (!(userInput.equalsIgnoreCase("exit") || userInput.equalsIgnoreCase("q"))){
                    System.out.println("Oops! Something went wrong..." + "\n");
                    continue;
                } else {
                    System.out.println("Exiting...");
                    break;
                }
            }
        } while (!(userInput.equalsIgnoreCase("exit") || userInput.equalsIgnoreCase("q")));
    }
}
