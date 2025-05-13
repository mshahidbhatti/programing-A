package InheritanceTest.ShapeTest;

public interface Draw {
    int a=10;
    void draw();
    void erase();
    default void displayInfo(){

    }
}
