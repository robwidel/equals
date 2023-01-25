public class Ball implements Cloneable{
    int size;
    String name;
    public Ball(int size, String name){
        this.size = size;
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public boolean equals(Ball ball2) {

        if(this.size == ball2.size && this.name == ball2.name && this == ball2){
            return true;
        }
        else return false;
    }
}
