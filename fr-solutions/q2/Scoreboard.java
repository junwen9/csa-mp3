public class Scoreboard{
  private String team1;
  private String team2;
  private int score1;
  private int score2;
  private boolean isturn;
  public Scoreboard(String t1, String t2){
    team1 = t1;
    team2 = t2;
    score1 =0;
    score2 =0;
    isturn = true;
  }
  public void recordPlay(int num){
    if(isturn){
      score1+=num;
    }
  else if(!isturn){
    score2+=num;
  }
    if(num == 0){
      isturn = !isturn;
    }
  }
  public String getScore(){
    if(isturn){
      return score1+"-"+score2+"-"+team1;
    }
    else{
      return score1+"-"+score2+"-"+team2;
    }
    }

}
