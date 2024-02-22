import java.util.ArrayList;
import java.util.Random;
public class DominoPile {
    private ArrayList <Domino> dominoPile;
    public DominoPile(){
        this.dominoPile = new ArrayList<>();
    }

    public ArrayList<Domino> getPile() {
        return dominoPile;
    }

    public void newStack6(){
        for(int i = 0; i <= 6; i++){
            for (int j = i; j <= 6; j++){
                Domino domino = new Domino(i, j);
                dominoPile.add(domino);
            }
        }
    }

    public void shuffle(){
        ArrayList <Domino> tempDominoPile = new ArrayList();
        int pileSize = dominoPile.size();
        Random random = new Random();
        while (!dominoPile.isEmpty()){
            int index = random.nextInt(pileSize);
            Domino tempDomino = dominoPile.get(index);
            tempDominoPile.add(tempDomino);
            dominoPile.remove(tempDomino);
            pileSize --;
        }
        int tempSize = tempDominoPile.size();
        for(int i = 0; i < tempSize; i++){
            dominoPile.add(tempDominoPile.get(i));
        }
    }
}
