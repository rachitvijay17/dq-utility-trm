/**
 * This class is generated by jOOQ
 */
package com.dq.DQTRAM.model.tables.records;


import com.dq.DQTRAM.model.tables.TramWp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class TramWpRecord extends TableRecordImpl<TramWpRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 192136451;

    /**
     * Setter for <code>DQTRAM.TRAM_WP.WP_SER_NUM</code>.
     */
    public void setWpSerNum(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>DQTRAM.TRAM_WP.WP_SER_NUM</code>.
     */
    public Integer getWpSerNum() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>DQTRAM.TRAM_WP.WP_WIPO_CD</code>.
     */
    public void setWpWipoCd(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>DQTRAM.TRAM_WP.WP_WIPO_CD</code>.
     */
    public String getWpWipoCd() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DQTRAM.TRAM_WP.WP_RSN</code>.
     */
    public void setWpRsn(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>DQTRAM.TRAM_WP.WP_RSN</code>.
     */
    public Integer getWpRsn() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TramWp.TRAM_WP.WP_SER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TramWp.TRAM_WP.WP_WIPO_CD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TramWp.TRAM_WP.WP_RSN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getWpSerNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getWpWipoCd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getWpRsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TramWpRecord value1(Integer value) {
        setWpSerNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TramWpRecord value2(String value) {
        setWpWipoCd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TramWpRecord value3(Integer value) {
        setWpRsn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TramWpRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TramWpRecord
     */
    public TramWpRecord() {
        super(TramWp.TRAM_WP);
    }

    /**
     * Create a detached, initialised TramWpRecord
     */
    public TramWpRecord(Integer wpSerNum, String wpWipoCd, Integer wpRsn) {
        super(TramWp.TRAM_WP);

        set(0, wpSerNum);
        set(1, wpWipoCd);
        set(2, wpRsn);
    }
}
