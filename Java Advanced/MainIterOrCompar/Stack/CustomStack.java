package MainIterOrCompar.Stack;

import java.util.Iterator;

public class CustomStack implements Iterable<Integer>{
    private Node top;


    private class Node{
        private int element;
        private Node prev;

        public Node(int element) {
            this.element = element;
            this.prev = null;
        }
    }


    public CustomStack() {
        this.top = null;
    }
    public void Push(int element){
        Node newNode = new Node(element);

        if(this.top == null){
            this.top=newNode;
        }else {
            newNode.prev = this.top;
            this.top = null;
        }
    }
    public int Pop() throws IllegalAccessException {
        if(this.top == null){
            throw new IllegalAccessException("No Elements");
        }


        int element = this.top.element;

        this.top=this.top.prev;

        return element;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            private Node currentNode = top;

            @Override
            public boolean hasNext() {
                return this.currentNode != null;
            }

            @Override
            public Integer next() {
                int element = this.currentNode.element;

                this.currentNode = this.currentNode.prev;

                return element;
            }
        };
    }

}
