import java.util.ArrayList;
import java.util.HashMap;

public class JewelsAndStones {

    public static int numJewelsInStones(String J, String S) {
        String[] stones;
        HashMap<String, Integer> hashMapStones = new HashMap<>();
        stones = S.split("");
        for (int i = 0; i < stones.length; i++) {
/*            if (hashMapStones.get(stones[i]) == null) {
                hashMapStones.put(stones[i], 0);
            }
            else {*/
                hashMapStones.put(stones[i], hashMapStones.get(stones[i]) != null ? hashMapStones.get(stones[i]) + 1 : 1);
           /* }*/
        }
        String[] jewels;
        jewels = J.split("");
            int jewelsCounter = 0;
        for (int i = 0; i < jewels.length; i++) {
            if (hashMapStones.containsKey(jewels[i])) {
                jewelsCounter += hashMapStones.get(jewels[i]);
            }
        }
        return jewelsCounter;
    }
}
