package api;

public class test {
    public static void main(String[] args) {
    directed_weighted_graph g1 = new DW_GraphDS();
    node_data n1 = new NodeData();
    node_data n2 = new NodeData();
    node_data n3 = new NodeData();
    node_data n4 = new NodeData();

        g1.addNode(n1);
        g1.addNode(n2);
        g1.addNode(n3);
        g1.addNode(n4);
        g1.connect(n1.getKey(),n2.getKey(),3.0);
        g1.connect(n1.getKey(),n2.getKey(),4.0);
        g1.connect(n2.getKey(),n1.getKey(),5.0);
        System.out.println(g1.getEdge(n1.getKey(),n2.getKey()).getWeight());
        System.out.println(g1.getE(n1.getKey()));
        //g1.removeEdge(n1.getKey(),n2.getKey());
     //  System.out.println(g1.getEdge(n2.getKey(),n1.getKey()).getWeight());
        g1.removeNode(n2.getKey());
       System.out.println(g1.edgeSize());

    }
}
