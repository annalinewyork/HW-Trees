/**
 * Created by c4q-nali on 11/4/15.
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.makeBST(new int[]{4,6,9,10,2,59,66,14});
        tree.printPrefix();
        System.out.println(tree.exist(4));
    }
}