public class FooBarBazMumble {
 public static void main(String[] args)
   {
      UpperCase("aBcDEF");
      countLetters("aB123C4d56");
  }
   
 public static String UpperCase(String name){
   for (int i=0;i<name.length();i++){
       if (Character.isUpperCase(name.charAt(i))==true){
        name = Character.toString(name.charAt(i));
           System.out.print(name.charAt(i));
           
       }
   } 
   System.out.println();
   return name;
  }
  public static int countLetters(String phrase) {
    int count = 0;
   for (int i = 0; i < phrase.length(); i++) {
   char ch = phrase.charAt(i);
   if (Character.isLetter(ch)) {
     count++;
   }
  }
  return count;
 }
}