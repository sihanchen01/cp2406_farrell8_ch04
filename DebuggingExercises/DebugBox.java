public class DebugBox
{
   private int width = 1;
   private int length = 1;
   private int height = 1;

   public DebugBox() {
   }

   public DebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length;
      this.height = height;
   }
   public void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   public double getVolume()
   {
      return length * width * height;
   }
}
