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
    

    

