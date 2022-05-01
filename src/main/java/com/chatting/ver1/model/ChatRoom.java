package com.chatting.ver1.model;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
public class ChatRoom implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;
    private static final long serialVersionUID = 6494678977089006639L;
    @Column
    private String roomId;
    @Column
    private String name;

    public static ChatRoom create(String name) {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.roomId = UUID.randomUUID().toString();
        chatRoom.name = name;
        return chatRoom;
    }
}