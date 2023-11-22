public class CoinGame {
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
}
