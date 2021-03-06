/**
 * This class is generated by jOOQ
 */
package com.dq.DQTRM.model.tables.records;


import com.dq.DQTRM.model.tables.TmAmendment;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class TmAmendmentRecord extends TableRecordImpl<TmAmendmentRecord> implements Record9<String, String, Integer, String, Integer, String, String, String, String> {

    private static final long serialVersionUID = -1734938069;

    /**
     * Setter for <code>DQTRM.TM_AMENDMENT.FK_TRADEMARK_GID</code>.
     */
    public void setFkTrademarkGid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>DQTRM.TM_AMENDMENT.FK_TRADEMARK_GID</code>.
     */
    public String getFkTrademarkGid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DQTRM.TM_AMENDMENT.FK_TM_AMENDMENT_REASON_CD</code>.
     */
    public void setFkTmAmendmentReasonCd(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>DQTRM.TM_AMENDMENT.FK_TM_AMENDMENT_REASON_CD</code>.
     */
    public String getFkTmAmendmentReasonCd() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DQTRM.TM_AMENDMENT.SEQUENCE_NO</code>.
     */
    public void setSequenceNo(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>DQTRM.TM_AMENDMENT.SEQUENCE_NO</code>.
     */
    public Integer getSequenceNo() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>DQTRM.TM_AMENDMENT.TARGET_ELEMENT_TX</code>.
     */
    public void setTargetElementTx(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>DQTRM.TM_AMENDMENT.TARGET_ELEMENT_TX</code>.
     */
    public String getTargetElementTx() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DQTRM.TM_AMENDMENT.LOCK_CONTROL_NO</code>.
     */
    public void setLockControlNo(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>DQTRM.TM_AMENDMENT.LOCK_CONTROL_NO</code>.
     */
    public Integer getLockControlNo() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>DQTRM.TM_AMENDMENT.CREATE_TS</code>.
     */
    public void setCreateTs(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>DQTRM.TM_AMENDMENT.CREATE_TS</code>.
     */
    public String getCreateTs() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DQTRM.TM_AMENDMENT.CREATE_USER_ID</code>.
     */
    public void setCreateUserId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>DQTRM.TM_AMENDMENT.CREATE_USER_ID</code>.
     */
    public String getCreateUserId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DQTRM.TM_AMENDMENT.LAST_MOD_TS</code>.
     */
    public void setLastModTs(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>DQTRM.TM_AMENDMENT.LAST_MOD_TS</code>.
     */
    public String getLastModTs() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DQTRM.TM_AMENDMENT.LAST_MOD_USER_ID</code>.
     */
    public void setLastModUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>DQTRM.TM_AMENDMENT.LAST_MOD_USER_ID</code>.
     */
    public String getLastModUserId() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Integer, String, Integer, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Integer, String, Integer, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TmAmendment.TM_AMENDMENT.FK_TRADEMARK_GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TmAmendment.TM_AMENDMENT.FK_TM_AMENDMENT_REASON_CD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TmAmendment.TM_AMENDMENT.SEQUENCE_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TmAmendment.TM_AMENDMENT.TARGET_ELEMENT_TX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TmAmendment.TM_AMENDMENT.LOCK_CONTROL_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TmAmendment.TM_AMENDMENT.CREATE_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TmAmendment.TM_AMENDMENT.CREATE_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TmAmendment.TM_AMENDMENT.LAST_MOD_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TmAmendment.TM_AMENDMENT.LAST_MOD_USER_ID;
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
        return getFkTmAmendmentReasonCd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSequenceNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTargetElementTx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getLockControlNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCreateTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCreateUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getLastModTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLastModUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmAmendmentRecord value1(String value) {
        setFkTrademarkGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmAmendmentRecord value2(String value) {
        setFkTmAmendmentReasonCd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmAmendmentRecord value3(Integer value) {
        setSequenceNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmAmendmentRecord value4(String value) {
        setTargetElementTx(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmAmendmentRecord value5(Integer value) {
        setLockControlNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmAmendmentRecord value6(String value) {
        setCreateTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmAmendmentRecord value7(String value) {
        setCreateUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmAmendmentRecord value8(String value) {
        setLastModTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmAmendmentRecord value9(String value) {
        setLastModUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmAmendmentRecord values(String value1, String value2, Integer value3, String value4, Integer value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TmAmendmentRecord
     */
    public TmAmendmentRecord() {
        super(TmAmendment.TM_AMENDMENT);
    }

    /**
     * Create a detached, initialised TmAmendmentRecord
     */
    public TmAmendmentRecord(String fkTrademarkGid, String fkTmAmendmentReasonCd, Integer sequenceNo, String targetElementTx, Integer lockControlNo, String createTs, String createUserId, String lastModTs, String lastModUserId) {
        super(TmAmendment.TM_AMENDMENT);

        set(0, fkTrademarkGid);
        set(1, fkTmAmendmentReasonCd);
        set(2, sequenceNo);
        set(3, targetElementTx);
        set(4, lockControlNo);
        set(5, createTs);
        set(6, createUserId);
        set(7, lastModTs);
        set(8, lastModUserId);
    }
}
