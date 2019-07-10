import java.util.Random;

public class DiceGame {
    public static void main(String[] ages){
	int[] dice = {1,2,3,4,5,6};
	int dis=0;
	int total=0;
	Random r = new Random();
	
	System.out.println("Rolling the dice...");
	
	for(int i = 0; i < 2 ; i ++){
	    dis = dice[r.nextInt(5)];
	    total += dis;
	    System.out.println("Die " + (i+1) + ": " + dis);
	}
	System.out.println("Total value: " + total);
	if(total > 7) System.out.println("You won");
	else System.out.println("You lost");
    }
}
