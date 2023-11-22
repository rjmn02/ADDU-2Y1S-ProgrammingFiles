public class Vertex{
    protected Character data;

    public Vertex(Character data){
        this.data = data;
    }

    public Character getData() {
        return this.data;
    }

    public void setData(Character data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return this.data + "";
    }
}