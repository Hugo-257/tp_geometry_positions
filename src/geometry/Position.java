package geometry;

public class Position{
    private int x;
    private int y;

    public Position(int x,int y){
        this.x=x;
        this.y=y;
    }

    public String getRepresentation(){
        return "x : "+this.x+"\ny : "+this.y;
    }

    public Position symmetricX(){
        return new Position(this.x,-this.y);
    }


    public void translate(int dx,int dy){
        this.x=x+dx;
        this.y=y+dy;
    }

    //Accesseurs
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

}