package service.lyvus.prgs.Level2;

import java.util.*;

public class P138476 {
  public int solution(int k, int[] tangerine) {
    Map<Integer, Integer> myMap = new HashMap<>();
    for (Integer size : tangerine) {
      if (myMap.containsKey(size)) {
        myMap.put(size, myMap.get(size) + 1); // getOrDefault로 최적화 가능
      } else {
        myMap.put(size, 1);
      }
    }

    List<Integer> valueList = new ArrayList<>(myMap.values());
    valueList.sort(Comparator.reverseOrder());

    int count = 0;
    int sum = 0;
    while (true) {
      sum += valueList.get(count++);
      if (sum >= k) break; // while (sum < k)로 최적화 가능
    }

    return count;
  }
}
