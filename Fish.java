/*
 * Activity 4.9.3
 */
public class Fish extends LakeObject
{
    public Fish(){
        super();
        super.setCost(getCost());
    }
    @Override
    public String say(){
        return "You now have a Fish!";
    }
    @Override
    public int getCost(){
        return super.getWeight()*super.getCost()*2;
    }
}