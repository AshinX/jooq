package com.fengyue.jooq;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import test.generated.Tables;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * @author fengyue
 * @date 2019-12-05  下午4:05
 */
public class Test {

    public static void main(String[] args) {
        String userName = "root";
        String password = "19950617";
        String url = "jdbc:mysql://localhost:3306/library";

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            Result<Record> result = create.select().from(Tables.AUTHOR).fetch();
            for (Record r : result) {
                Integer id = r.getValue(Tables.AUTHOR.ID);
                String firstName = r.getValue(Tables.AUTHOR.FIRST_NAME);
                String lastName = r.getValue(Tables.AUTHOR.LAST_NAME);

                System.out.println("ID: " + id + " first name: " + firstName + " last name: " + lastName);
            }
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
