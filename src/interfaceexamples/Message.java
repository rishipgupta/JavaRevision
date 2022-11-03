package interfaceexamples;

interface Message extends Student{
    void diwaliMessage();
    default void holiMessage(){
        System.out.println("Happy holi");
    }
    static void birthdayGreeting(){
        System.out.println("Happy Birthday");
    }
}
