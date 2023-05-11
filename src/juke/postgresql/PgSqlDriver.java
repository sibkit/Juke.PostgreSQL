package juke.postgresql;

import juke.jdbc.JdbcDriver;
import juke.jdbc.sqlbuilding.SqlBuilder;

public class PgSqlDriver {
    JdbcDriver jdbcDriver;
    public PgSqlDriver() {
        jdbcDriver = new JdbcDriver();
        jdbcDriver.setSqlBuilder(new PgSqlBuilder());
    }


}
