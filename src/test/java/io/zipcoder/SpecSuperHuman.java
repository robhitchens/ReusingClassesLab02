package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/28/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class SpecSuperHuman {
    SuperHuman greg = new SuperHuman("Greg", 42, "Male", "Janitor", "7034 Brook Lane North Royalton, OH 44133", "Good", "Nukeo", "Immune to disease");
    @Test
    public void testGetName(){
        assertNotNull("Human.getName() method should not return null: ", greg.getName());
    }
    @Test
    public void testGetAge(){
        assertEquals("Human.getAge() method should not return -1: ", greg.getAge(), 42);
    }
    @Test
    public void testGetGender(){
        assertNotNull("Human.getGender() method should not return null: ", greg.getGender());
    }
    @Test
    public void testGetOccupation(){
        assertNotNull("Human.getOccupation() method should not return null: ", greg.getOccupation());
    }
    @Test
    public void testGetAddress(){
        assertNotNull("Human.getAddress() method should not return null: ", greg.getAddress());
    }
    @Test
    public void testGetAlignment(){
        assertNotNull("SuperHuman.getAlignment() should not return null: ", greg.getAlignment());
    }
    @Test
    public void testGetHeroName(){
        assertNotNull("SuperHuman.getHeroName() should not return null: ", greg.getHeroName());
    }
    @Test
    public void testGetSuperAbility(){
        assertNotNull("SuperHuman.getSuperAbility() should not return null: ", greg.getSuperAbility());
    }

}
