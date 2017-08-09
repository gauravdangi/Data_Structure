
package trie.data.structure;
import java.util.HashMap;
import java.util.Map;

public class TrieNode {
char value;
boolean isEnd;
Map<Character,TrieNode> child;
//int priority;
public TrieNode() {
//this.value = value;
isEnd = false;
child = new HashMap<>();
//priority = 0;
}

public TrieNode(char ch) {
this.value = ch;
isEnd = false;
child = new HashMap<>();
//priority = 0;
}

}
