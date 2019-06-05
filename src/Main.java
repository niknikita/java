import Tree.ITree;
import Tree.Tree;
public class Main {

    public static void main(String[] args) {
        ITree tree = new Tree();
        System.out.println("добавлено baa "+"hashCode: "+"baa".hashCode());
        System.out.println("добавлено bab "+"hashCode: "+"bab".hashCode());
        System.out.println("добавлено aav "+"hashCode: "+"aav".hashCode());
        System.out.println("добавлено afa "+"hashCode: "+"afa".hashCode());
        System.out.println("добавлено bz9 "+"hashCode: "+"bz9".hashCode());
        System.out.println("");


        tree.put("baa", "qqq");
        tree.put("bab", "www");
        tree.put("aav", "eee");
        tree.put("afa", "rrr");
        tree.put("bz9", "ttt");

        System.out.println("");
        tree.get("baa");
        tree.get("bab");
        tree.get("aav");
        tree.get("afa");
        tree.get("bz9");
    }
}
