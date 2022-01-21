public class Lab1{
    public static void main(String[] args) {
        int currentPopulation = 312032486;
        int sec = 365*24*60*60;

        int sumBirth = sec/7;
        int sumDeath = sec/13;
        int sumImmigrant = sec/45;

        System.out.println("Next year : "+(currentPopulation+sumBirth+sumImmigrant-sumDeath));
        System.out.println("Next 2 years : "+(currentPopulation+2*(sumBirth+sumImmigrant-sumDeath)));
        System.out.println("Next 3 years : "+(currentPopulation+3*(sumBirth+sumImmigrant-sumDeath)));
        System.out.println("Next 4 years : "+(currentPopulation+4*(sumBirth+sumImmigrant-sumDeath)));
        System.out.println("Next 5 years : "+(currentPopulation+5*(sumBirth+sumImmigrant-sumDeath)));
    }
}
