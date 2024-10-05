package InBuildExamples;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        circularQueue queue=new circularQueue(5);
        queue.insert(23);
        queue.insert(3);
        queue.insert(53);
        queue.insert(44);
        // queue.insert(29);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}
