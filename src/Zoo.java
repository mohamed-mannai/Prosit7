public class Zoo {
    Animal [] animals;


    private String name;
    private String city;
    private int nbrCages=25;

    private  int nbrAnimals;
    private int nbrAnimalsAquatic;
    private  int nbrAnimals1;

    public Zoo(String name,String city, int nbrCages) {
        animals = new Animal[nbrCages];

        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;


    }

    public void displayZoo(){
        System.out.println("myZoo{name:'" +name+"',city:'"+city+"',nbrCages:"+nbrCages+"}");
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public void AddAnimal(Animal animal) throws ZooFullException{

        if(nbrCages==nbrAnimals){
            throw new ZooFullException("Zoo plain");
        }

        animals[nbrAnimals]=animal;
        nbrAnimals++; int nbr=0;
        System.out.println("add successfuly");
        nbrAnimals();


    }
    public void nbrAnimals(){
        int nbr=0;
        for(int i=0;i<nbrAnimals;i++){
            nbr++;
        }
        System.out.println("le nombre d'animal: "+nbr);
    }

    public void displayAnimals(){
        for(int i=0;i<nbrAnimals;i++){
            System.out.println(animals[i]);
        }
    }
}