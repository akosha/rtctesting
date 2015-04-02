package org.bin2.testing.signaling;

/**
 * Created by psimic on 3/25/2015.
 */
public class SignalingMessage {
    public enum Type {
        SDP, CANDIDATE, JOIN, CREATE
    }

    private final Type messageType;
    private final String roomId;

    public SignalingMessage(Type messageType, String roomId) {
        this.messageType = messageType;
        this.roomId = roomId;
    }

    public Type getMessageType() {
        return messageType;
    }

    public String getRoomId() {
        return roomId;
    }
}
