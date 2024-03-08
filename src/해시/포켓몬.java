package 해시;

import java.util.HashMap;
import java.util.Map;

public class 포켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
        System.out.println(solution(new int[]{3,3,3,2,2,4}));
        System.out.println(solution(new int[]{3,3,3,2,2,2}));
    }

    static int solution(int[] nums) {
        int pick = nums.length/2;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int n:nums) {
            hashMap.put(n, (hashMap.containsKey(n) ? hashMap.get(n)+1 : 1));
        }

        return (pick <= hashMap.size() ? pick : hashMap.size());
    }
}
