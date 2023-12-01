public class Vertex {
    private char data;

    public Vertex(char d){
        setData(d);
    }

    public char getData() {
        return this.data;
    }

    public void setData(char data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return getData() + "";
    }

}