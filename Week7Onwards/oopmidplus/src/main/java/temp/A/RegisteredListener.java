package temp.A;

public class RegisteredListener extends Person {
    private int listenerId;

    public RegisteredListener(String name, int listenerId) {
        super(name);
        this.listenerId = listenerId;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RegisteredListener) {
            RegisteredListener other = (RegisteredListener) obj;
            return this.listenerId == other.listenerId;
        }
        return false;
    }

    public String toString() {
        return super.toString() + ", Listener ID: " + listenerId;
    }
}
