package mediator;

/**
 * Created by daniel on 30/11/16.
 */
public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat =  new SimpleTextChat();
        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat,"user1");
        User user2 = new SimpleUser(chat, "user2");
        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        user1.sendMessage("hello, im user 1");
        admin.sendMessage("Roger that, im Admin");

    }
}
