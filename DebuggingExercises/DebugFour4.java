// This class discounts prices by 10%
public class DebugFour4
{
   public static void main(String []args)
   {
      final double DISCOUNT_RATE = 0.90;
      int price = 100;
      double price2 = 100.00;
      tenPercentOff(price, DISCOUNT_RATE);
      tenPercentOff(price2, DISCOUNT_RATE);
   }

   public static void tenPercentOff(double p, double rate)
   {
      double newPrice = rate * p;
      System.out.println("Ten percent off " + p);
      System.out.println("  New price is " + newPrice);
   }
}
