package edu.eci.cvds.tdd.registry;

import java.util.HashMap;

public class Registry {

    private HashMap<Integer,Person> registeredPersons = new HashMap<Integer,Person>();
	
    public RegisterResult registerVoter(Person p) {

        if (p.getAge() < 0 || p.getAge() > 100){
            return RegisterResult.INVALID_AGE;
        }else if(p.getAge() < 18){
            return RegisterResult.UNDERAGE;
        }else if(!(p.isAlive())){
            return RegisterResult.DEAD;
        }else if(registeredPersons.containsKey(p.getId())){
            return RegisterResult.DUPLICATED;
        }
	registeredPersons.put(p.getId(),p);
        return RegisterResult.VALID;
    }
}
