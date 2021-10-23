package Experiment2;

class Player {
    public Player(){
        System.out.println("I'm a Player");
    }
}

class CricketPlayer extends Player{
    public CricketPlayer(){
        super();
        System.out.println("I play Cricket");
    }
}

class FootBallPlayer extends Player{
    public FootBallPlayer(){
        super();
        System.out.println("I play Football");
    }
}

class HockeyPlayer extends Player{
    public HockeyPlayer(){
        super();
        System.out.println("I play Hockey");
    }
}
public class Main {
    public static void main(String[] args) {
        CricketPlayer cp = new CricketPlayer();
        HockeyPlayer hp = new HockeyPlayer();
        FootBallPlayer fp = new FootBallPlayer();
    }
}
