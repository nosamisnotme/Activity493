/*
 * Activity 4.9.3
 */
public class Boot extends LakeObject
{
    public Boot(){
        super();
        super.setCost(0);
    }
    @Override
    public String say(){
        return "You now have a Boot!";
    }
    @Override
    public boolean wasCaught(Hook h){
        return true;
    }
}
