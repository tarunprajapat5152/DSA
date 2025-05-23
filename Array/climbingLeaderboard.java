import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class climbingLeaderboard{

    public static  ArrayList<Integer> climbingLeaderboard(int ranked[], int player[]){

        ArrayList<Integer> unique = new ArrayList<>();
        ArrayList<Integer> score = new ArrayList<>();
        int n = ranked.length;

        for(int i = 0; i < n; i++){
           if(!unique.contains(ranked[i]) || unique.isEmpty()){
               unique.add(ranked[i]);
           }
        }
        System.out.println("Unique ranks are: " + unique);
        
        for(int i = player.length; i > 0; i--){
           int index = 0;
           if(player[index] >= unique.get(unique.size()-1)){
               score.add(i);
           } else{
              score.add(i+1);
           }
           index++;
        }

        return score;
    }

    public static void main(String[] args) {
        int ranked[] = {100, 90, 90, 80, 75, 60};
        int player[] = {50, 65, 77, 90, 102};

        ArrayList<Integer> ans = climbingLeaderboard(ranked, player);
        System.out.println("The ranks of the players are: " + ans);
    }
}