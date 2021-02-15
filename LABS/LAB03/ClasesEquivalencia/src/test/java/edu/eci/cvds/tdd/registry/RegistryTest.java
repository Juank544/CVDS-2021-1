package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {
        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validRegistryResult() {
        String name = "Leidy Ducuara";
        int id = 1000723591;
        int age = 19;
        Gender gender = Gender.FEMALE;
        boolean alive = true;
        Person person = new Person(name,id,age,gender,alive);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void underageRegistryResult() {
        String name = "Leidy Ducuara";
        int id = 1000780415;
        int age = 14;
        Gender gender = Gender.FEMALE;
        boolean alive = true;
        Person person = new Person(name,id,age,gender,alive);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void deadRegistryResult(){
        String name = "Alfonso Diaz";
        int id = 55599541;
        int age = 65;
        Gender gender = Gender.MALE;
        boolean alive = false;
        Person person = new Person(name,id,age,gender,alive);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void invalid_ageRegistryResult(){
        String name = "Felipe Soto";
        int id = 1233594520;
        int age = -40;
        Gender gender = Gender.MALE;
        boolean alive = true;
        Person person = new Person(name,id,age,gender,alive);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void duplicatedRegistryResult(){
        String name = "Daniel Perez";
        int id = 891999456;
        int age = 25;
        Gender gender = Gender.MALE;
        boolean alive = true;
        Person person1 = new Person(name,id,age,gender,alive);
        RegisterResult result1 = registry.registerVoter(person1);

        name = "Camilo Gil";
        id = 891999456;
        age = 60;
        gender = Gender.MALE;
        alive = true;
        Person person2 = new Person(name,id,age,gender,alive);
        RegisterResult result2 = registry.registerVoter(person2);
        
        Assert.assertEquals(RegisterResult.VALID, result1);
        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }
}