package api;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class dw_graph_algorithmsImpl implements dw_graph_algorithms {
    private directed_weighted_graph graph;

   // reset the tag of all the nodes
    private void reset(int a){
        for (node_data v:this.graph.getV()) {
            v.setTag(a);
        }
    }
    /**
     * Init the graph on which this set of algorithms operates on.
     *
     * @param g
     */
    @Override
    public void init(directed_weighted_graph g) {
        this.graph = g;
    }

    /**
     * Return the underlying graph of which this class works.
     *
     * @return
     */
    @Override // check if is ok
    public directed_weighted_graph getGraph() {

        return this.graph;
    }

    /**
     * Compute a deep copy of this weighted graph.
     *
     * @return
     */
    @Override // yuval will do this.
    public directed_weighted_graph copy() {
        return null;
    }

    /**
     * Returns true if and only if (iff) there is a valid path from each node to each
     * other node. NOTE: assume directional graph (all n*(n-1) ordered pairs).
     *
     * @return
     */
    @Override
    public boolean isConnected() {
        Queue<node_data> bfsq = new LinkedList<>();
        int sizeG = graph.getV().size();

        int counter = 0;
        node_data first = null; // pointer for node_data
        reset(-1);
       boolean flag=true;
        for (node_data n : graph.getV()) { // run on all the nodes in the graph and check if is connected to all.
            first = n;
            if (first == null) {// if the graph is empty
                return true;
            }
            bfsq.add(first);
            first.setTag(0);
            counter++;
            while (!bfsq.isEmpty()) {
                node_data tmp = bfsq.poll();
                for (edge_data neighbor_node : graph.getE(tmp.getKey())) { // run on the neighbors node and tag them
                    int dest_node = neighbor_node.getDest();
                    if (graph.getNode(dest_node).getTag() != 0) {
                        counter++;
                        graph.getNode(dest_node).setTag(0);
                        bfsq.add(graph.getNode(dest_node));
                    }
                }
            }
            if (sizeG != counter) {
                flag = false;
                break;
            }
            reset(-1);
            counter=0;
        }


        return flag;
    }



    /**
     * returns the length of the shortest path between src to dest
     * Note: if no such path --> returns -1
     *
     * @param src  - start node
     * @param dest - end (target) node
     * @return
     */
    @Override
    public double shortestPathDist(int src, int dest) {
        return 0;
    }

    /**
     * returns the the shortest path between src to dest - as an ordered List of nodes:
     * src--> n1-->n2-->...dest
     * see: https://en.wikipedia.org/wiki/Shortest_path_problem
     * Note if no such path --> returns null;
     *
     * @param src  - start node
     * @param dest - end (target) node
     * @return
     */
    @Override
    public List<node_data> shortestPath(int src, int dest) {
        return null;
    }

    /**
     * Saves this weighted (directed) graph to the given
     * file name - in JSON format
     *
     * @param file - the file name (may include a relative path).
     * @return true - iff the file was successfully saved
     */
    @Override
    public boolean save(String file) {
        return false;
    }

    /**
     * This method load a graph to this graph algorithm.
     * if the file was successfully loaded - the underlying graph
     * of this class will be changed (to the loaded one), in case the
     * graph was not loaded the original graph should remain "as is".
     *
     * @param file - file name of JSON file
     * @return true - iff the graph was successfully loaded.
     */
    @Override
    public boolean load(String file) {
        return false;
    }
}
