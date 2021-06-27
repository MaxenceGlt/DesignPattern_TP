package _3_iterator;

public class MaLinkedListStringIterator implements Iterator {
    private MaLinkedListString maLinkedListString;
    private Integer positionCourante = 0;


    public MaLinkedListStringIterator(MaLinkedListString maLinkedListString) {
        this.maLinkedListString = maLinkedListString;
    }

    public String getNext() {
        if ( !hasNext() ) {
            return null;
        }
        String ElementSuiv = maLinkedListString.get(positionCourante);
        positionCourante=positionCourante+1;
        return ElementSuiv;
    }

    @Override
    public boolean hasNext() {
        return positionCourante < maLinkedListString.count();
    }
}
