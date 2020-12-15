import java.util.Objects;

public class HashElement<T1, T2> {
    private T1 key;
    private T2 value;

    public HashElement(T1 key, T2 value) {
        this.key = key;
        this.value = value;
    }

    public HashElement(T1 key) {
        this.key = key;
        this.value = null;
    }

    public T1 getKey() {
        return key;
    }

    public T2 getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashElement<?, ?> element = (HashElement<?, ?>) o;
        return key.equals(element.key) &&
                Objects.equals(value, element.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
