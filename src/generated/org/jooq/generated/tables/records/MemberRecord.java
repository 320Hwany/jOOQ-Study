/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.generated.tables.JMember;
import org.jooq.generated.tables.pojos.Member;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberRecord extends UpdatableRecordImpl<MemberRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>jooq_study.member.member_id</code>.
     */
    public MemberRecord setMemberId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jooq_study.member.member_id</code>.
     */
    public Long getMemberId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>jooq_study.member.login_id</code>.
     */
    public MemberRecord setLoginId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jooq_study.member.login_id</code>.
     */
    public String getLoginId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jooq_study.member.password</code>.
     */
    public MemberRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jooq_study.member.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jooq_study.member.username</code>.
     */
    public MemberRecord setUsername(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jooq_study.member.username</code>.
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jooq_study.member.money</code>.
     */
    public MemberRecord setMoney(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jooq_study.member.money</code>.
     */
    public Long getMoney() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>jooq_study.member.created_at</code>.
     */
    public MemberRecord setCreatedAt(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>jooq_study.member.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>jooq_study.member.last_modified_at</code>.
     */
    public MemberRecord setLastModifiedAt(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>jooq_study.member.last_modified_at</code>.
     */
    public LocalDateTime getLastModifiedAt() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MemberRecord
     */
    public MemberRecord() {
        super(JMember.MEMBER);
    }

    /**
     * Create a detached, initialised MemberRecord
     */
    public MemberRecord(Long memberId, String loginId, String password, String username, Long money, LocalDateTime createdAt, LocalDateTime lastModifiedAt) {
        super(JMember.MEMBER);

        setMemberId(memberId);
        setLoginId(loginId);
        setPassword(password);
        setUsername(username);
        setMoney(money);
        setCreatedAt(createdAt);
        setLastModifiedAt(lastModifiedAt);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised MemberRecord
     */
    public MemberRecord(Member value) {
        super(JMember.MEMBER);

        if (value != null) {
            setMemberId(value.getMemberId());
            setLoginId(value.getLoginId());
            setPassword(value.getPassword());
            setUsername(value.getUsername());
            setMoney(value.getMoney());
            setCreatedAt(value.getCreatedAt());
            setLastModifiedAt(value.getLastModifiedAt());
            resetChangedOnNotNull();
        }
    }
}
