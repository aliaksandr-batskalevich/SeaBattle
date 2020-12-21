import java.util.ArrayList;
import java.util.Arrays;

public class SimpleDotCom {
    ArrayList<String> loctionCells = new ArrayList<>();

    public void setLoctionCells(ArrayList<String> locs){
        loctionCells = locs;
    }
    public String checkYourself(String userInput){
        String result = "Мимо!";
        int index = loctionCells.indexOf(userInput);
        if (index >= 0){
            loctionCells.remove(index);
            if (loctionCells.isEmpty()){
                result = "Потопил!";
            } else {
                result = "Попал!";
            }
        }
        System.out.println(result);
        return result;
    }
}
