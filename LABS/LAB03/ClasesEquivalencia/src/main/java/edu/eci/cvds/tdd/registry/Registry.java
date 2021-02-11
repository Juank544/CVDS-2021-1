package edu.eci.cvds.tdd.registry;

public class Registry {

    public RegisterResult registerVoter(Person p) {

        if (p.getAge() < 0 || p.getAge() > 100){
            return RegistryResult.INVALID_AGE;
        }else if(p.getAge() < 18){
            return RegisterResult.UNDERAGE;
        }else if(!(p.isAlive())){
            return RegistryResult.DEAD;
        }else if(){
            return RegisterResult.DUPLICATE;
        }
        return RegisterResult.VALID;
        
    }
}
