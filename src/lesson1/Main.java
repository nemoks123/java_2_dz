package lesson1;

public class Main {

    public static void main(String[] args) {

        Participant[] participant = {
            new Cat ("Barsik",1,10),
            new Human("Андрей",10,15),
            new Robot("Mechanik",100,6)
        };
        Obstacles[] obstacle = {
                new Wall(3),
                new Track(10),
                new Wall(10),
                new Track(150)
                };
        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < obstacle.length; j++) {
                if(participant[i].isAttempt() == true)
                {
                    obstacle[j].doit(participant[i]);
                }
            }
        }
    }
}

