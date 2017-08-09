# Trie Data Structure

Trie is an efficient information retrieval data structure. Using trie, search complexities can be brought to optimal limit (key length).

Every node of trie consists of multiple branches. Each branch represents a possible character of keys. We need to mark the last node of every key as leaf node. A trie node field value will be used to distinguish the node as leaf node (there are other uses of the value field).

## Applications Of Trie Data Structure

### Auto Complete

Auto Complete functionality is used widely in mobile apps and text editors. Trie is an efficient data structure widely used for its implementation. Trie provides an easy way to search for the possible dictionary words to complete word because of the following reasons

Looking up data in a trie is faster in the worst case O(n)(n = size of the string involved in the operation) time compared to an imperfect hash table. An imperfect hash table can have key collisions. A key collision is the hash function mapping of different keys to the same position in a hash table.

### A trie can provide an alphabetical ordering of the entries by key.

Searching in a trie enables us to trace pointers to get to a node that represent the string user has entered. By exploring a trie traversing down the tree, we can easily enumerate all strings that complete the user input.

### Spell Checkers

Spell checking is a three-step process. Check if a word is in a dictionary, generate potential suggestions, and then sort the suggestions–hopefully with the intended word on top.
Tries can be used to store that dictionary and by searching the words over the data structure one can easily implement a spell checker in the most efficient way. Using trie not only the lookup for a word into the dictionary becomes easy but an algorithm to provide the list of valid words or suggestions can be easily constructed.

### Longest Prefix Matching

Also called Maximum prefix length match refers to an algorithm used by routers in Internet protocol(IP) networking to select an entry from a routing table.
One of the first IP lookup techniques to employ tries is the radix trie implementation in the BSD kernel. Optimizations requiring contiguous masks bound the worst case lookup time to O(W) where W is the length of the address
in bits. In order to speed up the lookup process,multi bit trie schemes were developed which perform a search using multiple bits of the address at a time.

### Automatic Command completion
When using an operating system such as Unix, we type in system commands to accomplish certain tasks.
We can simply the task of typing in commands by providing a command completion facility which automatically types in the command suffix once the user has typed in a long enough prefix to uniquely identify the command. For instance, once the letters psi have been entered, we know that the command must be psidtopgm because there is only one command that has the prefix psi.

For more Details:

https://en.wikipedia.org/wiki/Trie

http://blog.xebia.in/index.php/2015/09/28/applications-of-trie-data-structure/

------------------------------------------------------------------------------

## Output

Search result for 'abc' : false

Search result for 'Gaurav' : true

Search result for 'cd' : false

Search result for 'abcf' : true
