public class ZooManagement {
    public static void main(String[] args){
        try{
            Zoo myZoo = new Zoo("belveder","Tunis",3);
            Animal lion=new Animal("Mammifiere","lion1",3,true);
            Animal dog=new Animal("Mammifiere","dog",2,true);
            Animal cat=new Animal("Mammifiere","cat",2,true);

            myZoo.AddAnimal(lion);
            myZoo.AddAnimal(dog);
            myZoo.AddAnimal(cat);//myZoo.displayAnimals();
        }catch(Exception ex){
            if(ex instanceof ZooFullException){
                System.err.println("Error : "+ex.getMessage());

            }
            else if(ex instanceof InvalidAgeException){
                System.err.println("Error : "+ex.getMessage());
            }
            else{
                System.err.println("ErrorInconnue : "+ex.getMessage());
            }

        }



    }
}
