/*
 * Activity 4.9.3
 */
public class Bait extends LakeObject
{
    public Bait(){
        super();
        super.setCost(10);
    }
    @Override
    public String say(){
        return "You now have a Bait!";
    }
}