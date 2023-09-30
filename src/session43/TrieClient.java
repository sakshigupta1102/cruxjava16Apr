package session43;

public class TrieClient {
public static void main(String[] args) {
	Trie trie = new Trie();
	trie.insert("POOJA");
	trie.insert("POONAM");
	trie.insert("PANKAJ");
	trie.insert("RAJ");
	trie.insert("RAJU");
	System.out.println(trie.startsWith("RAJ"));
	System.out.println(trie.contains("RAJ"));
	System.out.println(trie.startsWith("POO"));
	System.out.println(trie.contains("POO"));
	
}
}
