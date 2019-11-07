import org.junit.Test;
import structures.Tree;
import structures.TreeSearch;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TreeTest {

    @Test
    public void parent_findsItsParent() {
        Tree tree = new Tree();

        Tree expectedTree = new Tree();

        tree.parent(expectedTree);

        assertThat(tree.parent()).isEqualTo(expectedTree);
    }

    @Test
    public void right_findsRightChild() {
        Tree root = new Tree();

        Tree right = new Tree();

        root.right(right);

        assertThat(root.right()).isEqualTo(right);
        assertThat(right.parent()).isEqualTo(root);
    }

    @Test
    public void left_findsLeftChild() {
        Tree root = new Tree();
        Tree left = new Tree();

        root.left(left);

        assertThat(root.left()).isEqualTo(left);
        assertThat(left.parent()).isEqualTo(root);
    }

    @Test
    public void element_returnsTheElement() {
        Tree tree = new Tree();

        tree.element(1);

        assertThat(tree.element()).isEqualTo(1);
    }

    @Test
    public void treeSearch_findsAnElementInTheTree() {
        Tree tree = new Tree();

        tree.element(1);

        Tree two = new Tree();
        two.element(2);

        Tree three = new Tree();
        three.element(3);

        Tree four = new Tree();
        three.element(4);

        Tree five = new Tree();
        three.element(5);

        tree.left(two);
        tree.right(three);
        three.left(four);
        three.right(five);

        TreeSearch search = new TreeSearch();

        Tree foundRight = search.search(tree, 5);

        assertThat(foundRight).isEqualTo(three);

    }
}