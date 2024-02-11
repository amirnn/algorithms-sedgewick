package org.bluecpp.assignment2;

import org.bluecpp.assignment2.Node;

public class UnionGraph<T> {

    Node<T>[] m_nodes;
    int m_count; // component count

    UnionGraph(int count) {
        @SuppressWarnings("unchecked") final Node<T>[] nodes = (Node<T>[]) new Object[count];
        m_nodes = nodes;
    }

    public int getComponentsCount() {
        return m_count;
    }

    /**
     * return true if p and q are in the same component
     */
    public boolean connected(Node<T> p, Node<T> q) {
        Node<T> pc = findComponent(p);
        Node<T> qc = findComponent(q);
        return pc == qc;
    }

    /**
     * Connects p -> q
     */
    public void union(Node<T> p, Node<T> q) {
        p.setNext(q.getNext());
    }

    /**
     * Componentidentifierforp (0 to N-1)
     * @return Root node of component
     */
    public Node<T> findComponent(Node<T> node) {
        if (node.getNext() == null){
            return node;
        }
        else {
            Node<T> root = node.getNext();
            while (root.getNext()!= null)
            {
                root = root.getNext();
            }
            return root;
        }
    }

}
