/**
 * This class is generated by jOOQ
 */
package com.dq.DQTRAM.model;


import com.dq.DQTRAM.model.tables.TramAm;
import com.dq.DQTRAM.model.tables.TramPr;
import com.dq.DQTRAM.model.tables.TramPx;
import com.dq.DQTRAM.model.tables.TramWp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Dqtram extends SchemaImpl {

    private static final long serialVersionUID = 538132568;

    /**
     * The reference instance of <code>DQTRAM</code>
     */
    public static final Dqtram DQTRAM = new Dqtram();

    /**
     * The table <code>DQTRAM.TRAM_AM</code>.
     */
    public final TramAm TRAM_AM = com.dq.DQTRAM.model.tables.TramAm.TRAM_AM;

    /**
     * The table <code>DQTRAM.TRAM_PR</code>.
     */
    public final TramPr TRAM_PR = com.dq.DQTRAM.model.tables.TramPr.TRAM_PR;

    /**
     * The table <code>DQTRAM.TRAM_PX</code>.
     */
    public final TramPx TRAM_PX = com.dq.DQTRAM.model.tables.TramPx.TRAM_PX;

    /**
     * The table <code>DQTRAM.TRAM_WP</code>.
     */
    public final TramWp TRAM_WP = com.dq.DQTRAM.model.tables.TramWp.TRAM_WP;

    /**
     * No further instances allowed
     */
    private Dqtram() {
        super("DQTRAM", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            TramAm.TRAM_AM,
            TramPr.TRAM_PR,
            TramPx.TRAM_PX,
            TramWp.TRAM_WP);
    }
}
