public class sports {
    int players;
    int record;
    String name;

    public void print()
    {
        System.out.print("the sport" + name + "has " + players + "with a record of" + record);
        rateing();
    }

    public sports(int pPlayers, int pRecord, String pName) {

        name = pName;
        players = pPlayers;
        record = pRecord;
    }
        public void rateing() {
            if (record > 10) {
                System.out.println("this is a good season");

            } else {
                System.out.println("This is a bad season");
            }
        }
    }

