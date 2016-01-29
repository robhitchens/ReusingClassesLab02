package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/28/16.
 */
public class SuperHuman extends Human {
    private String alignment;
    private String heroName;
    private String superAbility;

    public static void main(String[] args){
        Human greg = new Human("Greg", 42, "Male", "Janitor", "7034 Brook Lane North Royalton, OH 44133");
        SuperHuman superGreg = new SuperHuman("Greg", 42, "Male", "Janitor", "7034 Brook Lane North Royalton, OH 44133", "Good", "Nukeo", "Immune to disease");

        System.out.println("superGreg Name : " + superGreg.getName());
        System.out.println("superGreg address: "+superGreg.getAddress());
        System.out.println("superGreg Hero Name: " + superGreg.getHeroName());
    }
    public SuperHuman(String name, int age, String gender, String occupation, String address, String alignment, String heroName, String superAbility){
        super(name, age, gender, occupation, address);
        this.alignment = alignment;
        this.heroName = heroName;
        this.superAbility = superAbility;

    }
    public String getAlignment(){
        return alignment;
    }
    public String getHeroName(){
        return heroName;
    }
    public String getSuperAbility(){
        return superAbility;
    }
    public void printHeroInformation(){
        System.out.println("Alignment: "+ alignment + "\n"+"Hero name: "+heroName+"\n"+"Super-ability: "+superAbility);
    }
}
