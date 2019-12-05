/*
 * This file is generated by jOOQ.
 */
package test.generated;


import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import test.generated.tables.Author;
import test.generated.tables.Car;
import test.generated.tables.records.AuthorRecord;
import test.generated.tables.records.CarRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>library</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = UniqueKeys0.KEY_AUTHOR_PRIMARY;
    public static final UniqueKey<CarRecord> KEY_CAR_PRIMARY = UniqueKeys0.KEY_CAR_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = Internal.createUniqueKey(Author.AUTHOR, "KEY_author_PRIMARY", Author.AUTHOR.ID);
        public static final UniqueKey<CarRecord> KEY_CAR_PRIMARY = Internal.createUniqueKey(Car.CAR, "KEY_car_PRIMARY", Car.CAR.ID);
    }
}
