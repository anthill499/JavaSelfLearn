
/**
 * @author Anthony Huang
 * This class is a parent class for all nodes used in the DSA section
 */
class Node {
    public long value;

    public Node(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }

    public void setValue(long newVal) {
        this.value = newVal;
    }

}