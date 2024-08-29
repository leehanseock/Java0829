package cat;

public class Cat {
    private String name;
    private String breeds;
    private double weight;

    void claw(){
        System.out.print("활퀴기 공격!");
    }

    void meow(){
        System.out.print("울음소리 공격!");
    }

    public void setName(String name){
        this.name = name;
    }//외부에서 매개변수를 통해 데이터값이 들어온 것을 필드값으로 설정해주는 기능

    public String getName(){
        return name;
    }//여기서 name은 필드네임을 의미. 굳이 this 붙일 필요 없다.

    public void setBreeds(String breeds){
        this.breeds = breeds;
    }

    public String getBreeds(){
        return breeds;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }


}
