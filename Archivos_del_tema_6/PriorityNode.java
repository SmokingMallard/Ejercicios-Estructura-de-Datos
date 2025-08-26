public class PriorityNode<T> {
    private int priority;
    private T data;

    public PriorityNode() {}

    public PriorityNode(int priority, T data) {
        this.priority = priority;
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PriorityNode{" + "priority=" + priority + ", data=" + data + '}';
    }
}