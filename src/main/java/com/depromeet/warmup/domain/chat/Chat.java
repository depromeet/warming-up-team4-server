package com.depromeet.warmup.domain.chat;

import com.depromeet.warmup.domain.user.User;
import com.depromeet.warmup.global.entity.CreateAuditEntity;
import com.depromeet.warmup.global.entity.ProtobufConverter;
import com.depromeet.warmup.grpc.entity.ChatMessageOuterClass;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table
@Entity
public class Chat extends CreateAuditEntity implements ProtobufConverter<ChatMessageOuterClass.ChatMessage> {

    @Getter
    @Column(nullable = false)
    private String message;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "from", referencedColumnName = "id")
    private User from;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "to", referencedColumnName = "id")
    private User to;

    @Builder
    private Chat(final String message,
                 final User from,
                 final User to) {
        this.message = message;
        this.from = from;
        this.to = to;
    }

    @Override
    public ChatMessageOuterClass.ChatMessage toProtoBuf() {
        return ChatMessageOuterClass.ChatMessage.newBuilder()
                .setId(getId())
                .setMessage(message)
                .setFrom(from.toProtoBuf())
                .setTo(from.toProtoBuf())
                .setCreatedDate(getCreatedDateMillis())
                .build();
    }
}

