public abstract class Character {
    public static int healthpointsM;
    public static int ataqueM;
    public static String statusM;
    public static int poderMM;
    public static int healthpointsW;
    public static int ataqueW;
    public static String statusW;
    public static int poderMW;
    public static Monster m1= new Monster();//obheto monstro
    public static Warrior w1= new Warrior();//objeto guerreiro
     
     
     
    // public Character(int healthpoints, int ataque, String status, int poderM) {
    //     Character.healthpoints = healthpoints;
    //     Character.ataque = ataque;
    //     Character.status = status;
    //     Character.poderM = poderM;
    // }
    public abstract void atacar();

    public static int getHealthpointsM() {
        return healthpointsM;
    }

    public static void setHealthpointsM(int healthpointsM) {
        Character.healthpointsM = healthpointsM;
    }

    public static int getAtaqueM() {
        return ataqueM;
    }

    public static void setAtaqueM(int ataqueM) {
        Character.ataqueM = ataqueM;
    }

    public static String getStatusM() {
        return statusM;
    }

    public static void setStatusM(String statusM) {
        Character.statusM = statusM;
    }

    public static int getPoderMM() {
        return poderMM;
    }

    public static void setPoderMM(int poderMM) {
        Character.poderMM = poderMM;
    }

    public static int getHealthpointsW() {
        return healthpointsW;
    }

    public static void setHealthpointsW(int healthpointsW) {
        Character.healthpointsW = healthpointsW;
    }

    public static int getAtaqueW() {
        return ataqueW;
    }

    public static void setAtaqueW(int ataqueW) {
        Character.ataqueW = ataqueW;
    }

    public static String getStatusW() {
        return statusW;
    }

    public static void setStatusW(String statusW) {
        Character.statusW = statusW;
    }

    public static int getPoderMW() {
        return poderMW;
    }

    public static void setPoderMW(int poderMW) {
        Character.poderMW = poderMW;
    }

    public static Monster getM1() {
        return m1;
    }

    public static void setM1(Monster m1) {
        Character.m1 = m1;
    }

    public static Warrior getW1() {
        return w1;
    }

    public static void setW1(Warrior w1) {
        Character.w1 = w1;
    }
    }
    