import java.util.NoSuchElementException;

public class CircularArrayDeque<E> {
    private Object[] deque;
    private int front;
    private int rear;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CircularArrayDeque() {
        deque = new Object[DEFAULT_CAPACITY];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(E element) {
        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + deque.length) % deque.length;
        }
        deque[front] = element;
        size++;
        ensureCapacity();
    }

    public void addLast(E element) {
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % deque.length;
        }
        deque[rear] = element;
        size++;
        ensureCapacity();
    }

    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        E element = (E) deque[front];
        deque[front] = null;
        front = (front + 1) % deque.length;
        size--;
        return element;
    }

    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        E element = (E) deque[rear];
        deque[rear] = null;
        rear = (rear - 1 + deque.length) % deque.length;
        size--;
        return element;
    }

    public E getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return (E) deque[front];
    }

    public E getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return (E) deque[rear];
    }

    private void ensureCapacity() {
        if (size == deque.length) {
            Object[] newDeque = new Object[deque.length * 2];
            int i = 0;
            int j = front;
            while (i < size) {
                newDeque[i] = deque[j];
                i++;
                j = (j + 1) % deque.length;
            }
            deque = newDeque;
            front = 0;
            rear = size - 1;
        }
    }
}
