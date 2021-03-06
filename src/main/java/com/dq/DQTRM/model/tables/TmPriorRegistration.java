/**
 * This class is generated by jOOQ
 */
package com.dq.DQTRM.model.tables;


import com.dq.DQTRM.model.Dqtrm;
import com.dq.DQTRM.model.tables.records.TmPriorRegistrationRecord;

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
public class TmPriorRegistration extends TableImpl<TmPriorRegistrationRecord> {

    private static final long serialVersionUID = 2141375655;

    /**
     * The reference instance of <code>DQTRM.TM_PRIOR_REGISTRATION</code>
     */
    public static final TmPriorRegistration TM_PRIOR_REGISTRATION = new TmPriorRegistration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TmPriorRegistrationRecord> getRecordType() {
        return TmPriorRegistrationRecord.class;
    }

    /**
     * The column <code>DQTRM.TM_PRIOR_REGISTRATION.FK_TRADEMARK_GID</code>.
     */
    public final TableField<TmPriorRegistrationRecord, String> FK_TRADEMARK_GID = createField("FK_TRADEMARK_GID", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>DQTRM.TM_PRIOR_REGISTRATION.FK_PRIOR_TRADEMARK_GID</code>.
     */
    public final TableField<TmPriorRegistrationRecord, String> FK_PRIOR_TRADEMARK_GID = createField("FK_PRIOR_TRADEMARK_GID", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>DQTRM.TM_PRIOR_REGISTRATION.LOCK_CONTROL_NO</code>.
     */
    public final TableField<TmPriorRegistrationRecord, Integer> LOCK_CONTROL_NO = createField("LOCK_CONTROL_NO", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>DQTRM.TM_PRIOR_REGISTRATION.CREATE_TS</code>.
     */
    public final TableField<TmPriorRegistrationRecord, String> CREATE_TS = createField("CREATE_TS", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>DQTRM.TM_PRIOR_REGISTRATION.CREATE_USER_ID</code>.
     */
    public final TableField<TmPriorRegistrationRecord, String> CREATE_USER_ID = createField("CREATE_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>DQTRM.TM_PRIOR_REGISTRATION.LAST_MOD_TS</code>.
     */
    public final TableField<TmPriorRegistrationRecord, String> LAST_MOD_TS = createField("LAST_MOD_TS", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>DQTRM.TM_PRIOR_REGISTRATION.LAST_MOD_USER_ID</code>.
     */
    public final TableField<TmPriorRegistrationRecord, String> LAST_MOD_USER_ID = createField("LAST_MOD_USER_ID", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * Create a <code>DQTRM.TM_PRIOR_REGISTRATION</code> table reference
     */
    public TmPriorRegistration() {
        this("TM_PRIOR_REGISTRATION", null);
    }

    /**
     * Create an aliased <code>DQTRM.TM_PRIOR_REGISTRATION</code> table reference
     */
    public TmPriorRegistration(String alias) {
        this(alias, TM_PRIOR_REGISTRATION);
    }

    private TmPriorRegistration(String alias, Table<TmPriorRegistrationRecord> aliased) {
        this(alias, aliased, null);
    }

    private TmPriorRegistration(String alias, Table<TmPriorRegistrationRecord> aliased, Field<?>[] parameters) {
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
    public TmPriorRegistration as(String alias) {
        return new TmPriorRegistration(alias, this);
    }

    /**
     * Rename this table
     */
    public TmPriorRegistration rename(String name) {
        return new TmPriorRegistration(name, null);
    }
}
