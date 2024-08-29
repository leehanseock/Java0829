package cat;

public class Main{
    public static void main(String[] args){
        //메인메소드 : 프로그램을 실행시켜주는 역할
        Cat cat = new Cat();
        cat.setName("Puss🐱");
        cat.setBreeds("Mix");
        cat.setWeight(5.1);

        System.out.printf("고양이 이름: %s\n",cat.getName());
        System.out.printf("고양이 품종: %s\n",cat.getBreeds());
        System.out.printf("고양이 무게: %.2fkg\n",cat.getWeight());

        System.out.print(cat.getName()+"의 ");
        cat.claw();
        System.out.println();

        System.out.print(cat.getName()+"의 ");
        cat.meow();
    }
}