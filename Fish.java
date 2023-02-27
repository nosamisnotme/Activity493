/*
 * Activity 4.9.3
 */
public class Fish extends LakeObject
{
    public Fish(){
        super.setCost(super.getWeight()*super.getCost());
    }
    @Override
    public String say(){
        return "You now have a Fish!";
    }
    
}