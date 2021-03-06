/**
 * This class is generated by jOOQ
 */
package com.dq.DQTRM.model.tables.records;


import com.dq.DQTRM.model.tables.TmPriorRegistration;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TmPriorRegistrationRecord extends TableRecordImpl<TmPriorRegistrationRecord> implements Record7<String, String, Integer, String, String, String, String> {

    private static final long serialVersionUID = 2020740585;

    /**
     * Setter for <code>DQTRM.TM_PRIOR_REGISTRATION.FK_TRADEMARK_GID</code>.
     */
    public void setFkTrademarkGid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PRIOR_REGISTRATION.FK_TRADEMARK_GID</code>.
     */
    public String getFkTrademarkGid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DQTRM.TM_PRIOR_REGISTRATION.FK_PRIOR_TRADEMARK_GID</code>.
     */
    public void setFkPriorTrademarkGid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PRIOR_REGISTRATION.FK_PRIOR_TRADEMARK_GID</code>.
     */
    public String getFkPriorTrademarkGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DQTRM.TM_PRIOR_REGISTRATION.LOCK_CONTROL_NO</code>.
     */
    public void setLockControlNo(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PRIOR_REGISTRATION.LOCK_CONTROL_NO</code>.
     */
    public Integer getLockControlNo() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>DQTRM.TM_PRIOR_REGISTRATION.CREATE_TS</code>.
     */
    public void setCreateTs(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PRIOR_REGISTRATION.CREATE_TS</code>.
     */
    public String getCreateTs() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DQTRM.TM_PRIOR_REGISTRATION.CREATE_USER_ID</code>.
     */
    public void setCreateUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PRIOR_REGISTRATION.CREATE_USER_ID</code>.
     */
    public String getCreateUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DQTRM.TM_PRIOR_REGISTRATION.LAST_MOD_TS</code>.
     */
    public void setLastModTs(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PRIOR_REGISTRATION.LAST_MOD_TS</code>.
     */
    public String getLastModTs() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DQTRM.TM_PRIOR_REGISTRATION.LAST_MOD_USER_ID</code>.
     */
    public void setLastModUserId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PRIOR_REGISTRATION.LAST_MOD_USER_ID</code>.
     */
    public String getLastModUserId() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Integer, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Integer, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TmPriorRegistration.TM_PRIOR_REGISTRATION.FK_TRADEMARK_GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TmPriorRegistration.TM_PRIOR_REGISTRATION.FK_PRIOR_TRADEMARK_GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TmPriorRegistration.TM_PRIOR_REGISTRATION.LOCK_CONTROL_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TmPriorRegistration.TM_PRIOR_REGISTRATION.CREATE_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TmPriorRegistration.TM_PRIOR_REGISTRATION.CREATE_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TmPriorRegistration.TM_PRIOR_REGISTRATION.LAST_MOD_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TmPriorRegistration.TM_PRIOR_REGISTRATION.LAST_MOD_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFkTrademarkGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFkPriorTrademarkGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLockControlNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCreateTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCreateUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLastModTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLastModUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPriorRegistrationRecord value1(String value) {
        setFkTrademarkGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPriorRegistrationRecord value2(String value) {
        setFkPriorTrademarkGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPriorRegistrationRecord value3(Integer value) {
        setLockControlNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPriorRegistrationRecord value4(String value) {
        setCreateTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPriorRegistrationRecord value5(String value) {
        setCreateUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPriorRegistrationRecord value6(String value) {
        setLastModTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPriorRegistrationRecord value7(String value) {
        setLastModUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPriorRegistrationRecord values(String value1, String value2, Integer value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TmPriorRegistrationRecord
     */
    public TmPriorRegistrationRecord() {
        super(TmPriorRegistration.TM_PRIOR_REGISTRATION);
    }

    /**
     * Create a detached, initialised TmPriorRegistrationRecord
     */
    public TmPriorRegistrationRecord(String fkTrademarkGid, String fkPriorTrademarkGid, Integer lockControlNo, String createTs, String createUserId, String lastModTs, String lastModUserId) {
        super(TmPriorRegistration.TM_PRIOR_REGISTRATION);

        set(0, fkTrademarkGid);
        set(1, fkPriorTrademarkGid);
        set(2, lockControlNo);
        set(3, createTs);
        set(4, createUserId);
        set(5, lastModTs);
        set(6, lastModUserId);
    }
}
