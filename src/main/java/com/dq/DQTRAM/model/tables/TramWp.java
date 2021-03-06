/**
 * This class is generated by jOOQ
 */
package com.dq.DQTRAM.model.tables;


import com.dq.DQTRAM.model.Dqtram;
import com.dq.DQTRAM.model.tables.records.TramWpRecord;

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
public class TramWp extends TableImpl<TramWpRecord> {

    private static final long serialVersionUID = -1555903713;

    /**
     * The reference instance of <code>DQTRAM.TRAM_WP</code>
     */
    public static final TramWp TRAM_WP = new TramWp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TramWpRecord> getRecordType() {
        return TramWpRecord.class;
    }

    /**
     * The column <code>DQTRAM.TRAM_WP.WP_SER_NUM</code>.
     */
    public final TableField<TramWpRecord, Integer> WP_SER_NUM = createField("WP_SER_NUM", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>DQTRAM.TRAM_WP.WP_WIPO_CD</code>.
     */
    public final TableField<TramWpRecord, String> WP_WIPO_CD = createField("WP_WIPO_CD", org.jooq.impl.SQLDataType.VARCHAR.length(6).defaultValue(org.jooq.impl.DSL.inline(" ", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>DQTRAM.TRAM_WP.WP_RSN</code>.
     */
    public final TableField<TramWpRecord, Integer> WP_RSN = createField("WP_RSN", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>DQTRAM.TRAM_WP</code> table reference
     */
    public TramWp() {
        this("TRAM_WP", null);
    }

    /**
     * Create an aliased <code>DQTRAM.TRAM_WP</code> table reference
     */
    public TramWp(String alias) {
        this(alias, TRAM_WP);
    }

    private TramWp(String alias, Table<TramWpRecord> aliased) {
        this(alias, aliased, null);
    }

    private TramWp(String alias, Table<TramWpRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dqtram.DQTRAM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TramWp as(String alias) {
        return new TramWp(alias, this);
    }

    /**
     * Rename this table
     */
    public TramWp rename(String name) {
        return new TramWp(name, null);
    }
}
