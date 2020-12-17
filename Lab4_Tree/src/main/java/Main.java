//Стаганович 2 группа
//4 Лабораторная


public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = { 12, 70, 45, 23, 66, 15, 20 };
        tree.insertArr(arr);
        tree.print();

        System.out.println("ASC ORDER:");
        tree.inOrderAsc();
        System.out.println("\nDESC ORDER:");
        tree.inOrderDesc();
        System.out.println("\nEQUIV ORDER:");
        tree.eqSeq();
        System.out.println("\nACROSS ORDER");
        tree.AcrossSeq();
        System.out.println("\nTREE HEIGHT");
        System.out.println(tree.GetHeight(1, tree.getRoot()));

    }
}
