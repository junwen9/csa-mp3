public class Feeder{
  private int currentFood;
  public Feeder(int f){
    currentFood = f;
  }

  public void simulateOneDay(int numBirds){
    boolean isnormal = Math.random()<=0.94;
    int count = (int)(Math.random()*41)+10;
    count *=numBirds;
    if(isnormal){
      currentFood-=count;
    }
    else{
      currentFood = 0;
    }
  }

  public int simulateManyDays(int numBirds, int numDays){
    for(int i =1; i<=numDays;i++){
      simulateOneDay(numBirds);
      if(currentFood==0){
        return i;
      }
    }
    return numDays;
  }
  public int getcurentfood(){
    return currentFood;
  }
}



