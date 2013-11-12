package lab4;

public class Peterson{

    private volatile boolean flag[] = new boolean[2];
    private volatile int victim;

    public void lock(int threadId) {
        int j = 1 - threadId;
        flag[threadId] = true;
        victim = threadId;
        while (flag[j] && victim == threadId) {}
    }

    public void unlock(int threadId){
        flag[threadId] = false;
    }

}
