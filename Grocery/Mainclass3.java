import java.util.jar.Attributes.Name;

class spotify {


    String username;
    String password;
    String email;
    int cno;

    void updatespotify(String name, String pass, String mail, int no){
        System.out.println("updating spotify");
        username=name;
        password=pass;
        email=mail;
        cno=no;

        
    }
    void updateusernameonly(String name){
        System.out.println("updating username");
        username=name;

    }
    void updatepasswordonly(String pass){
        System.out.println("updating password");
        password=pass;
    }
    void updatemaildonly(String mail){
        System.out.println("updating email");
        email=mail;
    }
     void updatecnodonly(int no){
        System.out.println("updating cno");
        cno=no;
     }
    }

    class MainClass3{
        public static void main(String[] args) {

            System.out.println("main method started");

            spotify sp = new spotify();
            sp.updatespotify("revanth");
            sp.updatespotify("Revanth@1899");
            sp.updatespotify("revanthkumar20029@gmail.com");
            sp.updatespotify(701072905);

            System.out.println("the username is:"+sp.username);
            System.out.println("the password is:"+sp.password);
            System.out.println("the email is:"+sp.email);
            System.out.println("the contact number is:"+sp.cno);
            System.out.println("main method ended");
            
        }
    }

    

