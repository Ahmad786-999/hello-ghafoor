import java.util.Vector;
public class hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        for(int i=0;i<3;i++){
        System.out.println("Ahmad Salman");
        }
        System.out.println("20/08/2006");
        System.out.println("Forza Spezia");

        Vector<Character> lettere = new Vector<>();
        lettere.add('g');
        lettere.add('h');
        lettere.add('a');
        lettere.add('f');
        lettere.add('o');
        lettere.add('o');
        lettere.add('r');
        
        for(char lettera : lettere){
            System.out.println(lettera);

        }
    }
}
