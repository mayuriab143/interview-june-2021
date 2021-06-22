package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
   
    return "";
  }
}
