import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Spell {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int k = 0;

        // Create an ArrayST<String, String> object called st. 
        ArrayST<String, String> st = new ArrayST<String, String>();
        //String [] tokens;
        String [] str;
        // For each line in lines, split it into two tokens using
        // "," as delimiter; insert into st the key-value pair
        // (token 1, token 2).
        String[] key = in.readAllStrings();
        String a = "";
        String b = "";
       for (int i = 0; i < key.length; i++) {     
       	   for (int j = 0; j < key[i].length() - 1; j++) 
       	  	{         
       	  		if (key[i].substring(j, j + 1).equals(",")) {            
       	  		a = key[i].substring(0, j);            
       	  		b = key[i].substring(j + 1, key[i].length());         
       	  		}     
       	  	}
          st.put(a, b);  
       }   
        //in.close();
            
        // Read from standard input one line at a time; increment
        // a line number counter; split the line into words using
        // "\\b" as the delimiter; for each word in words, if it
        // exists in st, write the (misspelled) word, its line number, and
        // corresponding value (correct spelling) from st.
        String line = null;
        while (!StdIn.isEmpty()) {

           line = StdIn.readLine();
           str = line.split("\\b");
           for (int i = 0; i < str.length; i++) {
              String c = str[i];
              if(st.contains(c)){

                  StdOut.println(str[i]+":"+k+" -> "+st.get(str[i]));
                  
              }
           }
        k++;
        str = null;
        in.close();
        }

    }
