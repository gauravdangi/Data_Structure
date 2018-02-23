
package trie.data.structure;
import java.util.*;
/**
 *
 * @author Gaurav
 */
public class Main {
    public static void main(String[] args) {
       TrieDataStructure t = new TrieDataStructure();
       Scanner scan = new Scanner(System.in);
       t.insert("Gaurav","Name of a developer");
       t.insert("Gauravd2196", "Gaurav's instagram username");
       t.insert("Gaurav dangi","Full name of Gaurav");
       t.insert("abstract","Hiding background information");
       t.insert("abcf","Random");
       t.insert("cdf","Random");
       t.insert("efgh","Random");
       t.insert("abc xyz","Random");
       t.insert("ls -lart","Random");t.insert("ls","Linux command");
       t.insert("cd..","Linux command");
       t.insert("readarray","Linux command");
       t.insert("noob","Linux command");
       int flag = 1;
       do{ 
           System.out.print("Enter word you want to search: ");
           String word = scan.nextLine();
           System.out.println("Search result for '"+word+"' : "+t.search(word));
           System.out.println("Do you wish to search again? (1 for Yes and others for No)");
           flag = scan.nextInt();
           scan.nextLine();
       }while(flag == 1);
       
       //System.out.println("Search result for 'cd' : "+t.search("cd"));
       //System.out.println("Search result for 'abcf' : "+t.search("n")); 
       //t.printRoot();
    }   
}
