package org.example;

import java.util.Stack;

public class ChatHistory {

    private Stack<Message> messageHistory;

    public ChatHistory() {
        this.messageHistory = new Stack<>();
    }


    public void printChatHistory() {
        // print chat history
        for (Message message : messageHistory) {
            System.out.println(message);
        }
    }

    public void addMessage(Message message) {
        // add message to chat history
        messageHistory.add(message);
    }

    public Message getLastMessage() {
        return messageHistory.pop();
    }

}
