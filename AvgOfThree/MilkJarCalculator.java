public class MilkJarCalculator
{
   public static void main(String[] args)
   {
      double milk = 5.5; // gallons
      double jarCapacity = 0.75; // gallons
      double filledJars =  milk / jarCapacity;
      int completelyFilledJars = (int) filledJars;
      
      System.out.println(completelyFilledJars);
   }
}
