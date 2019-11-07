package structures;

public class Tree {
    private Tree parent;
    private Tree right;
    private Tree left;
    private Integer element;

    public void parent(Tree parent) {
        this.parent = parent;
    }

    public Tree parent() {
        return this.parent;
    }

    public void right(Tree right){
        right.parent(this);
        this.right = right;
    }

    public Tree right() {
        return right;
    }

    public Tree left() {
        return left;
    }

    public void left(Tree left) {
        left.parent(this);
        this.left = left;
    }

    public void element(Integer element) {
        this.element = element;
    }

    public Integer element() {
        return element;
    }

}
