package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Implement a trie with insert, search, and startsWith methods.

 * Note:
 * You may assume that all inputs are consist of lowercase letters a-z.

 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);

 * Created by xuzhuchen on 3/21/18.
 */
public class Trie {
    private class Node {
        char element;
        LinkedList<Node> childs = new LinkedList<>();

        Node(char element) {
            this.element = element;
        }

        Node(char element, LinkedList<Node> childs) {
            this.element = element;
            this.childs = childs;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || obj.getClass() != this.getClass()) return false;
            else {
                Node x = (Node)obj;
                if(element != x.element) return false;
            }
            return true;
        }
    }

    private Node root;

    /** Initialize your data structure here. */
    public Trie() {
        this.root = new Node('.');
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] chars = word.toCharArray();
        Node current = root;
        for (int i = 0; i < chars.length; i++) {
            Node x = new Node(chars[i]);
            if(!current.childs.contains(x)){
                current.childs.add(x);
            }
            current = current.childs.get(current.childs.indexOf(x));
        }

    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] chars = word.toCharArray();
        Node current = root;
        for (int i = 0; i < chars.length; i++) {
            Node x = new Node(chars[i]);
            if (current.childs.contains(x)){
                current = current.childs.get(current.childs.indexOf(x));
            }else {
                return false;
            }
        }
        if (current.childs.isEmpty()) return true;
        else return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] chars = prefix.toCharArray();
        Node current = root;
        for (int i = 0; i < chars.length; i++) {
            Node x = new Node(chars[i]);
            if (current.childs.contains(x)){
                current = current.childs.get(current.childs.indexOf(x));
            }else {
                return false;
            }
        }
        return true;
    }
}
