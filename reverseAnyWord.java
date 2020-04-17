public class reverseAnyWord
{

   public static void main(String[] args)
   {
   //You can put any word into this
   //Try to put Scanner object in this
      String anyWord = "Igetitcrunk";
      int i = anyWord.length();
      int b = anyWord.length() - 1;
      int y = 0;
    
    //Figure out why it says indexOutOfBounds
          while (i >= y)
          {
              System.out.println(anyWord.substring(b, i));
               b--;
               i--;     
          }
          
          //Code below does nothing
          if (!(i >= y))
          {
              System.out.println("Stopped");
          }
          
            

}
}