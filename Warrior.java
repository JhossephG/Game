public class Warrior extends Character {
    private int cura;
     
    // public Warrior(int healthpoints, int ataque, String status, int poderM, int cura) {
    // super(healthpoints, ataque, status, poderM);      
    // this.cura= 1;
    // }
    //public Warrior Character= new Warrior();
     
    public int getCura() {
        return cura;
    }
     
    public void setCura(int cura) {
        this.cura = cura;
    }
     
    // public Warrior getCharacter() {
    //     return Character;
    // }
     
    // public void setCharacter(Warrior Character) {
    //     Character.Character = Character;
    // }
     
    public void baseW(){
    Character.setAtaqueW(3);
    Character.setHealthpointsW(20);
    Character.setPoderMW(5);
    Character.setStatusW("normal");
    w1.setCura(1);
    }
     
    @Override
    public void atacar(){  
    Character.setHealthpointsM(Character.getHealthpointsM()-Character.getAtaqueW());
    }
     
    public void tomarcura(){
    if(w1.getCura()==1 && Character.getHealthpointsW()>0){  
    if(Character.getHealthpointsW()>10){
    Character.setHealthpointsW((20-Character.getHealthpointsW())+Character.getHealthpointsW());    
    w1.setCura(0);
    }
    else{    
    Character.setHealthpointsW(Character.getHealthpointsW()+10);
    w1.setCura(0);
    }
    }
    }
     
    public void fortificar(){
    if(Character.getPoderMW()==5){
    Character.setStatusW("fortificado");
    Character.setAtaqueW(5);
    }
    Character.setPoderMW(0);
    //Character.setStatus("normal");
    }
    public void fortificar2(){
    Character.setStatusW("fortificado");
    Character.setAtaqueW(5);
    Character.setPoderMW(0);
    //Character.setStatus("normal");
    }
    }
    