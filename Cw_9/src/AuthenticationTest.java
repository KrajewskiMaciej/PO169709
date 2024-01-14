public class AuthenticationTest {
    public static void main(String[] args) {
        // Testowanie UserAuthentication
        Authentication userAuth = new UserAuthentication("john_doe", "password123");

        System.out.println("User login result: " + userAuth.login("john_doe", "password123"));
        System.out.println("User login result: " + userAuth.login("john_doe", "wrong_password"));

        userAuth.resetPassword("john_doe", "password123", "new_password");
        userAuth.logout();

        // Testowanie AdminAuthentication
        Authentication adminAuth = new AdminAuthentication("admin", "adminPass");

        System.out.println("Admin login result: " + adminAuth.login("admin", "adminPass"));
        System.out.println("Admin login result: " + adminAuth.login("admin", "wrong_password"));

        adminAuth.resetPassword("admin", "adminPass", "new_admin_password");
        adminAuth.logout();
    }
}
