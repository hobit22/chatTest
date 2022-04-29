package com.chatting.ver1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class ChatMessage {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;
    // 메시지 타입 : 입장, 채팅

    public enum MessageType {
        ENTER, TALK, JOIN
    }
    @Column
    private MessageType type; // 메시지 타입
    @Column
    private String roomId; // 방번호
    @Column
    private String sender; // 메시지 보낸사람
    @Column
    private String message; // 메시지
}