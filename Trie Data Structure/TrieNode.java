package trie.data.structure;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TrieNode {
String def="";
List<Character> keys = new LinkedList<>();   // Contains all the characters in a TrieNode
boolean isEnd;
Map<Character,TrieNode> child;
//int priority;
public TrieNode() {
isEnd = false;
child = new HashMap<>();
//priority = 0;
}
public void addKey(char ch) {
keys.add(ch);
//priority = 0;
}

public void setDef(String def){
    this.def = def;
}

}
