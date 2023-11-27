import java.lang.Math;
public class CoinGame {
    int startingCoins = 10;
    int maxRounds = 5;
    public int getPlayer2Move(int round){ //Created Function
        int result = 0; //I have to set this to zero because of my IDE
        if (round % 3 == 0) { // if divisible by 3 return 3
            return result = 3;
        } else if (round % 2 == 0) { // if divisible by 2 but not 3 return 2
            return result = 2;
        } else { // if not divisible by 3 or 2, return 1
            return result = 1;
        }
    }
    public int getPlayer1Move(int round){ //Created Function
        int result = 0; //I have to set this to zero because of my IDE
        if (round % 3 == 0) { // if divisible by 3 return 3
            return result = 3;
        } else if (round % 2 == 0) { // if divisible by 2 but not 3 return 2
            return result = 2;
        } else { // if not divisible by 3 or 2, return 1
            return result = 1;
        }
    }
    //PART B
    public void playGame(){
        int round = 1;
        int player1CoinCount = startingCoins;
        int player2CoinCount = startingCoins;

        boolean endGame = false; // boolean to check if player(s) have less than 3 coins
        while(round <= maxRounds && !endGame){
            
            int p1 = getPlayer1Move(round); // p1 is the amount coins player 1 will spend during the current round
            int p2 = getPlayer2Move(round); // p2 is the amount coins player 2 will spend during the current round

            if(p1 == p2){ // Rule 1
                player2CoinCount++;
            }
            else if((Math.abs(p1 - p2) == 1) && p1 != p2 ){ // Rule 2
                player2CoinCount++;
            }
            else if((Math.abs(p1 - p2) == 2) && p1 != p2 ){ // Rule 3
                player1CoinCount+=2;
            }

            if(player1CoinCount < 3 || player2CoinCount < 3){ // End the game if the players coin count is less than 3
                endGame = true;
            }

            player1CoinCount -= p1; //Take the coins away from the player
            player2CoinCount -= p2;

            round++;
        }

        if(player1CoinCount > player2CoinCount){
            System.out.println("P1 wins!");
        }
        else if(player1CoinCount < player2CoinCount)
        {
            System.out.println("P2 wins!");
        }
        else if(player1CoinCount == player2CoinCount)
        {
            System.out.println("Tie!");
        }
    }
}

