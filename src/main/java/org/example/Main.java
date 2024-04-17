package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ChatServer mediator = new ChatServerImpl();

        User user1 = new UserImpl("user1", mediator);
        User user2 = new UserImpl("user2", mediator);
        User user3 = new UserImpl("user3", mediator);

        mediator.registerUser(user1);
        mediator.registerUser(user2);
        mediator.registerUser(user3);

        user1.sendMessage("Message 1 ");
        user1.sendMessage("Message 2 ");
        user1.blockUser(user3);
        user3.sendMessage("Message 3 ");
        user2.sendMessage("Message 4 ");
        System.out.println("----------");
        user1.sendMessage("Message 5 ", user2);
        user1.sendMessage("Message 6 ", user3);
        user3.sendMessage("Message 7 ", user1);

        System.out.println("-----------");
        mediator.unregisterUser(user1);
        user2.sendMessage("Message 8 ");
        user2.sendMessage("Message 9 ", user1);

        System.out.println("-----------");
        user3.sendMessage("Message 10 ", Arrays.asList(user1, user2));

        System.out.println("--------");
        user1.viewChatHistory(user3);

        System.out.println("--------");
        user1.printChatHistory();

        System.out.println("--------");
        user1.sendMessage("Message 11 ");

        System.out.println("--------");
        user1.printChatHistory();

        System.out.println("--------");
        user1.undoLastMessage();
        user1.printChatHistory();
    }
}