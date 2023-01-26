public class Ball implements Cloneable{
    int size;
    String name;
    public Ball(int size, String name){
        this.size = size;
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {

        if(this==o){
            return true;
        }

        if(o==null){
            return false;
        }

        if(o.getClass() == getClass()){
            Ball object = (Ball) o;
            return object.size == this.size && this.name.equals(object.name);
        }
        else {
            return false;
        }

    }
}
