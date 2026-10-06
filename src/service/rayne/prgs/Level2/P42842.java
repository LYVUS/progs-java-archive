package service.rayne.prgs.Level2;

public class P42842 {
  public int[] solution(int brown, int yellow) {
    int rowCount = (brown / 2) - 3;
    int colCount = 1;

    while (rowCount >= colCount) {
      if ((rowCount * colCount) == yellow) break;

      rowCount--;
      colCount++;
    }

    return new int[]{rowCount + 2, colCount + 2};
  }
}
