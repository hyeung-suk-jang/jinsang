package com.samplesecurity.repository.reply;


import com.samplesecurity.domain.reply.ReplyAgreeCheck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyAgreeCheckRepository extends JpaRepository<ReplyAgreeCheck, Long> {
    ReplyAgreeCheck findByMemberIdAndReplyId(Long memberId, Long replyId);
}
