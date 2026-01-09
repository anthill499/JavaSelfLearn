import java.util.Optional;
class LinkedListNode extends Node {
    Optional<LinkedListNode> next;
    public LinkedListNode(long value, Optional<LinkedListNode> next) {
        super(value); // Calls parent's constructor
        this.next = next;
        
    }

    public void setNext(Optional<LinkedListNode> nextNode) {
        this.next = nextNode;
    }

    

} 