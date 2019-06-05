package Tree;

import java.util.Objects;

public class Tree implements ITree {

    Node head;
    private class Node {
        private String value;
        private String key;
        private Node left;
        private Node right;

        public Node(String key, String value) {
            this.value = value;
            this.key = key;
            System.out.println("добавлено " + value + " hashCode: " + value.hashCode());
        }
    }

    @Override
    public void get(String key) {
        if (Objects.isNull(key)) {
            throw new RuntimeException("Передана пустая строка");
        }
        if (Objects.isNull(head)) {
            throw new RuntimeException("Пусто, искать негде");
        } else {
            Node current = head;
            if (current.key.hashCode() == key.hashCode()) {
                System.out.println("Найден элемент "+current.value+" HashCode: "+current.key.hashCode());
            } else {
                while (!current.key.equals(key) && (Objects.nonNull(current.left) || Objects.nonNull(current.right))) {
                    if (current.key.hashCode() > key.hashCode()) {
                        current = current.left;
                    }
                    if (current.key.hashCode() < key.hashCode()) {
                        current = current.right;
                    }
                }
                if (current.key.equals(key) )
                    System.out.println("Найден элемент "+current.value+" HashCode: "+current.key.hashCode());
                else
                    System.out.println("Не чего не найдено");

            }
        }
    }

    @Override
    public void put(String key, String value) {
        if (Objects.isNull(key) || key.isEmpty())
            throw new RuntimeException("Передана пустая строка");
        if (Objects.isNull(head)) {
            head = new Node(key, value);
        } else {
            Node current = head;
            if (current.key == key) {
                current.key = key;
                current.value = value;
            } else {
                while (!current.key.equals(key)  && (Objects.nonNull(current.left) || Objects.nonNull(current.right))) {
                    if (current.key.hashCode() > key.hashCode()) {
                        if (Objects.nonNull(current.left))
                            current = current.left;
                        else break;
                    }
                    if (current.key.hashCode() < value.hashCode()) {
                        if (Objects.nonNull(current.right))
                            current = current.right;
                        else break;
                    }
                }

                if (current.key.hashCode() == key.hashCode()) {
                    current.key = key;
                    current.value = value;
                }

                if (current.key.hashCode() > key.hashCode()) {
                    current.left = new Node(key, value);
                }
                if (current.key.hashCode() < key.hashCode()) {
                    current.right = new Node(key, value);
                }
            }
        }
    }


}
