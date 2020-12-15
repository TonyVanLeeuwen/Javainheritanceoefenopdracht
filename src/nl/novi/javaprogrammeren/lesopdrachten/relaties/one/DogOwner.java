package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {

    private String name;
    private String sex;
    private Dog dog;

    public DogOwner(String name, String sex, Dog dog) {
        this.name = name;
        this.sex = sex;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void changeDogName(String dogName){
        this.dog.setName(dogName);
    }

    public void upAge(){
        this.dog.setAge(this.dog.getAge() + 1);
    }

    @Override
    public String toString() {
        return this.getName() + " heeft een " + this.dog.getSex() + ", deze is " +  this.dog.getAge() + " jaar oud en van het soort: " + this.dog.getSpecies() +
                ". De hond heet: " + this.dog.getName();
    }
}
