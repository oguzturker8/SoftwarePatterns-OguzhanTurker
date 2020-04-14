package objectpool;

public class Object {
    private Long now;

    public Object() {
        now = System.currentTimeMillis();
    }

    public Long getNow() {
        return now;
    }

}
