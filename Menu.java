import java.util.Scanner;
import java.util.Random;
public class Menu extends Character{
static Scanner scam= new Scanner(System.in);
static Random gerador= new Random();    
// public Menu(int healthpoints, int ataque, String status, int poderM) {
// super(healthpoints, ataque, status, poderM);
// }
@Override
public void atacar() {    
}
public static Menu menu= new Menu();
 
public void statusAtualWarrior(){  
System.out.print("PONTOS de ataque: "+Character.getAtaqueW()+", ");
System.out.print("PONTOS de vida: "+Character.getHealthpointsW()+", ");
System.out.print("PONTOS de cura: "+w1.getCura()+", ");  
System.out.print("PONTOS de poder mágico: "+Character.getPoderMW()+", ");
System.out.print("STATUS atual: "+Character.getStatusW()+" ");
}

public void statusAtualMonster(){
System.out.print("PONTOS de ataque: "+Character.getAtaqueM()+", ");
System.out.print("PONTOS de vida: "+Character.getHealthpointsM()+", ");  
System.out.print("PONTOS de poder mágico: "+Character.getPoderMM()+", ");
System.out.println("STATUS atual: "+Character.getStatusM()+" ");    
}
 
public void atribuicoesMonster(){
m1.baseM();
System.out.print("|PONTOS de ataque: "+Character.getAtaqueM()+", ");
System.out.print("PONTOS de vida: "+Character.getHealthpointsM()+", ");  
System.out.print("PONTOS de poder mágico: "+Character.getPoderMM()+", ");
System.out.print("STATUS atual: "+Character.getStatusM()+"                      |");    
}
public void atribuicoesWarrior(){
w1.baseW();  
System.out.print("|PONTOS de ataque: "+Character.getAtaqueW()+", ");
System.out.print("PONTOS de cura: "+w1.getCura()+", ");
System.out.print("PONTOS de vida: "+Character.getHealthpointsW()+", ");  
System.out.print("PONTOS de poder mágico: "+Character.getPoderMW()+", ");
System.out.print("STATUS atual: "+Character.getStatusW()+"   |");
    }

 
public static void main(String[] args) {
int fortificamento=0;//aux conta os rounds do heroi fortalecido
int endurecimento=0;//aux conta os rounds do monstro endurecido
int turnos=1;//aux conta os turnos do jogo    
//Warrior Character= new Warrior();    
//Monster m1= new Monster();
//criar objetos warrior e monster aqui    
System.out.println("----------------------------------------------------------------------------------------------------------------");
System.out.println("|                                  !SEJA BEM VINDO AO GAME: WARRIOR X MONSTER!                                 |");
System.out.println("|Você será o guerreiro, com as seguintes atribuições:                                                          |");
menu.atribuicoesWarrior();
System.out.println("\t");
System.out.println("|E lutará contra o monstro com as seguintes atribuições:                                                       |");
menu.atribuicoesMonster();
System.out.println("\t");
System.out.println("----------------------------------------------------------------------------------------------------------------");
System.out.println("Digite 123 para iniciar o jogo");
int start= scam.nextInt();
if(start == 123){


while(Character.getHealthpointsW()>0 && Character.getHealthpointsM()>0){//inicio
System.out.println("\n"+"\n" +"TURNO: "+turnos);
System.out.println("Informe seu movimento, 1= ataque 2= poção de cura 3= fortificar");
int jogador= scam.nextInt();

if (jogador==1) {
System.out.println("Warrior atacando!");    
if(fortificamento>0 && fortificamento <6){
w1.fortificar2();
m1.atacar();
fortificamento++;
}
else{
m1.atacar();    
fortificamento=0;
Character.setStatusW("normal");
Character.setAtaqueW(3);  
}    
}    
if (jogador==2) {
System.out.println("Warrior curando!");
w1.tomarcura();
}
if (jogador==3) {
System.out.println("Warrior fortificado!");        
w1.fortificar();
if(w1.getCura()>0){
fortificamento++;
}
}//fim jogador
//inicio monstro  
System.out.println("\n"+"Movimento do monstro:");
int monstro= gerador.nextInt(10);//sortear numero entre 0 e 10 pra decidir acao do monstro
if(monstro>=0 && monstro <=7){//ataque do monstro inicio
if(endurecimento>0 && endurecimento<5){
m1.endurecer2();
endurecimento++;    
}
else{
endurecimento=0;    
Character.setStatusM("normal");
}      
w1.atacar();
System.out.println("Monstro atacando!");
}//ataque do monstro fim
if(monstro>7 && monstro<10) {//recuperacao monstro inicio
if(endurecimento>0 && endurecimento<5){
m1.endurecer2();
endurecimento++;    
}
else{
endurecimento=0;    
Character.setStatusM("normal");
}
m1.recuperacao();
System.out.println("Monstro recuperando!");    
}//recuperacao monstro final
if(monstro==10){//endurecimento monstro inicio        
m1.endurecer();
System.out.println("Monstro endurecido!");
Character.setPoderMM(Character.getPoderMM()-2);
if(endurecimento>0){
endurecimento=0;    
Character.setStatusM("normal");
}
else{
endurecimento++;    
}
}//endurecimento monstro final
//fim monstro
System.out.println("\n"+"status monster:");
menu.statusAtualMonster();
System.out.println("\n"+"status warrior:");
menu.statusAtualWarrior(); 
turnos++;
System.out.println("\n");
if (Character.getHealthpointsM()<=0) {
System.out.println("\n"+"Você derrotou o monstro! :)");    
}
else if (Character.getHealthpointsW()<=0) {
System.out.println("\n"+"Você foi derrotado! :(");    
}
}//fim while  
}//fim if start
}
}
