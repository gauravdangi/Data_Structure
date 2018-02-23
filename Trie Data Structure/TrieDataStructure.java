package trie.data.structure;
import java.util.*;
/*
 * @author Gaurav
 */
public class TrieDataStructure {
    TrieNode root = new TrieNode();
   
    // --------------------- Inserting a TrieNode ----------------------------
    public void insert(String str,String def) {
        str = str.toLowerCase();
        TrieNode temp = root;
        char[] chr = str.toCharArray();
        for(int i=0;i<chr.length;i++){
            TrieNode t;
            if(!temp.child.containsKey(chr[i])){
                t = new TrieNode();
                temp.addKey(chr[i]);
               temp.child.put(chr[i],t);
            }
            else{
             t = temp.child.get(chr[i]);
            }
            temp = t;
        }
        temp.isEnd = true;
        temp.setDef(def);
    }
    
    
    // --------------------- search() ----------------------------
    public boolean search(String str){
        str = str.toLowerCase();
        System.out.println("_____________________________________________________");
        //System.out.println("Search results for "+str);
        char[] arr = str.toCharArray();
        TrieNode temp = root;
        int flag=1;
        for(int i=0;i<arr.length;i++){
            if(flag==0)
                break;
            TrieNode t;
         if(temp.child.containsKey(arr[i])){
             temp = temp.child.get(arr[i]);
         }
         else{
             flag=0;
             return false;
         }
        }
        if(flag==1){
            if(temp.isEnd==true){
                System.out.println("Definition: "+temp.def);
                return true;
<<<<<<< HEAD
            }
                
            else{
                System.out.println("Do you mean?");
                Options(temp,str);
            }          
=======
>>>>>>> origin/master
        }
        return false;
    }
    
    // -------- Options() method: It prints all strings on the basis of prefix str --------
    public void Options(TrieNode temp,String str){
        if(temp.isEnd){
            System.out.println(str);
        }
        //String word = str;
        for(Map.Entry map : temp.child.entrySet()){
            String word = str;
            char a = (char) map.getKey();
            word += a;
            Options(temp.child.get(a),word);
        }
    }
    
    public void printRoot(TrieNode temp){
        for(Map.Entry map : temp.child.entrySet()){
            System.out.print(temp.keys+" --- ");
            printRoot((TrieNode) map.getValue());
        }
        
    }
    public void printRoot(){
        printRoot(root);
    }
    
    // --------------------- main() ----------------------------
    
}
