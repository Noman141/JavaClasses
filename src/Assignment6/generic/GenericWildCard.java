package Assignment6.generic;

public class GenericWildCard <T extends Number>{
    private T wildCard;

    public GenericWildCard (T wildCard){
        this.wildCard = wildCard;
    }

    public T getWildCard(){
        return wildCard;
    }
}
