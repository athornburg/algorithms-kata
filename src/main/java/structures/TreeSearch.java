package structures;

public class TreeSearch {

    public Tree search(Tree tree, Integer item) {
        if (item == null) {
            return null;
        }
        if (tree.element().equals(item)) {
            return tree;
        }

        if (item < tree.element()) {
            return search(tree.left(), item);
        } else {
            return search(tree.right(), item);
        }
    }
}
