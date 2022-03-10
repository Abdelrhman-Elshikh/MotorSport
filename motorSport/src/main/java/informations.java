
public class informations {
    public static void main(String args[]) throws InterruptedException{
        String email = new String("REPLACE YOUR EMAIL HERE");
        String password = new String("REPLACE YOUR PASSWORD HEAR");
        String myComment = new String(("REPLACE YOUR COMMENT HERE"));
        comment com = new comment();
        com.open();
        com.addComment(email,password,myComment);
    }
}
