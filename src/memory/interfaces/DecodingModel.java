package memory.interfaces;

public interface DecodingModel<T,U> {
    /**
     * converts the <code>content</code> to type of <code>T</code>.
     * @param content
     * @return
     */
    T decode(U content);
}
