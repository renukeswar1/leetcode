package main.java.effectivejava.Item3;

import java.lang.reflect.Constructor;

public class SingletonTest {
    private static SingletonTest instance = new SingletonTest();
    private SingletonTest(){

    }


}

class BreakSingleton{
    public void breaksingleton(){
        SingletonTest singletonTest  = null;
        SingletonTest singletonTest1 = null;
        try {
            Constructor[] constructors
                    = SingletonTest.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // Below code will destroy the singleton
                // pattern
                constructor.setAccessible(true);
                singletonTest1
                        = (SingletonTest)constructor.newInstance();
                singletonTest
                        = (SingletonTest)constructor.newInstance();
                break;
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("instance1.hashCode():- "
                + singletonTest1.hashCode());
        System.out.println("instance2.hashCode():- "
                + singletonTest.hashCode());
    }
}

//Preferred way for singleton is ENUM
enum Elvis {
    INSTANCE;
    public void leaveTheBuilding() {  }
}