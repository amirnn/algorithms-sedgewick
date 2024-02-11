package org.bluecpp.assignment2;

public class Node<T> {
    private Node<T> m_next = null;
    private T m_content;
    Node(T content, Node<T> next){
        m_next = next;
        m_content = content;
    }
    public Node<T> getNext() {
        return m_next;
    }
    public void setNext(Node<T> next) {
        this.m_next = next;
    }
    public T getContent() {
        return m_content;
    }
    public void setContent(T content) {
         this.m_content =content;
    }
    public boolean isRoot(){ return m_next == null; }
}
