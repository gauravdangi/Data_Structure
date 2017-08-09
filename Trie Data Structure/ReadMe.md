# Trie Data Structure

Trie is an efficient information retrieval data structure. Using trie, search complexities can be brought to optimal limit (key length).

Every node of trie consists of multiple branches. Each branch represents a possible character of keys. We need to mark the last node of every key as leaf node. A trie node field value will be used to distinguish the node as leaf node (there are other uses of the value field).

## Output

Search result for 'abc' : false

Search result for 'Gaurav' : true

Search result for 'cd' : false

Search result for 'abcf' : true
