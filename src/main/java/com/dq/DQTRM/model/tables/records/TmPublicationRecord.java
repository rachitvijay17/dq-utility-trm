/**
 * This class is generated by jOOQ
 */
package com.dq.DQTRM.model.tables.records;


import com.dq.DQTRM.model.tables.TmPublication;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class TmPublicationRecord extends TableRecordImpl<TmPublicationRecord> implements Record11<String, String, String, Date, String, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = -798286479;

    /**
     * Setter for <code>DQTRM.TM_PUBLICATION.FK_TRADEMARK_GID</code>.
     */
    public void setFkTrademarkGid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PUBLICATION.FK_TRADEMARK_GID</code>.
     */
    public String getFkTrademarkGid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DQTRM.TM_PUBLICATION.TM_PUBLICATION_GID</code>.
     */
    public void setTmPublicationGid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PUBLICATION.TM_PUBLICATION_GID</code>.
     */
    public String getTmPublicationGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DQTRM.TM_PUBLICATION.ELIGIBLE_TS</code>.
     */
    public void setEligibleTs(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PUBLICATION.ELIGIBLE_TS</code>.
     */
    public String getEligibleTs() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DQTRM.TM_PUBLICATION.OG_ACTION_DT</code>.
     */
    public void setOgActionDt(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PUBLICATION.OG_ACTION_DT</code>.
     */
    public Date getOgActionDt() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>DQTRM.TM_PUBLICATION.LEGACY_OG_STATUS_CD</code>.
     */
    public void setLegacyOgStatusCd(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PUBLICATION.LEGACY_OG_STATUS_CD</code>.
     */
    public String getLegacyOgStatusCd() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DQTRM.TM_PUBLICATION.LOCK_CONTROL_NO</code>.
     */
    public void setLockControlNo(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PUBLICATION.LOCK_CONTROL_NO</code>.
     */
    public Integer getLockControlNo() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DQTRM.TM_PUBLICATION.CREATE_TS</code>.
     */
    public void setCreateTs(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PUBLICATION.CREATE_TS</code>.
     */
    public String getCreateTs() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DQTRM.TM_PUBLICATION.CREATE_USER_ID</code>.
     */
    public void setCreateUserId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PUBLICATION.CREATE_USER_ID</code>.
     */
    public String getCreateUserId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DQTRM.TM_PUBLICATION.LAST_MOD_TS</code>.
     */
    public void setLastModTs(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PUBLICATION.LAST_MOD_TS</code>.
     */
    public String getLastModTs() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DQTRM.TM_PUBLICATION.LAST_MOD_USER_ID</code>.
     */
    public void setLastModUserId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PUBLICATION.LAST_MOD_USER_ID</code>.
     */
    public String getLastModUserId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DQTRM.TM_PUBLICATION.PRINT_MARK_DESCRIPTION_IN</code>.
     */
    public void setPrintMarkDescriptionIn(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>DQTRM.TM_PUBLICATION.PRINT_MARK_DESCRIPTION_IN</code>.
     */
    public String getPrintMarkDescriptionIn() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Date, String, Integer, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Date, String, Integer, String, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TmPublication.TM_PUBLICATION.FK_TRADEMARK_GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TmPublication.TM_PUBLICATION.TM_PUBLICATION_GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TmPublication.TM_PUBLICATION.ELIGIBLE_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return TmPublication.TM_PUBLICATION.OG_ACTION_DT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TmPublication.TM_PUBLICATION.LEGACY_OG_STATUS_CD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TmPublication.TM_PUBLICATION.LOCK_CONTROL_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TmPublication.TM_PUBLICATION.CREATE_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TmPublication.TM_PUBLICATION.CREATE_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TmPublication.TM_PUBLICATION.LAST_MOD_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TmPublication.TM_PUBLICATION.LAST_MOD_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TmPublication.TM_PUBLICATION.PRINT_MARK_DESCRIPTION_IN;
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
        return getTmPublicationGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEligibleTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getOgActionDt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLegacyOgStatusCd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getLockControlNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCreateTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCreateUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLastModTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getLastModUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPrintMarkDescriptionIn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord value1(String value) {
        setFkTrademarkGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord value2(String value) {
        setTmPublicationGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord value3(String value) {
        setEligibleTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord value4(Date value) {
        setOgActionDt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord value5(String value) {
        setLegacyOgStatusCd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord value6(Integer value) {
        setLockControlNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord value7(String value) {
        setCreateTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord value8(String value) {
        setCreateUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord value9(String value) {
        setLastModTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord value10(String value) {
        setLastModUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord value11(String value) {
        setPrintMarkDescriptionIn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmPublicationRecord values(String value1, String value2, String value3, Date value4, String value5, Integer value6, String value7, String value8, String value9, String value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TmPublicationRecord
     */
    public TmPublicationRecord() {
        super(TmPublication.TM_PUBLICATION);
    }

    /**
     * Create a detached, initialised TmPublicationRecord
     */
    public TmPublicationRecord(String fkTrademarkGid, String tmPublicationGid, String eligibleTs, Date ogActionDt, String legacyOgStatusCd, Integer lockControlNo, String createTs, String createUserId, String lastModTs, String lastModUserId, String printMarkDescriptionIn) {
        super(TmPublication.TM_PUBLICATION);

        set(0, fkTrademarkGid);
        set(1, tmPublicationGid);
        set(2, eligibleTs);
        set(3, ogActionDt);
        set(4, legacyOgStatusCd);
        set(5, lockControlNo);
        set(6, createTs);
        set(7, createUserId);
        set(8, lastModTs);
        set(9, lastModUserId);
        set(10, printMarkDescriptionIn);
    }
}