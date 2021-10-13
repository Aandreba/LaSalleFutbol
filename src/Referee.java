public class Referee extends Person {

    public  int numberOfFoul;



    /**
     * This Method is to show Warning to the Player.
     * It indicate that a player has been officially cautioned. But he  may continue the game.
     */
   public  void giveYellowCard(){
        if(numberOfFoul <= 1){
            System.out.println("WARNING: A player can be out of the game. He has to be calm now while playing.");
            numberOfFoul++;
        }
   }

    /**
     * This Method is to shown by a referee to signify that a player must be sent off.
     */
   public  void giveRedCard(){
        if (numberOfFoul == 2){
            System.out.println("A player who has been sent off is required to leave the field of play immediately.");
        }
   }


}

