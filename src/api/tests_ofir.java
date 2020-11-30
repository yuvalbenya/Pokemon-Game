package api;

public class tests_ofir {
    public static void main(String[] args) {

        node_data n0=new NodeData();
        node_data n1=new NodeData();
        node_data n2=new NodeData();

        node_data n3=new NodeData();
        node_data n4=new NodeData();
        node_data n5=new NodeData();

        node_data n6=new NodeData();
        node_data n7=new NodeData();
        node_data n8=new NodeData();

        node_data n9=new NodeData();
        node_data n10=new NodeData();
        node_data n11=new NodeData();


        directed_weighted_graph graph1 =new DW_GraphDS();

        graph1.addNode(n0);
        graph1.addNode(n1);
        graph1.addNode(n2);
        graph1.connect(0,1,5);
        graph1.connect(1,2,5);
        graph1.connect(2,0,5);
        dw_graph_algorithms g1= new dw_graph_algorithmsImpl();
        g1.init(graph1);

        System.out.println(g1.isConnected());

///////////
        directed_weighted_graph graph2 =new DW_GraphDS();
        graph2.addNode(n3);
        graph2.addNode(n4);
        graph2.addNode(n5);
        graph2.connect(3,4,5);
        graph2.connect(4,3,5);
        graph2.connect(4,5,5);
        graph2.connect(5,4,5);
        graph2.connect(5,6,5);
        graph2.connect(6,5,5);
        dw_graph_algorithms g2= new dw_graph_algorithmsImpl();
        g2.init(graph2);
        System.out.println(g2.isConnected());

        ///////////
        directed_weighted_graph graph3 =new DW_GraphDS();
        graph3.addNode(n6);
        graph3.addNode(n7);
        graph3.addNode(n8);
        graph3.connect(6,7,5);
        graph3.connect(6,8,5);
        dw_graph_algorithms g3= new dw_graph_algorithmsImpl();
        g3.init(graph3);
        System.out.println(g3.isConnected());

        ///////////
        directed_weighted_graph graph4 =new DW_GraphDS();
        graph4.addNode(n6);
        graph4.addNode(n7);
        graph4.addNode(n8);
        graph4.connect(9,10,5);
        graph4.connect(10,9,5);
        dw_graph_algorithms g4= new dw_graph_algorithmsImpl();
        g4.init(graph4);
        System.out.println(g4.isConnected());









    }
}
