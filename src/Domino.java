

public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        this.top = 0;
        this.bottom = 0;
    }
    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int top){
        this.top = top;
    }
    public void setBottom(int bottom){
        this.bottom = bottom;
    }
    public String toString(){
        return "top: " + top + " bottom: " + bottom;
    }
    public void flip(){
        int temp = top;
        top = bottom;
        bottom = temp;
    }
    public void settle(){
        if (top > bottom){
            flip();
        }
    }
    public int compareTo(Domino other){
        other.settle();
        settle();
        if (this.top < other.top){
            return -1;
        }
        else if (this.top > other.top){
            return 1;
        }
        else{
            if (this.bottom < other.bottom){
                return -1;
            }
            else if (this.bottom > other.bottom){
                return 1;
            }
            return 0;
        }
    }
    public int compareToWeight(Domino other){
        int sum = top + bottom;
        int otherSum = other.top + other.bottom;
        if (sum > otherSum){
            return 1;
        }
        else if (sum < otherSum){
            return -1;
        }
        else{
            return 0;
        }
    }
    public boolean canConnect(Domino other){
        if ((this.top == other.top) || (this.top == other.bottom) || (this.bottom == other.top) || (this.bottom == other.bottom)){
            return true;
        }
        return false;
    }

}
