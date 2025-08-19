public class queue {
        private int[] arr;
        private int front = 0, rear = -1, size = 0, capacity;

        public queue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
        }

        public void enqueue(int val) {
            if (size == capacity) return;  // Queue full
            rear = (rear + 1) % capacity;
            arr[rear] = val;
            size++;
        }

        public int dequeue() {
            if (size == 0) return -1;  // Queue empty
            int val = arr[front];
            front = (front + 1) % capacity;
            size--;
            return val;
        }

        public int peek() {
            return (size == 0) ? -1 : arr[front];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public static void main(String[] args) {
            queue queue = new queue(3);

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40); // won't add, queue full

            System.out.println(queue.peek());    // 10
            System.out.println(queue.dequeue()); // 10
            System.out.println(queue.dequeue()); // 20
            System.out.println(queue.isEmpty()); // false
            System.out.println(queue.dequeue()); // 30
            System.out.println(queue.isEmpty()); // true
            System.out.println(queue.dequeue()); // -1 (empty)
        }
    }