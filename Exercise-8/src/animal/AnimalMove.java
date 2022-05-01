package animal;

public interface AnimalMove {
    default void move(){
        System.out.println("Animals move.");
    }
}
