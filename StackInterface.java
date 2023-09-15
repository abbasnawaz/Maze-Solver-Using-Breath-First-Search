
public interface StackInterface<T> {
	public void push(T entry);
	public T pop();
	public T peak();
	public boolean isEmpty();
	public void clear();
}
