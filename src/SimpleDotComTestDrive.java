import java.util.ArrayList;
import java.util.Arrays;
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int randomNum = (int) (Math.random()*5);
        String [] location = {Integer.toString(randomNum),Integer.toString(randomNum+1),Integer.toString(randomNum+2)};
        ArrayList<String> locationA = new ArrayList<>(Arrays.asList(location));
        dot.setLoctionCells(locationA);
        boolean isAlive = true;
        int numOfGuesses = 0;                                       // Начало угадываний
        GameHelper helper = new GameHelper();
            while (isAlive == true) {
            String guess = helper.getUserInput("Введите число");
            String result = dot.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил!")){
                isAlive = false;
                System.out.println("Вам понадобилось " + numOfGuesses + " попыток(и)");
            }
        }
    }
}