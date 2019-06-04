package Tree;

import java.util.Objects;

public class Tree implements ITree {

    Node head;

    private class Node {
        private String value;
        private int keyHash;
        private Node left;
        private Node right;

        public Node(String value) {
            this.value = value;
            this.keyHash = value.hashCode();
            System.out.println("добавлено " + value + " hashCode: " + value.hashCode());
        }
    }

    @Override
    public void get(String value) {
        if (Objects.isNull(value)) {
            throw new RuntimeException("Передана пустая строка");
        }
        if (Objects.isNull(head)) {
            throw new RuntimeException("Пусто, искать негде");
        } else {
            Node current = head;
            if (current.keyHash == value.hashCode()) {
                System.out.println("Найден элемент "+current.value+" HashCode: "+current.keyHash);
            } else {
                while (current.keyHash != value.hashCode() && (Objects.nonNull(current.left) || Objects.nonNull(current.right))) {
                    if (current.keyHash > value.hashCode()) {
                        current = current.left;
                    }
                    if (current.keyHash < value.hashCode()) {
                        current = current.right;
                    }
                }
                if (current.keyHash == value.hashCode())
                    System.out.println("Найден элемент "+current.value+" HashCode: "+current.keyHash);
                else
                    System.out.println("Не чего не найдено");

            }
        }
    }

    @Override
    public void put(String value) {
        if (Objects.isNull(value) || value == "")
            throw new RuntimeException("Передана пустая строка");
        if (Objects.isNull(head)) {
            head = new Node(value);
        } else {
            Node current = head;
            if (current.keyHash == value.hashCode()) {
                current.value = value;
            } else {
                while (current.keyHash != value.hashCode() && (Objects.nonNull(current.left) || Objects.nonNull(current.right))) {
                    if (current.keyHash > value.hashCode()) {
                        if (Objects.nonNull(current.left))
                            current = current.left;
                        else break;
                    }
                    if (current.keyHash < value.hashCode()) {
                        if (Objects.nonNull(current.right))
                            current = current.right;
                        else break;
                    }
                }

                if (current.keyHash == value.hashCode()) {
                    current.value = value;
                }

                if (current.keyHash > value.hashCode()) {
                    current.left = new Node(value);
                }
                if (current.keyHash < value.hashCode()) {
                    current.right = new Node(value);
                }
            }
        }
    }


}
