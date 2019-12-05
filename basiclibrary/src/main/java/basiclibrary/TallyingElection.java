package basiclibrary;

import java.util.*;

public class TallyingElection {



       //  String winner = tally(votes);

      //  System.out.println(winner + " received the most votes!");

  public boolean testing () {


      List<String> votes = new ArrayList<>();
      votes.add("Bush");
      votes.add("Bush");
      votes.add("Bush");
      votes.add("Shrub");
      votes.add("Hedge");
      votes.add("Shrub");
      votes.add("Bush");
      votes.add("Hedge");
      votes.add("Bush");

      String winner = tally(votes);

      System.out.println(winner + " received the most votes!");

      return true;
  }

    public String tally (List votes1){

        HashMap<String, Integer> candidates = new HashMap<>();

        HashSet<String> candidate = new HashSet<>(votes1);

            for(String Elector : candidate){
            candidates.put(Elector,0);
        }

        for (int i = 0; i < votes1.size(); i++) {

            if(candidate.contains(votes1.get(i))){
//
                    String char1 = (String) votes1.get(i);
                candidates.put(char1, candidates.get(char1) + 1);
            }
        }
      int intialvalue = 0 ;
        String Winner = null;

        for( String Elector : candidates.keySet()){

            if (intialvalue < candidates.get(Elector) )
            {
                intialvalue =  candidates.get(Elector);
                Winner = (String) Elector;

            }
        }
        System.out.println(Winner + " was mentioned " + intialvalue + " times");
        return Winner;

        }


}
