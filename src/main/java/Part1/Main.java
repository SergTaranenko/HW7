package Part1;

public class Main {
    public static void main(String[] args) {
        Runner[] runners = {
                new Cat("Snegok", 500, 3),
                new Cat("Kasaletka", 2700, 22),
                new Robot("FEDOR", 99999, 0),
                new Robot("FEDOR2", 25000, 950),
                new Human("Putin", 3000, 200),
                new Human("Navalnyi", 3000, 200)
        };

        Obtacle[] obtacles = {
                new Track(1200),
                new Wall(20),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall( 850)
        };

        for (Runner r : runners) {
            for (Obtacle o : obtacles) {
                if (o instanceof Track) {
                    r.run(o.getLength());
                } else {
                    r.jump(o.getHeight());
                }


            }
        }
    }
}
