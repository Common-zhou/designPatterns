package com.zhou;

import com.google.common.graph.ElementOrder;
import com.google.common.graph.Graph;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2022/01/17 14:31
 */
public class DiGraphTest {
  public static void main(String[] args) {
    MutableGraph<Object> graph =
        GraphBuilder.directed().allowsSelfLoops(false).nodeOrder(ElementOrder.unordered()).expectedNodeCount(
            100).build();

    graph.addNode("a");
    graph.addNode("b");
    graph.addNode("c");

    graph.putEdge("a", "b");
    graph.putEdge("b", "c");
    //graph.putEdge("c", "a");

    System.out.println(graph);
    System.out.println(Graphs.hasCycle(graph));
  }
}
