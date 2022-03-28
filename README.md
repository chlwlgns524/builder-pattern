# 빌더 패턴은 무엇인가?

 &nbsp;&nbsp;빌더 패턴은 GoF의 디자인 패턴 유형 중 Ceational에 속하며 객체를 효율적으로 생성하기 위해 활용할 수 있는 디자인 패턴이다. 
 자바에서는 해당 클래스에 여러 생성자를 정의하고 이것들을 이용하여 원하는 객체를 생성하여 사용하는 것이 일반적이다. 이런 방식은
 객체를 만들어 사용하기 위해 클래스를 간단히 만들 수 있다는 분명한 장점이 있다. 하지만 객체를 직접 생성하는 부분에서 여러 가지 문제들이 발생한다. 
 바로 이 문제들을 극복하기 위해 원하는 객체 생성시 빌더 패턴을 고려해 볼 수 있다. 먼저 객체 생성시 어디서 무엇때문에 문제가 발생하는지 그 배경을 살펴보고
 빌더 패턴을 알아본다.

---

# 문제1. 점진적 생성자 패턴

```java
public class PencilCase {

    private int numberOfPencils;
    private int numberOfErasers;
    private double weight;
    private int price;
    private double volume;

    public PencilCase(int numberOfPencils, int numberOfErasers, double weight, int price, double volume) {
        this.numberOfPencils = numberOfPencils;
        this.numberOfErasers = numberOfErasers;
        this.weight = weight;
        this.price = price;
        this.volume = volume;
    }

}

...

public class Main {

    public static void main(String[] args) {

        //Telescoping Constructor를 활용한 객체 생성

        PencilCase pencilCase = new PencilCase(10, 5, 13.5, 2000, 230);

    }

}
```
