package service.lyvus.prgs.Level2;

public class P12945 {
  public int solution(int n) {
    int frontNum = 1;
    int backNum = 0;
    int sum = 0;
    int count = 1;

    while (count < n) {
      sum = (frontNum + backNum) % 1234567;
      backNum = frontNum;
      frontNum = sum;
      count++;
    }

    return sum;
  }
}
