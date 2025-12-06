package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import java.time.LocalDateTime;

public class Communication {
    private int messageId;
    private String senderId;
    private String senderName;
    private String recipientId;
    private String recipientName;
    private String subject;
    private String content;
    private LocalDateTime timestamp;
    private boolean isRead;
    private String messageType; // "Message", "Notification", "Alert", "Report"
    private String relatedTo; // Order ID, Shipment ID, etc.
    private String priority; // "Normal", "Urgent"

    public Communication(int messageId, String senderId, String senderName, String recipientId, String recipientName, String subject, String content, LocalDateTime timestamp, boolean isRead, String messageType, String relatedTo, String priority) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.senderName = senderName;
        this.recipientId = recipientId;
        this.recipientName = recipientName;
        this.subject = subject;
        this.content = content;
        this.timestamp = timestamp;
        this.isRead = isRead;
        this.messageType = messageType;
        this.relatedTo = relatedTo;
        this.priority = priority;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getRelatedTo() {
        return relatedTo;
    }

    public void setRelatedTo(String relatedTo) {
        this.relatedTo = relatedTo;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
