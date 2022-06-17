public class Monster extends Character{
 
      
        
       public void baseM(){
       Character.setAtaqueM(4);
       Character.setHealthpointsM(24);
       Character.setPoderMM(6);
       Character.setStatusM("normal");  
       }
        
       @Override
       public void atacar() {
       Character.setHealthpointsW(Character.getHealthpointsW()-Character.getAtaqueM());
       }
        
       public void recuperacao(){
       if(Character.getPoderMM()>=1){
       if(Character.getHealthpointsM()>=23 && Character.getHealthpointsM()<=24){
       Character.setHealthpointsM((24-Character.getHealthpointsM())+Character.getHealthpointsM());    
       Character.setPoderMM(getPoderMM()-1);
       }
       else{
       if (Character.getHealthpointsM()<24) {
       Character.setHealthpointsM(Character.getHealthpointsM()+2);
       Character.setPoderMM(getPoderMM()-1);      
       }          
       }
       }      
       }      
        
       public void endurecer(){
       if(Character.getPoderMM()>=2){      
       Character.setStatusM("fortificado");
       if(Character.getHealthpointsM()<24){            
       Character.setHealthpointsM(Character.getHealthpointsM()+1);      
       }
}
       }
       public void endurecer2(){
       Character.setStatusM("fortificado");
       if(Character.getHealthpointsM()<24){            
       Character.setHealthpointsM(Character.getHealthpointsM()+1);      
       }
       }
        
       }
       