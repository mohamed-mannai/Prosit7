public class Animal {
    private String family;
    private  String name;
    private int age;
    private  boolean isMammal;

    public Animal (String family,String name,int age,boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getName() {
        return name;
    }

    public void displayAnimal(){
        System.out.println("myZoo{family:'" +family+"',name:'"+name+"',age:"+age+",isMammal:"+isMammal+"}");
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) throws InvalidAgeException{
        if(this.getAge()<0){
            throw new InvalidAgeException("on n'a pas l'acces de saisir un age negatif");
        }
        this.age  = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
