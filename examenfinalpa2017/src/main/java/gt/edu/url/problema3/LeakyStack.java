package gt.edu.url.problema3;

/**
 * Historic stack ADT representation
 */

public interface LeakyStack<E> {

	public interface LeakyStack {
        public void saveHistoy(Animal animal);
        public Animal undo();
}
}
