package ch05;

class Updater {
    void update1(int count) {
        count++;
    }

    void update2(Counter counter) {
        counter.count++;
    }
}

class Counter {
    int count = 0;
}
public class Ch05_04_call_by_value_or_object {
    public static void main(String[] args) {
        // 1. 값에 의한 호출
        Counter myCounter1 = new Counter();
        System.out.println("before update: " + myCounter1.count); // 0
        Updater myUpdater1 = new Updater();
        myUpdater1.update1(myCounter1.count);
        System.out.println("after update: " + myCounter1.count); // 0

        // 2. 객체에 의한 호출
        Counter myCounter2 = new Counter();
        System.out.println("before update: " + myCounter2.count); // 0
        Updater myUpdater2 = new Updater();
        myUpdater2.update2(myCounter2);
        System.out.println("after update: " + myCounter2.count); // 1

    }
}
