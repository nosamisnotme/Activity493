/*
 * Activity 4.9.3
 */
public class Bait extends LakeObject
{
    public Bait(){
        super.setCost(3);
    }
    @Override
    public String say(){
        return "You now have a Bait!";
    }
}