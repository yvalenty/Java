public abstract class Gracz implements Lose, Win {
    String name = "bez imienia";
    String surname = "bez nazwiska";
    int allowedTime = 0;
    int select1=0, select2=0;
    int selectgc1, selectgc2, gcmax, gcmin, gSelect, freecell, ret, playedGames, selectedWinCombo;
    public boolean endGame, moveMaked;
    int c1[]={0,1,2},c2[]={3,4,5},c3[]={6,7,8},c4[]={0,3,6},c5[]={1,4,7},c6[]={2,5,8},c7[]={0,4,8},c8[]={2,4,6};
    int[][] winCombo = {c1,c2,c3,c4,c5,c6,c7,c8};
    int[] gameArea ={0,0,0,0,0,0,0,0,0};

    public Gracz() {}
    double payment;
    int repeats;
    int[][] gcrecords;
    public abstract String getTyp();
    public String getName() {
        return name;
    }
    public void setPayment(double p) {
        this.payment=p;
    }
    public void setRepeats(int r) {
        this.repeats=r;
    }
    public String getSurname() {
        return surname;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setSurname (String n){
        this.surname=n;
    }



    public void takeWinner(){
        //showResults();
        if(gcrecords[repeats][0]> gcrecords[repeats][1]){
            congratulate();
        }
        else if(gcrecords[repeats][0]< gcrecords[repeats][1]){
            laugh();
        }
        else
            remis();
  };

    public abstract void setResultsTable();


    public abstract void gameXO();

    public abstract int rund(int gcmin, int gcmax);

    public abstract void compMove();

    public void gameKNP(){}

    public void gameDeer(){}
}
