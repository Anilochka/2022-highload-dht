package ok.dht.test.ilin.model;

public class Entity {
    private String id;
    private byte[] value;

    public Entity(String id, byte[] value) {
        this.id = id;
        this.value = value;
    }

    public String id() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] value() {
        return value;
    }

    public void setValue(byte[] value) {
        this.value = value;
    }
}
