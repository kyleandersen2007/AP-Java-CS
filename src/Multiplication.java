public class Multiplication{
    public static void main(String[] args) {
        int size = 10;

        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                System.out.print(i * j + " ");
            }

            System.out.println();
        }
    }
}