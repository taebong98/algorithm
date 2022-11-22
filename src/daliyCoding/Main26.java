package daliyCoding;

import java.util.ArrayList;

public class Main26 {
    public static void main(String[] args) {
        Main26.tree root = new Main26.tree("1");
        Main26.tree rootChild1 = root.addChildNode(new Main26.tree("2"));
        Main26.tree rootChild2 = root.addChildNode(new Main26.tree("3"));
        Main26.tree leaf1 = rootChild1.addChildNode(new Main26.tree("4"));
        Main26.tree leaf2 = rootChild1.addChildNode(new Main26.tree("5"));
    }

    public static ArrayList<String> dfs(tree node) {
        // TODO:
        ArrayList<String> list = new ArrayList<>();
        list.add(node.getValue());
        System.out.println(list);
        return list;
    }


    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
