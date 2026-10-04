package service.rayne.prgs.Level2;

public class P12911 {
  public int solution(int n) {
    int myCount = countOne(n);

    while (true) {
      int cycleCount = countOne(++n);
      if (myCount == cycleCount) return n;
    }
  }

  private int countOne(int num) {
    int count = 0;

    while (num > 0) {
      if (num % 2 == 1) count++;
      num /= 2;
    }

    return count;
  }
}
