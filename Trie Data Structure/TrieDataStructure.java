
package trie.data.structure;
import java.util.*;
/*
 * @author Gaurav
 */
public class TrieDataStructure {
    TrieNode root = new TrieNode();
   
    // --------------------- Inserting a TrieNode ----------------------------
    public void insert(String str) {
        TrieNode temp = root;
        char[] chr = str.toCharArray();
        for(int i=0;i<chr.length;i++){
            TrieNode t;
            if(!temp.child.containsKey(chr[i])){
                t = new TrieNode(chr[i]);
               temp.child.put(chr[i],t);
            }
            else{
             t = temp.child.get(chr[i]);
            }
              
            temp = t;
        }
        
        temp.isEnd = true;
    }
    
    
    // --------------------- search() ----------------------------
    public boolean search(String str){
        char[] arr = str.toCharArray();
        TrieNode temp = root;
        int flag=1;
        for(int i=0;i<arr.length;i++){
            TrieNode t;
         if(temp.child.containsKey(arr[i])){
             temp = temp.child.get(arr[i]);
         }
         else
             flag=0;
        }
        if(flag==1){
            if(temp.isEnd==true)
                return true;
                     
        }
        
        return false;
    
    }
    
    
    // --------------------- main() ----------------------------
    public static void main(String[] args) {
       TrieDataStructure t = new TrieDataStructure();
       t.insert("Gaurav");
       t.insert("abcd");
       t.insert("abcf");
       t.insert("cdf");
       t.insert("efgh");
       System.out.println("Search result for 'abc' : "+t.search("abc"));
       System.out.println("Search result for 'Gaurav' : "+t.search("Gaurav"));
       System.out.println("Search result for 'cd' : "+t.search("cd"));
       System.out.println("Search result for 'abcf' : "+t.search("abcf"));
    }   
}
