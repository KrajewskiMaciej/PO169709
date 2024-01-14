public interface Authentication {
    abstract boolean login(String username, String password);
    abstract void logout();
    abstract boolean resetPassword(String username, String oldPassword, String newPassword);

}

class UserAuthentication implements Authentication {
    private String username;
    private String password;

    public UserAuthentication(String username, String password){
        this.username=username;
        this.password=password;
    }
    @Override
    public boolean login(String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }
    @Override
    public void logout(){
        System.out.println("Do zobaczenia kolejnym razem");
    }
    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword){
        if(this.username.equals(username) && this.password.equals(oldPassword)){
            this.password=newPassword;
            System.out.println("Hasło zmienione prawodłowo");
            return true;
        } else {
            System.out.println("Błąd podczas zmiany hasła");
            return false;
        }
    }
}

class AdminAuthentication implements Authentication{
    private String adminUsername;
    private String adminPassword;

    public AdminAuthentication(String adminUsername,String adminPassword){
        this.adminPassword=adminPassword;
        this.adminUsername=adminUsername;
    }

    @Override
    public boolean login(String username, String password){
        return this.adminUsername.equals(username) && this.adminPassword.equals(password);
    }

    @Override
    public void logout(){
        System.out.println("Admin powiedział nara!");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword){
        System.out.println("Zmiana hasła nie możliwa dla Administratora");
        return false;
    }
}
