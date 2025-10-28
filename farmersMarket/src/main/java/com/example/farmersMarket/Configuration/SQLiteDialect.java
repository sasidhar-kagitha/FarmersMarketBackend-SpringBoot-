package com.example.farmersMarket.Configuration;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.pagination.LimitHandler;
import org.hibernate.dialect.pagination.LimitOffsetLimitHandler;
import org.hibernate.engine.jdbc.Size;
import org.hibernate.type.StandardBasicTypes;

public class SQLiteDialect extends Dialect {

    public SQLiteDialect() {
        super();
        // Example: register basic types
        registerHibernateType(java.sql.Types.VARCHAR, StandardBasicTypes.STRING.getName());
    }

    private void registerHibernateType(int varchar, String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerHibernateType'");
    }

    @Override
    public LimitHandler getLimitHandler() {
        return LimitOffsetLimitHandler.INSTANCE;
    }
}
