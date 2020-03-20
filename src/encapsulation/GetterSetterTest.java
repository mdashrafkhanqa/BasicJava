package encapsulation;

public class GetterSetterTest {

    public static void main(String[] args) {

        GetterSetter obj = new GetterSetter();
        obj.setName("Ashraf");
        obj.setAge(30);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
