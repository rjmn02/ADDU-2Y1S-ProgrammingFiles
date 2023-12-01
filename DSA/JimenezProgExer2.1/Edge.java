public class Edge {
    private Vertex connectedVertex;
	private int weight;
	

	public Edge(Vertex v, int w) {
        setConnectedVertex(v);
		setWeight(w);
	}	

    public Vertex getConnectedVertex() {
        return this.connectedVertex;
    }

    public void setConnectedVertex(Vertex connectedVertex) {
        this.connectedVertex = connectedVertex;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return "(" + connectedVertex.getData() + "," + weight + ")";
    }
}
