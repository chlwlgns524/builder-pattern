package javaBeans;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        
        //1. 코드가 길어짐
        person.setAge(10);
        person.setFirstName("지성");
        person.setLastName("팍");
        person.setHeight(175);
        person.setWeight(80);
    }

    public static void shoutInfo(Person p) {
        //2. 객체의 일관성 훼손으로 인해
        //특정 필드가 필요할 경우 null 체크
        if (p.getAge() != null)
            System.out.println(p.getAge());
        else
            System.out.println("나이가 없음");

        if (p.getFirstName() != null)
            System.out.println(p.getFirstName());
        else
            System.out.println("이름이 없음");

        if (p.getLastName() != null)
            System.out.println(p.getLastName());
        else
            System.out.println("성이 없음");

        if (p.getHeight() != null)
            System.out.println(p.getHeight());
        else
            System.out.println("키가 없음");

        if (p.getWeight() != null)
            System.out.println(p.getWeight());
        else
            System.out.println("몸무게 없음");
    }

    //3. Non-immutability
}
