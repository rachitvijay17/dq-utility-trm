/**
 * This class is generated by jOOQ
 */
package com.dq.DQTRM.model.tables;


import com.dq.DQTRM.model.Dqtrm;
import com.dq.DQTRM.model.tables.records.TmAmendmentRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class TmAmendment extends TableImpl<TmAmendmentRecord> {

    private static final long serialVersionUID = 438088967;

    /**
     * The reference instance of <code>DQTRM.TM_AMENDMENT</code>
     */
    public static final TmAmendment TM_AMENDMENT = new TmAmendment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TmAmendmentRecord> getRecordType() {
        return TmAmendmentRecord.class;
    }

    /**
     * The column <code>DQTRM.TM_AMENDMENT.FK_TRADEMARK_GID</code>.
     */
    public final TableField<TmAmendmentRecord, String> FK_TRADEMARK_GID = createField("FK_TRADEMARK_GID", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>DQTRM.TM_AMENDMENT.FK_TM_AMENDMENT_REASON_CD</code>.
     */
    public final TableField<TmAmendmentRecord, String> FK_TM_AMENDMENT_REASON_CD = createField("FK_TM_AMENDMENT_REASON_CD", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

    /**
     * The column <code>DQTRM.TM_AMENDMENT.SEQUENCE_NO</code>.
     */
    public final TableField<TmAmendmentRecord, Integer> SEQUENCE_NO = createField("SEQUENCE_NO", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DQTRM.TM_AMENDMENT.TARGET_ELEMENT_TX</code>.
     */
    public final TableField<TmAmendmentRecord, String> TARGET_ELEMENT_TX = createField("TARGET_ELEMENT_TX", org.jooq.impl.SQLDataType.VARCHAR.length(250), this, "");

    /**
     * The column <code>DQTRM.TM_AMENDMENT.LOCK_CONTROL_NO</code>.
     */
    public final TableField<TmAmendmentRecord, Integer> LOCK_CONTROL_NO = createField("LOCK_CONTROL_NO", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>DQTRM.TM_AMENDMENT.CREATE_TS</code>.
     */
    public final TableField<TmAmendmentRecord, String> CREATE_TS = createField("CREATE_TS", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>DQTRM.TM_AMENDMENT.CREATE_USER_ID</code>.
     */
    public final TableField<TmAmendmentRecord, String> CREATE_USER_ID = createField("CREATE_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>DQTRM.TM_AMENDMENT.LAST_MOD_TS</code>.
     */
    public final TableField<TmAmendmentRecord, String> LAST_MOD_TS = createField("LAST_MOD_TS", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>DQTRM.TM_AMENDMENT.LAST_MOD_USER_ID</code>.
     */
    public final TableField<TmAmendmentRecord, String> LAST_MOD_USER_ID = createField("LAST_MOD_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * Create a <code>DQTRM.TM_AMENDMENT</code> table reference
     */
    public TmAmendment() {
        this("TM_AMENDMENT", null);
    }

    /**
     * Create an aliased <code>DQTRM.TM_AMENDMENT</code> table reference
     */
    public TmAmendment(String alias) {
        this(alias, TM_AMENDMENT);
    }

    private TmAmendment(String alias, Table<TmAmendmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TmAmendment(String alias, Table<TmAmendmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dqtrm.DQTRM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TmAmendment as(String alias) {
        return new TmAmendment(alias, this);
    }

    /**
     * Rename this table
     */
    public TmAmendment rename(String name) {
        return new TmAmendment(name, null);
    }
}
