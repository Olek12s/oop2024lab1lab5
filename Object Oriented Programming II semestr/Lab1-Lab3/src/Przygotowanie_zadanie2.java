public class Przygotowanie_zadanie2
{
    public static interface AnimalInterface
    {
        public String sound();

    }
    public static class DogInterface implements AnimalInterface
    {
        public String sound()
        {
            return "woof woof";
        }
    }
    public static abstract class AnimalAbstract {
        private String name;

        AnimalAbstract(String animalName) {
            this.name = animalName;
        }

        protected String getName() {
            return name;
        }

        public abstract String sound();
    }
    public static class DogAbstract extends AnimalAbstract
    {
        public DogAbstract(String animalName)
        {
            super(animalName);
        }
        public String sound()
        {
            return getName() + " barks";
        }
    }
}

/*

 public static void main(String[] args)
    {
        // Tworzenie instancji klasy DogInterface
        Przygotowanie_zadanie2.DogInterface dogInterface = new Przygotowanie_zadanie2.DogInterface();
        Przygotowanie_zadanie2.DogAbstract animalAbstract = new Przygotowanie_zadanie2.DogAbstract("Burek");
        // Wywołanie metody sound()
        System.out.println(dogInterface.sound());
        System.out.println(animalAbstract.);
    }

*/