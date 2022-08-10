package pwo.app;

public class Sequence {
    
    public static void main(String[] args) {
        
        args = new String[] {"tri", "100", "0", "tri_100_0.txt"};
               
        (new SeqToFileApp()).run(args);
    }    
}
